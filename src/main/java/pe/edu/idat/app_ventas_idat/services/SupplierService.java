package pe.edu.idat.app_ventas_idat.services;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.Repository.SupplierRepository;
import pe.edu.idat.app_ventas_idat.model.bd.Supplier;

import java.util.List;

@Service
public class SupplierService implements IsupplierService{
    private SupplierRepository supplierRepository;
    @Override
    public List<Supplier> listarProveedores() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier guardarProveedor(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
