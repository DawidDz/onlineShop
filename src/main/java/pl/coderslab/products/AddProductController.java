package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddProductController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct() {
        return "add";
    }
}