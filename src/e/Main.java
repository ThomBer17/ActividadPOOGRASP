package e;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Silla", 1000);
        Producto p2 = new Producto("Mesa", 2500);

        Ventas ventas = new Ventas();
        Compras compras = new Compras();

        ventas.venderProducto(p1, 5);
        compras.comprarProducto(p2, 3);

        System.out.println("Total vendido: $" + ventas.getTotalVendido());
        System.out.println("Total comprado: $" + compras.getTotalComprado());
    }
}