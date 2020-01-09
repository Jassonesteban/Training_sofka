package com.jasson;

import java.util.ArrayList;

public class AvionCarga {
    private final int cargamax = 18000;
    public double pesobulto;
    public double preciokilo;
    public double numerobultostotal;
    public int tamaño;
    AvionCarga siguiente;


    public int getCargamax() {
        return cargamax;
    }

    public double getPesobulto() {
        return pesobulto;
    }

    public void setPesobulto(double pesobulto) {
        this.pesobulto = pesobulto;
    }

    public double getPreciokilo() {
        return preciokilo;
    }

    public void setPreciokilo(double preciokilo) {
        this.preciokilo = preciokilo;
    }

    public double getNumerobultostotal() {
        return numerobultostotal;
    }

    public void setNumerobultostotal(double numerobultostotal) {
        this.numerobultostotal = numerobultostotal;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public AvionCarga getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(AvionCarga siguiente) {
        this.siguiente = siguiente;
    }
}
