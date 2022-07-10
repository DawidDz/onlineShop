package pl.coderslab.products;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.category.Category;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private double quantity;
    private boolean newLimitedProduct;
    @OneToOne
    private Category category;
}