package com.company;

import java.util.UUID;

public class Cliente {
    public int descuento;
    private String id;
    private String nombre;
    private String email;
    private char genero;


    public Cliente (String nombre, String email, int descuento,char genero) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
        this.genero = genero;
    }
    public void showClient(){
        System.out.println("Cliente[id="+id+", nombre="+nombre+", email="+email+", descuento="+descuento+"]");
    }

    public String getNombre() {
        return nombre;
    }
}
