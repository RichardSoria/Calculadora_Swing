import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public JPanel mainPanel;
    private JButton restaButton;
    private JButton divisiónButton1;
    private JButton multiplicaciónButton;
    private JButton sumaButton;
    private JButton raízCuadradaButton;
    private JButton senoButton;
    private JButton potenciaButton;
    private JButton cosenoButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel resultadoOperacion;

    public Calculadora() {
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                Double resultado = Math.round((numero1 + numero2)*100.0)/100.0;
                resultadoOperacion.setText(resultado.toString());
            }
        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                Double resultado = Math.round((numero1 - numero2)*100.0)/100.0;
            }
        });
        multiplicaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                Double resultado = Math.round((numero1 * numero2)*100.0)/100.0;
            }
        });
        divisiónButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                if (numero2.equals(0.0))
                {
                    JOptionPane.showMessageDialog(null, "No es posible dividir para 0");
                }
                else
                {
                    Double resultado = Math.round((numero1 / numero2)*100.0)/100.0;
                }

            }
        });
    }
}
