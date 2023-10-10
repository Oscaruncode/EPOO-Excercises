package Ejercicios.clasesBase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConBoton extends JFrame {
    public JPanel panel;
    private JButton jButton;
    private JTextField jTextField;
    public VentanaConBoton(String windowName, String buttonName, String fieldTextName) {
        super(windowName);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        panel = new JPanel(new BorderLayout());
        jButton = new JButton(buttonName);
        jTextField = new JTextField(fieldTextName);

        panel.add(jTextField, BorderLayout.NORTH);
        panel.add(jButton, BorderLayout.SOUTH);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doWhenButtonPress();
            }
        });

        getContentPane().add(panel);

    }

    public void doWhenButtonPress(){
        //Implementación en cada clase
    }
    public String getTextField(){
        return this.jTextField.getText();
    };

    public JTextField getJTextField(){
        return this.jTextField;
    };
}
