package pe.edu.idat.app_ventas_idat.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Idusuario;
    private String nomusuario;
    private String nombres;
    private String apellidos;
    private boolean activo;
}
