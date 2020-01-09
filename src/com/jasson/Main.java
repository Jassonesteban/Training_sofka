package com.jasson;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion;
        try{
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Prueba de algoritmos SOFKA TRAINING\n" +
                        "Ejercicios propuestos\n" +
                        "1. ejercicio N.1 -> Determinar el valor de un pasaje de avión\n" +
                        "2. ejercicio N.2 -> Capacidad de carga de un avión"));
                switch (opcion){
                    case 1:
                        double distancia;
                        int diasEstancia;
                        distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia aproximada que va a recorrer el vuelo"));
                        diasEstancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dias de estancia"));
                        ejercicio1 ejercicio1 = new ejercicio1(distancia,diasEstancia);
                        ejercicio1.conocerprecio();
                        break;

                    case 2:
                        int opciones;
                        ejercicio2 ejercicio2 = new ejercicio2();
                            do{
                                opciones = Integer.parseInt(JOptionPane.showInputDialog("Avion de carga BOING 747\n"+
                                        "¿Que desea hacer?\n"+
                                        "1. Ingresar carga al avion\n"+
                                        "2. ver el numero de bultos ingresados al avión, hasta el momento\n"+
                                        "3. Conocer la carga mas pesada y la mas liviana\n"+
                                        "4. peso promedio de la carga\n"+
                                        "5. Ingresos en pesos y en dolares de la carga\n"+
                                        "6. Retornar al menu principal"));
                                switch (opciones){
                                    case 1:
                                        int cantidadbultos;
                                        int peso;
                                        cantidadbultos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de bultos"));
                                        peso = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso"));
                                        if(peso>500){
                                            JOptionPane.showMessageDialog(null,"El peso no puede exceder de 500kg");
                                        }else{
                                            ejercicio2.ingresarcarga(peso,cantidadbultos);
                                        }

                                        break;
                                    case 2:
                                        ejercicio2.imprimirlista();
                                        break;
                                    case 3:
                                        ejercicio2.determinarmayor();
                                        ejercicio2.determinarmenor();
                                        break;
                                    case 4:
                                        ejercicio2.pesopromedio();
                                        break;
                                    case 5:
                                        ejercicio2.valorcargatotal();
                                        break;
                                    case 6:
                                        break;

                                }
                            }while(opciones <6);
                        break;
                }
            }while(opcion<3);


        }catch (Exception error){
            JOptionPane.showMessageDialog(null,"finalizo con exito el programa");

        }
    }
}
