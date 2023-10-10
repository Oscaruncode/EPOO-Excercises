package Ejercicios;

import Ejercicios.clasesBase.VentanaConBoton;


public class Problema extends VentanaConBoton {
    public Problema() {
        super("Ventana Problema", "Enter", "US");
    }

    @Override
    public void doWhenButtonPress() {
        System.out.println("Boton oprimido");
    }
}