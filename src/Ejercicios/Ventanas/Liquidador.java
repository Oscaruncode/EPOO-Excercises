package Ejercicios.Ventanas;

import Ejercicios.clasesBase.VentanaConBotonyMultiplesInputs;

import javax.swing.*;

public class Liquidador extends VentanaConBotonyMultiplesInputs {

    public Liquidador(){super("Liquidador","Liquidar",new String[]{"Cedula: ","Nombre: ","Sexo: ","Horas Trabajadas: ", "Valor de Hora: "});}

    JTextField[] inputValues= getMultiplesJFields();

    @Override
    public void doWhenButtonPress() {
        double bonificacion,aporte,salarioNeto,salarioSinAplicarDescuentos = 0;
        String resultMensaje = "";

        try{
            salarioSinAplicarDescuentos = Float.parseFloat(inputValues[3].getText().replace("Horas Trabajadas: ","")) * Float.parseFloat(inputValues[4].getText().replace("Valor de Hora: ",""));
            bonificacion = salarioSinAplicarDescuentos * 0.04;
            aporte = salarioSinAplicarDescuentos * 0.07;
            salarioNeto = salarioSinAplicarDescuentos + bonificacion - aporte;

            for(int i=0;i<inputValues.length;i++){
                resultMensaje += inputValues[i].getText() + "\n";
            }

            resultMensaje += "SalarioBase: "+ String.format("%.2f",salarioSinAplicarDescuentos) + " Sin descuentos."+"\n";
            resultMensaje += "Bonitificación: "+ String.format("%.2f",bonificacion) + "Equivalente al 4%."+"\n";
            resultMensaje += "Aporte a EPS: "+ String.format("%.2f",aporte) + "Equivalente al 7%."+"\n";
            resultMensaje += "SalarioNeto: "+ String.format("%.2f",salarioNeto) +"\n";
            JOptionPane.showMessageDialog(this,resultMensaje);

        }catch (NumberFormatException ex) {
            // Manejo de errores si la entrada no es un número válido
            JOptionPane.showMessageDialog(this, "Entrada no válida. Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


//Leer la cédula, nombre, sexo, horas trabajadas y valor de la hora de un trabajador y deducir e imprimir su salario neto, aplicando una bonificación del 4% y un aporte del 7% a la EPS.