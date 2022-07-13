package pl.coderslab.promotion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.category.CategoryRepository;
import pl.coderslab.products.Product;
import pl.coderslab.products.ProductRepository;

@Controller
public class PromotionController {

    private final ProductRepository productRepository;
    private final PromotionRepository promotionRepository;

    public PromotionController(ProductRepository productRepository, PromotionRepository promotionRepository) {
        this.productRepository = productRepository;
        this.promotionRepository = promotionRepository;
    }

    @RequestMapping(value = "/promotions", method = RequestMethod.GET)
    public String listOfProductsOnPromotion(Model model) {
        model.addAttribute("product", productRepository.findAll());
        model.addAttribute("promotion", promotionRepository.findAll());
        return "promotions";
    }
}