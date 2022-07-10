package pl.coderslab.promotion;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.products.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "promotions")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double priceWithPromotion;
    @OneToMany
    @JoinTable(
            name="products_on_promotion"
    )
    private List<Product> products = new ArrayList<>();
}