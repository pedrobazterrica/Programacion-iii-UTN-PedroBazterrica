package com.company;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }
    public void mostrarAutor(){
        System.out.println("\tNombre="+nombre+", Apellido="+apellido+", Email="+email+", genero="+genero);
    }
}
