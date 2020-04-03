package com.company;

import java.util.UUID;

public class ItemVenta {
    private String id;
    private String nombre;
    private String descripcion;
    public float precioUnitario;

    public ItemVenta(String nombre, String descripcion,float precioUnitario) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }
}
