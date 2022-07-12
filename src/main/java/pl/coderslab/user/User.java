package pl.coderslab.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String textArea;
    private double loyaltyDiscount;
    public User(String name, String surname, String email, String textArea) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.textArea = textArea;
    }
}