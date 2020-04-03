package com.company;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    public Autor[] autores;

    public Libro(String titulo, double precio, int stock, Autor[] autors) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autors;

    }
    public void mostrarLibro(){
        System.out.println("Titulo:"+titulo+", Precio:"+precio+", Stock:"+stock+",\nAutores:{");
        for(int i=0;i<autores.length;i++){
            autores[i].mostrarAutor();
        }
        System.out.println("\t}");
    }
    public String nombrarAutores(){
        String frase = "{";
        for(int i=0;i<autores.length;i++){
            frase = frase.concat(autores[i].getNombre()+" "+autores[i].getApellido()+", ");
        }
        frase = frase.concat("}");
        return frase;
    }
    public void mensaje(){
        System.out.println("El libro,"+titulo+" de "+nombrarAutores()+" Se vende a "+precio+" pesos.");
    }
}
