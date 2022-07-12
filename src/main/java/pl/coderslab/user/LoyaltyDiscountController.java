package pl.coderslab.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoyaltyDiscountController {

    @RequestMapping(value = "/loyalty", method = RequestMethod.GET)
    public String homeList() {
        return "loyaltydis";
    }
}