package ru.tsystems.mis.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.tsystems.mis.spring.model.Client;
import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.model.Role;
import ru.tsystems.mis.spring.model.Tariff;
import ru.tsystems.mis.spring.service.interfaces.ClientService;
import ru.tsystems.mis.spring.service.interfaces.OptionService;
import ru.tsystems.mis.spring.service.interfaces.SecurityService;
import ru.tsystems.mis.spring.service.interfaces.TariffService;
import ru.tsystems.mis.spring.validator.ClientValidator;

import java.util.Collection;
import java.util.List;

@Controller
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private ClientService clientService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private ClientValidator clientValidator;

    @Autowired
    OptionService optionService;

    @Autowired
    TariffService tariffService;


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("clientForm", new Client());

        return "main/registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("clientForm") Client clientForm, BindingResult bindingResult, Model model) {
        clientValidator.validate(clientForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "main/registration";
        }

        clientService.addClient(clientForm);

        securityService.autoLogin(clientForm.getUsername(), clientForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("message", "Logged out successfully.");
        }

        return "main/login";
    }

    @RequestMapping(value = {"/welcome"})
    public String welcome(SecurityContextHolder auth){

        Collection<? extends GrantedAuthority> granted = auth.getContext().getAuthentication().getAuthorities();

        String role;
        for(int i=0;i<granted.size();i++){

            role = granted.toArray()[i] + "";

            logger.info("role verified " + i + " is -> " + role);
            if(role.equals("ROLE_ADMIN")){
                logger.warn("IDENTIFIED: ROLE OF ACCOUNT = " + role );
                return "administrator/administratorIndex";
            }
            if(role.equals("ROLE_MANAGER")){
                logger.warn("IDENTIFIED: ROLE OF ACCOUNT = " + role );
                return "manager/managerIndex";
            }
            if(role.equals("ROLE_USER")){
                logger.warn("IDENTIFIED: ROLE OF ACCOUNT = " + role );
                return "client/clientIndex";
            }
        }

        throw new RuntimeException("ROLE WASN'T FOUND");
    }
}
