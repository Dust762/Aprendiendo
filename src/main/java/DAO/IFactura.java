package DAO;

import DTO.Cliente;
import DTO.Factura;

public interface IFactura {
    public Factura generarFactura(Cliente c);
}
