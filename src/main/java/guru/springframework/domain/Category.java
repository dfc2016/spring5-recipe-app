package guru.springframework.domain;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
