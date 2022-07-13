package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.category.CategoryRepository;

import javax.validation.Valid;

@Controller
public class AddProductController {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public AddProductController(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("category", categoryRepository.findAll());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProduct(@Valid Product product, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        productRepository.save(product);
        return "redirect:/";
    }
}