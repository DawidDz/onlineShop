package pl.coderslab.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.category.CategoryRepository;

import javax.validation.Valid;

@Controller
public class EditProductController {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public EditProductController(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEditForm(@PathVariable long id, Model model) {
        model.addAttribute("product", productRepository.findById(id));
        model.addAttribute("category", categoryRepository.findAll());
        return "edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editProduct(Product product) {
        productRepository.save(product);
        return "redirect:/";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable long id) {
        productRepository.deleteById(id);
        return "redirect:/";
    }
}