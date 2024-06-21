package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "categories")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CategoryId;
    private String Categoyname;
    private String description;
    private boolean discontinued;
    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;

}
