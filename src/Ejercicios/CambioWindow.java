package Ejercicios;

import Ejercicios.clasesBase.VentanaConBoton;

import javax.swing.*;


public class CambioWindow extends VentanaConBoton {
    public CambioWindow() {
        super("Ventana de Cambio", "Convertir", "COP ");
    }

    @Override
    public void doWhenButtonPress() {
        convertirADolares();
    }

    private void convertirADolares(){

        final int valorDolar = 4222;
        String texto = getTextField();
        String valorString = texto.replace("COP ","");

        try {
            double valorCOP = Double.parseDouble(valorString);
            String valorUSD =  String.format("%.2f",valorCOP / valorDolar);

            JOptionPane.showMessageDialog(this, "Valor en USD: $" + valorUSD);

        } catch (NumberFormatException ex) {
            // Manejo de errores si la entrada no es un número válido
            JOptionPane.showMessageDialog(this, "Entrada no válida. Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }


};

