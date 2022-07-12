package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditProductController {

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String promotions() {
        return "edit";
    }
}