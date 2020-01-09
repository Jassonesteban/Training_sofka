package com.jasson;
import javax.swing.*;

public class ejercicio2 {
    AvionCarga primero;
    AvionCarga ultimo;


    public ejercicio2() {
        this.primero=null;
        this.ultimo = null;
    }

    public void ingresarcarga(int pesobulto,int cantidad){
        AvionCarga carga = new AvionCarga();
        carga.pesobulto = pesobulto;
        carga.tamaño = cantidad;
        if(primero == null){
            primero = carga;
            primero.siguiente = null;
            ultimo= primero;
        }else{
            ultimo.siguiente = carga;
            carga.siguiente = null;
            ultimo = carga;
        }
    }


    public String validarcargatotal(){
        new AvionCarga();
        AvionCarga total = primero;
        double total_carga_peso;
        String res="";
        while (total!=null){
            total_carga_peso = total.tamaño*total.pesobulto;
            total.numerobultostotal = total_carga_peso;
            res ="La carga total a abordar es: "+total.getNumerobultostotal();
            total = total.siguiente;
        }
        return res;
    }

    public String determinarvalor(){
        double valor1 = 0,valor2=0,valor3=0;
        String res="";
        AvionCarga cargavalor = new AvionCarga();
        cargavalor = primero;
        while(cargavalor!=null){
            if(cargavalor.getPesobulto()>=0 && cargavalor.getPesobulto()<=25){
                cargavalor.preciokilo = valor1;
                res = "El precio de la carga es de: " + "$"+cargavalor.getPreciokilo();
                cargavalor = cargavalor.siguiente;

            }else if(cargavalor.getPesobulto()>=26 && cargavalor.getPesobulto()<=300){
                valor2 = 1500*cargavalor.pesobulto;
                cargavalor.preciokilo = valor2;
                //cargavalor.setPreciokilo(valor2);
                res = "El precio de la carga es de: " + "$"+cargavalor.getPreciokilo();
                cargavalor = cargavalor.siguiente;

            }else if(cargavalor.getPesobulto()>=301 && cargavalor.getPesobulto()<=500){
                valor3 =2500*cargavalor.pesobulto;
                cargavalor.preciokilo = valor3;
                //argavalor.setPreciokilo(valor3);
                res = "El precio de la carga es de: " + "$"+cargavalor.getPreciokilo();
                cargavalor = cargavalor.siguiente;
            }
        }
        return res;

    }

    public void determinarmayor(){
        AvionCarga carga = new AvionCarga();
        carga = primero;
        double masPesado = 0;
        while (carga!=null){
            if(carga.getPesobulto()>0){
                masPesado = carga.getPesobulto();
            }
            carga = carga.siguiente;
        }
        JOptionPane.showMessageDialog(null,  "La carga mas pesada es: " + masPesado);

    }

    public void determinarmenor(){
        AvionCarga carga = new AvionCarga();
        carga = primero;
        double menosPesado = 0;
        while (carga!=null){
            if(0<carga.pesobulto){
                menosPesado = carga.pesobulto;
            }
            carga = carga.siguiente;
        }
        JOptionPane.showMessageDialog(null,  "La carga menos pesada es: " + menosPesado);
    }

    public void pesopromedio(){
        new AvionCarga();
        AvionCarga promediocarga;
        double pesoprom = 0;
        promediocarga=primero;
        while (promediocarga!=null){
            pesoprom+= promediocarga.pesobulto;
            promediocarga = promediocarga.siguiente;
        }
        JOptionPane.showMessageDialog(null,"el peso promedio de carga que lleva el avión es de:\n"+
                pesoprom+" kg");
    }

    public void valorcargatotal(){
        new AvionCarga();
        AvionCarga valorcarga;
        double precio=0;
        double valordolar = 3000;
        double precioendolares;

        valorcarga= primero;
        while (valorcarga!=null){
            precio+=precio+valorcarga.preciokilo;

            valorcarga= valorcarga.siguiente;
        }
        JOptionPane.showMessageDialog(null,"El monto en pesos (COP) de la carga que lleva el avión es:\n "+
                "$"+precio);
    }

    public void imprimirlista(){
        new AvionCarga();
        AvionCarga listacarga;
        listacarga = primero;
        String resultado= "";
        while (listacarga!=null){
            resultado+="Peso del bulto(s): " +listacarga.getPesobulto() +"\n"+"Cantidad de bultos: " +listacarga.getTamaño() +"\n" +
                    validarcargatotal() +"\n" + determinarvalor()+"\n";
            resultado+= "    ";
            resultado+="\n";
            listacarga = listacarga.siguiente;
        }
        JOptionPane.showMessageDialog(null, "Lista:\n" + resultado );
    }
}
