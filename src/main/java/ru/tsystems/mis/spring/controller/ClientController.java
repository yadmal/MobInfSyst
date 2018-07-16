package ru.tsystems.mis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

    @RequestMapping("/myContracts")
    public void clientContracts(){}

    @RequestMapping(value = "/index")
    public String index() {
        return "client/clientIndex";
    }

}
