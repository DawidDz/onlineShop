package pl.coderslab.contact;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.coderslab.user.User;

import javax.validation.Valid;

@Controller
public class ContactFormController {

    @RequestMapping(value = "/formsuccess", method = RequestMethod.POST)
    public String contactFormSend(@RequestParam String name, @RequestParam String surname,
                                  @RequestParam String email, @RequestParam String textArea, Model model) {
        User user = new User(name, surname, email, textArea);
        model.addAttribute("user", user);
        return "success";
    }
}