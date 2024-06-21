package pe.edu.idat.app_ventas_idat.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ProductOrderld implements Serializable {
    private Integer orderId;
    private Integer productId;

}
