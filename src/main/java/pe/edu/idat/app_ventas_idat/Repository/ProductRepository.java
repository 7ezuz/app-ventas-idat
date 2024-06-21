package pe.edu.idat.app_ventas_idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.idat.app_ventas_idat.model.bd.Product;
import pe.edu.idat.app_ventas_idat.model.bd.Supplier;

@Repository
public interface ProductRepository extends JpaRepository<Supplier, Integer> {
}
