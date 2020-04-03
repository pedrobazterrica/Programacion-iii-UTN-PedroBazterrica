package com.company;

public class Cuenta {
    private static int contador = 0;
    private double balance;
    private Cliente cliente;
    private int id;
    private String[] registro;
    private int i;

    public Cuenta(double balance,Cliente cliente){
        this.balance = balance;
        this.cliente = cliente;
        contador++;
        this.id = contador;
        this.registro = new String[10];
        this.i = 0;
    }

    public void depositar(double platita){
        balance+=platita;
        registrarDeposito(platita);
    }
    public void extraer(double platita){
        if(platita-2000>balance){
            System.out.println("No hay suficiente dinero...");
        }else{
            balance-=platita;
        }
        registrarExtraccion(platita);
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
    private void registrarDeposito(double platita){
        if(i<10) {
            registro[i] = "El cliente " + cliente.getNombre() + ", depositó " + platita;
            i++;
        }
    }
    private void registrarExtraccion(double platita){
        if(i<10) {
            registro[i] = "El cliente " + cliente.getNombre() + ", extrajo " + platita;
            i++;
        }
    }
    public void mostrarRegistro(){
        for(int f=0;f<i;f++){
            System.out.println(registro[f]);
        }
    }
}
