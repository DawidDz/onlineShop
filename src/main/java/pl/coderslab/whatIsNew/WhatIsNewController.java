package pl.coderslab.whatIsNew;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WhatIsNewController {

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String homeList() {
        return "new";
    }
}