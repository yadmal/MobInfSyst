package ru.tsystems.mis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.model.Tariff;
import ru.tsystems.mis.spring.service.interfaces.OptionService;
import ru.tsystems.mis.spring.service.interfaces.TariffService;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    OptionService optionService;

    @Autowired
    TariffService tariffService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView("loggin");
    }

    @RequestMapping(value = "/options", method = RequestMethod.GET)
    public ModelAndView optionsInformation(){
        List<Option> list = optionService.listOptions();
        return new ModelAndView("options", "optionList", list);
    }

    @RequestMapping(value = "/tariffs", method = RequestMethod.GET)
    public ModelAndView tariffsInformation(){
        List<Tariff> list = tariffService.listTariffs();
        return new ModelAndView("tariffs", "tariffsList", list);
    }
}
