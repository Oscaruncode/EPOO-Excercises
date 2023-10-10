package Ejercicios.clasesBase;
import javax.swing.*;
import java.awt.*;

public class VentanaConBotonyMultiplesInputs extends VentanaConBoton{
    private JTextField[] textFields;


    public VentanaConBotonyMultiplesInputs(String windowName, String buttonName,  String[] fieldTextNames) {
        super(windowName, buttonName, fieldTextNames[0]);

        textFields = new JTextField[fieldTextNames.length];
        panel.setLayout(new GridLayout(textFields.length, 1));

        for(int i=0; i<fieldTextNames.length; i++){
            if(i==0){
                textFields[i] = getJTextField(); // Teniendo en cuenta que super fieldTExtNames[0] ya crea el primer JTextField, simplemente lo obtengo de la clase base y lo agrego a la primer posicion del arreglo.
                continue;
            }
            textFields[i] = new JTextField(fieldTextNames[i]);
            panel.add(textFields[i]);
        }
    }

    public JTextField[] getMultiplesJFields() {
        return textFields;
    }
}
