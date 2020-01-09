package com.jasson;

import javax.swing.*;

public class ejercicio1 {
    public double distancia;
    public int dias_estncia;
    public double descuento;
    public double precio;
    private final static double preciokm = 35.00;

    public ejercicio1(double distancia, int dias_estncia) {
        this.distancia = distancia;
        this.dias_estncia = dias_estncia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getDias_estncia() {
        return dias_estncia;
    }

    public void setDias_estncia(int dias_estncia) {
        this.dias_estncia = dias_estncia;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void conocerprecio(){
        precio = preciokm*distancia;
        if(distancia>1000 && dias_estncia>7){
            aplcardescuento(distancia);
        }else{
            JOptionPane.showMessageDialog(null,"El precio de su tiquete es de: " +" $"+ precio);
        }
    }

    private double aplcardescuento(double distancia){
        precio = preciokm*distancia;
        double preciocondcto;
        double dcto = precio*0.30;
        preciocondcto = precio-dcto;
        JOptionPane.showMessageDialog(null,"El precio de su tiquete era: "+" $"+precio+"\n"+" pero ha si beneficiario de un descuento del 30%\n"+
                "el precio de su tiquete ahora es de: " +" $" +preciocondcto + "\n"+ "Su descuento fue de: " + " $"+dcto);
        return preciocondcto;
    }
}
