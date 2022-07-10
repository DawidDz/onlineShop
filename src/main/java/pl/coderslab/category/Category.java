package pl.coderslab.category;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.products.Product;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCategory;
    @OneToOne
    private Product products;
}