package pl.coderslab.promotion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PromotionController {

    @RequestMapping(value = "/promotions", method = RequestMethod.GET)
    public String promotions() {
        return "promotions";
    }
}