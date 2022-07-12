package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeAndListOfProductsController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homeAndList(Model model, @RequestParam Long id) {
        model.addAttribute("products", ProductRepository.findById(id));
        return "home";
    }
}