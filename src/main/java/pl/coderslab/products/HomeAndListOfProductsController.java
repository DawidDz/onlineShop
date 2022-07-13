package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.category.CategoryRepository;

@Controller
public class HomeAndListOfProductsController {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public HomeAndListOfProductsController(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homeAndListOfProducts(Model model) {
        model.addAttribute("product", productRepository.findAll());
        model.addAttribute("category", categoryRepository.findAll());
        return "home";
    }
}