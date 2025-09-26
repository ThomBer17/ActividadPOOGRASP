package e;

public class Ventas {

    private String nombreCliente;
    private String nombreProducto;
    private int cantidad;

    public Ventas(String nombreCliente, String nombreProducto, int cantidad) {
        this.nombreCliente = nombreCliente;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void vender(Productos producto, int cantidad) {
        this.cantidad += cantidad;
        System.out.println("Venta realizada: " + cantidad + " unidades de " + producto.getNombre() + ". Total: $" + cantidad * producto.getPrecio());
    }



}
