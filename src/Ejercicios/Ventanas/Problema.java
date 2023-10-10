package Ejercicios.Ventanas;

import Ejercicios.clasesBase.VentanaConBoton;
import Ejercicios.clasesBase.VentanaConBotonyMultiplesInputs;

import javax.swing.*;


public class Problema extends VentanaConBotonyMultiplesInputs {
    public Problema() {
        super("Ventana Problema", "Enter", new String[]{"Uno ","Uno ","Uno ","Dos ","Tres "});
    }

    @Override
    public void doWhenButtonPress() {
        JTextField[] fields = getMultiplesJFields();
        for(int i=0; i<fields.length; i++){
            System.out.println(fields[i].getText());
        }
        System.out.println("Boton oprimido");
    }
}