package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    private String id;
    private LocalDate date;
    public Cliente cliente;
    private ItemVenta[] Items;
    private float montoFinal;
    private float montoTotal;
    public Factura(LocalDate date, Cliente cliente, ItemVenta[] Items) {
        this.id = UUID.randomUUID().toString();
        this.date = date;
        this.cliente = cliente;
        this.Items = Items;
        for(int i = 0;i<Items.length;i++) {

            montoTotal += Items[i].precioUnitario;
        }
    }

    public String getMontoFinal(){
        this.montoFinal = montoTotal-montoTotal*cliente.descuento/100;
        String frase = "";
        frase = frase.concat("Valor final es : "+montoFinal);
        return frase;
    }
    public void showRecipe(){
        System.out.println("Factura[id="+id+", monto="+montoTotal+", montoDesc="+getMontoFinal()+", ");
        cliente.showClient();
        System.out.println("]");
    }
}
