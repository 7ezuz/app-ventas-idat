package pe.edu.idat.app_ventas_idat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.Repository.CategoryRepository;
import pe.edu.idat.app_ventas_idat.Repository.ProductRepository;
import pe.edu.idat.app_ventas_idat.model.bd.Category;
import pe.edu.idat.app_ventas_idat.model.bd.Product;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService implements IProductService{
    private ProductRepository productRepository;

    @Override
    public List<Product> listarCategorias() {
        return null;
    }

    @Override
    public Product guardarCategoria(Category category) {
        return null;
    }
}
