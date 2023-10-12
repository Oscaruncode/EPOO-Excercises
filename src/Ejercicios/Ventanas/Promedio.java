package Ejercicios.Ventanas;

import Ejercicios.clasesBase.VentanaConBotonyMultiplesInputs;

import javax.swing.*;

public class Promedio extends VentanaConBotonyMultiplesInputs {
    public Promedio(){super("Promedio Poo","Calcular",new String[]{"Nombre: ","Nota1: ","Nota2: ","Nota3: "});}

    @Override
    public void doWhenButtonPress() {
        JTextField[] fieldsValues= getMultiplesJFields();
        String nombre = fieldsValues[0].getText().replace("Nombre: ","");
        float suma = 0;
        float promedio=0;
        try{
            for(int i=1; i<fieldsValues.length; i++){
                suma += Float.parseFloat(fieldsValues[i].getText().replace("Nota"+i+": ",""));
            }

            promedio = suma / (fieldsValues.length-1);
            JOptionPane.showMessageDialog(this,"El promedio de las notas es de "+ String.format("%.2f",promedio));

        }catch (NumberFormatException ex) {
            // Manejo de errores si la entrada no es un número válido
            JOptionPane.showMessageDialog(this, "Entrada no válida. Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }
}
