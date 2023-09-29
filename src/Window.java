
import Ejercicios.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        super("Programa amistoso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        JPanel panel1 = new JPanel(new FlowLayout());

        //Nombres de los botones
        String[] buttonNames = {"Cambio", "Tapa Roja", "Salir"};
        Font fuenteBtn = new Font("Verdana", Font.BOLD, 12);

        //Crear botones
        for (String name: buttonNames){
            JButton button = new JButton(name);
            button.setFont(fuenteBtn);
            panel1.add(button);

            //Eventos
            button.addActionListener(new ButtonActionListener(name));
        }

        // Agregar panel a window
        getContentPane().add(panel1);


    }

    private class ButtonActionListener implements ActionListener {
        private String buttonName;

        public ButtonActionListener(String name) {
            this.buttonName = name;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (buttonName.equals("Salir")) {
                System.exit(0);
            } else if (buttonName.equals("Cambio")) {
                CambioWindow cambioWindow = new CambioWindow();
                cambioWindow.setVisible(true);
                // Lógica para el botón "Cambio"
            } else if (buttonName.equals("Tapa Roja")) {
                TapaRojaWindow tapaRojaWindow = new TapaRojaWindow();
                tapaRojaWindow.setVisible(true);
                // Lógica para el botón "Tapa Roja"
            }else{
                JOptionPane.showMessageDialog(null,"Boton desconocido");
                System.exit(0);
            }
        }
    }


}

