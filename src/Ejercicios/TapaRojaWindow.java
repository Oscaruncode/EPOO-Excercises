package Ejercicios;

import Ejercicios.clasesBase.VentanaConBoton;

import javax.swing.*;

public class TapaRojaWindow extends VentanaConBoton {
    public TapaRojaWindow(){
        super("Tapa Roja dosificador", "Convertir", "Onzas: ");

    }
    @Override
    public void doWhenButtonPress() {
        final int onzasPorCopa = 8;
        String texto = getTextField();
        String valorString = texto.replace("Onzas: ","");

        try{
            double onzasE = Double.parseDouble(valorString);
            double copasS = onzasE / onzasPorCopa;

            if(copasS<0){
               copasS = 0;
            }else{
               copasS = Math.ceil(copasS);
            }

            JOptionPane.showMessageDialog(this, "Cantidad de onzas: " + String.format("%.0f",onzasE) + "\n Cantidad de copas: " + String.format("%.0f",copasS));

        }catch (NumberFormatException ex) {
            // Manejo de errores si la entrada no es un número válido
            JOptionPane.showMessageDialog(this, "Entrada no válida. Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}