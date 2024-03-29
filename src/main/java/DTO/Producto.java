package DTO;

public class Producto {
    private int idProd;
    private String nombre;
    private String marca;
    private int cantidad;
    static private int contadorProd;
    private int precio;
    public Producto(String nombre, String marca, int cantidad, int precio){
        this.idProd = ++Producto.contadorProd;
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd + ", nombre=" + nombre + ", marca=" + marca + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

    
    
    
}
