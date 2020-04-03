package com.company;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = getHora(hora);
        this.minuto = getMinuto(minuto);
        this.segundo = getSegundo(segundo);
    }

    public int getHora(int hora) {
        if(hora>-1 && hora<24){
            return hora;
        }else{
            System.out.println("Hora mal ingresada");
            return 0;
        }

    }

    public int getMinuto(int minuto) {
        if(minuto>-1 && minuto<60){
            return minuto;
        }else{
            System.out.println("Minuto mal ingresado");
            return 0;
        }

    }

    public int getSegundo(int segundo) {
        if(segundo>-1 && segundo<60){
            return segundo;
        }else{
            System.out.println("Segundo mal ingresado");
            return 0;
        }

    }
    private String addCero(int valor){
        String rta;
        if(valor<10){
            rta = "0"+valor;
        }else{
            rta = ""+valor;
        }
        return rta;
    }
    public void avanzarUnSegundo(){
        segundo++;
        if(segundo==60){
            segundo = 0;
            minuto++;
        }
        if(minuto==60){
            minuto = 0;
            hora++;
        }
        if(hora == 24){
            hora = 0;
        }
        mostrarHora();
    }
    public void mostrarHora(){
        System.out.println(addCero(hora)+":"+addCero(minuto)+":"+addCero(segundo));
    }
}
