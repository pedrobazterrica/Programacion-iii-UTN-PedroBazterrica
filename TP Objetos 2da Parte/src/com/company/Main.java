package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	   /* EJERCICIO 1
	    Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com",'M');
	    autor1.mostrarAutor();
	    Autor autor2 = new Autor("Marquitos","Capo","elmaskpo@email.com",'F');
	    Autor[] autors = new Autor[]{autor1, autor2};
        Libro libro1 = new Libro("Effective Java",450,150, autors);
	    libro1.mostrarLibro();
	    libro1.mensaje();


	        EJERCICIO 2
        Cliente client1 = new Cliente("Pedro","pedrokpo@email.com",25,'M');
        ItemVenta item1 = new ItemVenta("caca","mucha caca",245);
        ItemVenta item2 = new ItemVenta("pis","mucho pis",360);
        Factura recipe = new Factura(LocalDate.now(),client1, new ItemVenta[]{item1, item2});
        client1.showClient();
        recipe.showRecipe();

	    */

        Cliente client1 = new Cliente("Pedro","pedrokpo@email.com",25,'M');
        Cuenta cuenta1 = new Cuenta(10000,client1);
        cuenta1.extraer(5000);
        cuenta1.depositar(600);
        cuenta1.extraer(450);
        cuenta1.depositar(6500);
        cuenta1.mostrarRegistro();

    }
}
