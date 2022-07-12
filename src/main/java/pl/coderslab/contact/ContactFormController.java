package pl.coderslab.contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactFormController {

    @RequestMapping(value = "/conform", method = RequestMethod.POST)
    public String contactFormSend() {
        return "success";
    }
}