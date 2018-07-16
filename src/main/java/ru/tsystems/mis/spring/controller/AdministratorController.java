package ru.tsystems.mis.spring.controller;

import com.mysql.fabric.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.tsystems.mis.spring.model.Client;
import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.model.Tariff;
import ru.tsystems.mis.spring.service.interfaces.ClientService;
import ru.tsystems.mis.spring.service.interfaces.OptionService;
import ru.tsystems.mis.spring.service.interfaces.TariffService;

import java.beans.PropertyEditorSupport;
import java.util.List;

/**
 * Controller for administrators
 */

@Controller
@RequestMapping("/admin")
public class AdministratorController extends PropertyEditorSupport {

    @Autowired
    OptionService optionService;

    @Autowired
    TariffService tariffService;

    @Autowired
    ClientService clientService;


    @RequestMapping(value = "/newTariff", method = RequestMethod.GET)
    public ModelAndView addNewTariff() {
        return new ModelAndView("administrator/administratorAddNewTariff", "newTariff", new Tariff());
    }

    @RequestMapping(value = "/saveNewTariff", method = RequestMethod.POST)
    public String saveNewTariff(@ModelAttribute("newTariff") Tariff tariff) {
        tariffService.addTariff(tariff);
        return "redirect:/admin/tariffsList";

    }

    @RequestMapping(value = "/updateTariff/{id}")
    public ModelAndView updateTariff(@PathVariable("id") Long id){
        return new ModelAndView("administrator/administratorUpdateTariff",
                "updateTariff", tariffService.getTariffById(id));
    }

    @RequestMapping(value = "/updateTariff/saveUpdatedTariff", method = RequestMethod.POST)
    public String saveUpdatedTariff(@ModelAttribute Tariff tariff){
        tariffService.updateTariff(tariff);
        return "redirect:/admin/tariffsList";
    }


    @RequestMapping(value = "/saveUpdatedTariff", method = RequestMethod.POST)
    public String saveUpdatedTariff2(@ModelAttribute Tariff tariff){
        tariffService.updateTariff(tariff);
        return "redirect:/admin/tariffsList";
    }

    @RequestMapping(value = "/deleteTariff/{id}", method = RequestMethod.GET)
    public String deleteTariff(@PathVariable("id") Long id){
        tariffService.deleteTariff(id);
        return "redirect:/admin/tariffsList";
    }

    @RequestMapping(value = "/tariffsList", method = RequestMethod.GET)
    public ModelAndView getTariffList() {
        List<Tariff> tariffList = tariffService.listTariffs();
        return new ModelAndView("administrator/administratorTariffList", "tariffList", tariffList);
    }



    @RequestMapping(value = "/newOption", method = RequestMethod.GET)
    public ModelAndView addNewOption() {
        return new ModelAndView("administrator/administratorAddNewOption", "newOption", new Option());
    }

    @RequestMapping(value = "/saveNewOption", method = RequestMethod.POST)
    public String saveNewOption(@ModelAttribute("newOption") Option option) {
        optionService.addOption(option);
        return "redirect:/admin/optionsList";

    }

    @RequestMapping(value = "/updateOption/{id}", method = RequestMethod.GET)
    public ModelAndView updateOption(@PathVariable("id") Long id){
        return new ModelAndView("administrator/administratorUpdateOption",
                "updateOption", optionService.getOptionById(id));
    }

    @RequestMapping(value = "updateOption/saveUpdatedOption", method = RequestMethod.POST)
    public String saveUpdetedOption(@ModelAttribute("updateOption") Option option){
        optionService.updateOption(option);
        return "redirect:/admin/optionsList";
    }

    @RequestMapping(value = "/deleteOption/{id}", method = RequestMethod.GET)
    public String deleteOption(@PathVariable("id") Long id){
        optionService.deleteOption(id);
        return "redirect:/admin/optionsList";
    }

    @RequestMapping(value = "/optionsList", method = RequestMethod.GET)
    public ModelAndView getOptionList() {
        List<Option> optionList = optionService.listOptions();
        return new ModelAndView("administrator/administratorOptionList", "optionList", optionList);
    }

    @RequestMapping(value = "/newManager")
    public ModelAndView addNewManager() {
        return new ModelAndView("administrator/administratorAddNewManager", "newManager", new Client());
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "administrator/administratorIndex";
    }


}
