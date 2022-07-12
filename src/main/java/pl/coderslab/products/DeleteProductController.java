package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteProductController {

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteProduct() {
        return "redirect:home";
    }
}