package com.company;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(int dni, double salario, String nombre, String apellido){
        this.dni = dni;
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }


    public void salarioAnual(){
        double anual = this.salario*12;
        System.out.println("Su salario anual es de: "+anual);
    }
    public void aumento(double porcentaje){
        this.salario += salario * porcentaje;
    }
    public void mostrarEmpleado(){
        System.out.println("Empleado[dni="+dni+", nombre="+nombre+", apellido="+apellido+", salario="+salario);
    }
}
