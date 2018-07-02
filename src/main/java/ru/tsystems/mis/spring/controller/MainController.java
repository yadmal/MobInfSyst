package ru.tsystems.mis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.service.OptionService;

import java.util.List;
import java.util.Random;

@Controller
public class MainController {

    @Autowired
    OptionService optionService;

    @RequestMapping(value = "/kjh")
    public String main(){
        return "index";
    }

    @RequestMapping(value = "/")
    public String addOption(ModelMap map){
//        Option option = generateOption();
//        optionService.add(option);
//        List<Option> list = optionService.list();
//
//
//        map.addAttribute("list", list);
        return "index";
    }

//    private Option generateOption(){
//
//        return new Option("hdjhgd", "ssdfsdfs", 22.2, 11.1);
//
//    }

}
