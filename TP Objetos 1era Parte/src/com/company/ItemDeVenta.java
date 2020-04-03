package com.company;

public class ItemDeVenta {
    private int id;
    private int cantidad;
    private String descripcion;
    private double precioUnitario;

    public ItemDeVenta(int id, int cantidad, String descripcion, double precioUnitario) {
        this.id = id;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }
    public void mostrarItem(){
        System.out.println("ItemVenta[id="+id+", cantidad="+cantidad+", descripcion= "+descripcion+", precioUnitario="+precioUnitario);
    }
    public void calcularPrecio(){
        double precio = precioUnitario*cantidad;
        System.out.println("Precio total ="+precio);
    }
}
