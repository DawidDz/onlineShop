package pl.coderslab.logout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

    @RequestMapping(value = "/logouted", method = RequestMethod.GET)
    public String logout() {
        return "logouted";
    }
}