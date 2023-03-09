package DTO;

import DAO.IFactura;

public class Factura implements IFactura{
    private int id = 0, contadorFac = 0;
    private Cliente c = null;
    private String nombreCliente;
    private int total = 0;
    
    public Factura(Cliente c){
        this.id = ++contadorFac;
        this.nombreCliente = c.getNombre() + " " + c.getApellido();
        
    }

    @Override
    public Factura generarFactura(Cliente c) {
        Factura f = new Factura(c);
        
        
        return f;
    }
}
