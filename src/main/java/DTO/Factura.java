package DTO;

import DAO.IFactura;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Factura implements IFactura{
    private int id = 0, contadorFac = 0;
    private Cliente c = null;
    private String nombreCliente;
    private int total = 0;
    
  
    @Override
    public Factura generarFactura(Cliente c) {
        this.nombreCliente = c.getNombre() + " " + c.getApellido();
        int contador = 0;
        for (int i = 0; i < c.getProductos().size(); i++) {
            System.out.println("Productos:");
            System.out.println("ID: " + c.getProductos().get(i).getIdProd());
            System.out.println("Nombre: " + c.getProductos().get(i).getNombre());
            System.out.println("Precio: " + c.getProductos().get(i).getPrecio());
        }
        Set<Producto> setTmp = new HashSet<Producto>(c.getProductos());
        for (Producto producto : setTmp) {
            System.out.println(producto.toString() + " \n");
        }
        return null;
    }
    
    private boolean revisarExistencia(List<Producto> lista, Producto p){
        return true;
    }
}
