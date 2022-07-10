package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloHtml() {
        return "hello";
    }
}