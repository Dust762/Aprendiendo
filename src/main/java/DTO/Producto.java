package DTO;

public class Producto {
    private int idProd;
    private String nombre;
    private String marca;
    private int cantidad;
    private int contadorProd;

    public Producto(String nombre, String marca, int cantidad){
        this.idProd = ++contadorProd;
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
    }
    
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd + ", nombre=" + nombre + ", marca=" + marca + ", cantidad=" + cantidad + '}';
    }
    
    
}