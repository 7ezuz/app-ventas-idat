package pe.edu.idat.app_ventas_idat.services;

import pe.edu.idat.app_ventas_idat.model.bd.Supplier;

import java.util.List;

public interface IsupplierService {

    List<Supplier> listarProveedores();

    Supplier guardarProveedor(Supplier supplier);
}
