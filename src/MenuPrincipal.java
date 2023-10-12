
import Ejercicios.Ventanas.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        super("Programa amistoso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        JPanel panel1 = new JPanel(new FlowLayout());

        //Nombres de los botones
        String[] buttonNames = {"Cambio", "Tapa Roja","Promedio","Problema","Liquidador", "Salir"};
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

            switch (buttonName){
                case "Salir": System.exit(0); break;
                case "Cambio": CambioWindow cambioWindow = new CambioWindow(); cambioWindow.setVisible(true); break;
                case "Tapa Roja": TapaRojaWindow tapaRojaWindow = new TapaRojaWindow(); tapaRojaWindow.setVisible(true);break;
                case "Problema": Problema problemaWindow = new Problema(); problemaWindow.setVisible(true); break;
                case "Promedio": Promedio promedioWindow = new Promedio(); promedioWindow.setVisible(true); break;
                case "Liquidador": Liquidador liquidadorWindow = new Liquidador(); liquidadorWindow.setVisible(true);break;
                default:
                    JOptionPane.showMessageDialog(null, "Boton desconocido");
                    System.exit(0);
            }
        }
    }
}

