package ru.tsystems.mis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.model.Tariff;
import ru.tsystems.mis.spring.service.implementations.OptionServiceImpl;
import ru.tsystems.mis.spring.service.implementations.TariffServiceImpl;
import ru.tsystems.mis.spring.service.interfaces.OptionService;
import ru.tsystems.mis.spring.service.interfaces.TariffService;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdministratorController {

    @Autowired
    OptionService optionService;

    @Autowired
    TariffService tariffService;


    @RequestMapping(value = "/newManager")
    public ModelAndView addNewManager() {
        return new ModelAndView("administrator/administratorAddNewManager", "newOption", new Option());
    }

    @RequestMapping(value = "/newOption")
    public ModelAndView addNewOption() {
        return new ModelAndView("administrator/administratorAddNewOption", "newOption", new Option());
    }

    @RequestMapping(value = "/newTariff")
    public ModelAndView addNewTariff() {
        return new ModelAndView("administrator/administratorAddNewTariff", "newTariff", new Tariff());
    }

    @RequestMapping(value = "/optionsList", method = RequestMethod.GET)
    public ModelAndView getOptionList() {
        List<Option> optionList = optionService.listOptions();
        return new ModelAndView("administrator/administratorOptionList", "optionList", optionList);
    }

    @RequestMapping(value = "/tariffsList", method = RequestMethod.GET)
    public ModelAndView getTariffList() {
        List<Tariff> tariffList = tariffService.listTariffs();
        return new ModelAndView("administrator/administratorTariffList", "tariffList", tariffList);
    }

    @RequestMapping(value = "/deleteOption/{id}")
    public String deleteOption(@PathVariable("id") Long id){
        optionService.deleteOption(id);
        return "redirect:/admin/optionsList";
    }

    @RequestMapping(value = "/deleteTariff/{id}")
    public String deleteTariff(@PathVariable("id") Long id){
        tariffService.deleteTariff(id);
        return "redirect:/admin/tariffsList";
    }
}
