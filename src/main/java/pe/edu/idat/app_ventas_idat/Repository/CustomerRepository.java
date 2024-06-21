package pe.edu.idat.app_ventas_idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.app_ventas_idat.model.bd.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
