package pe.edu.idat.app_ventas_idat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.Repository.CategoryRepository;
import pe.edu.idat.app_ventas_idat.model.bd.Category;

import java.util.List;
@AllArgsConstructor
@Service
public class CategoryService implements ICategoryService{
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> listarCategorias() {
        return categoryRepository.findAll();
    }

    @Override
    public Category guardarCategoria(Category category) {
        return categoryRepository.save(category);
    }
}
