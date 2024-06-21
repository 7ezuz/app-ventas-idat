package pe.edu.idat.app_ventas_idat.services;

import pe.edu.idat.app_ventas_idat.model.bd.Category;
import pe.edu.idat.app_ventas_idat.model.bd.Product;

import java.util.List;

public interface IProductService {
    List<Product> listarCategorias();
    Product guardarCategoria(Product product);
}
