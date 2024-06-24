import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public JPanel mainPanel;
    private JButton restaButton;
    private JButton divisionButton1;
    private JButton multiplicaciónButton;
    private JButton sumaButton;
    private JButton raizCuadradaButton;
    private JButton senoButton;
    private JButton potenciaButton;
    private JButton cosenoButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel resultadoOperacion;
    private JButton moduloButton;
    private JButton divisonExactaButton;
    private JLabel resultadoLabel;
    private JButton tangenteButton;
    private JButton SALIRButton;

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
                resultadoOperacion.setText(resultado.toString());
            }
        });
        multiplicaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                Double resultado = Math.round((numero1 * numero2)*100.0)/100.0;
                resultadoOperacion.setText(resultado.toString());
            }
        });
        divisionButton1.addActionListener(new ActionListener() {
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
                    resultadoOperacion.setText(resultado.toString());
                }

            }
        });

        raizCuadradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                Double resultado1 = Math.round((Math.sqrt(numero1))*100.0)/100.0;
                Double resultado2 = Math.round((Math.sqrt(numero2))*100.0)/100.0;
                JOptionPane.showMessageDialog(null, "El resultado de la raíz cuadrada de " + numero1 + " es: " + resultado1.toString() +
                        "\nEl resultado de la raíz cuadrada de "  + numero2 + " es: " + resultado2.toString());

            }
        });
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                Double resultado = Math.round((Math.pow(numero1, numero2))*100.0)/100.0;
                resultadoOperacion.setText(resultado.toString());
            }

        });
        moduloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(textField1.getText());
                Double numero2 = Double.parseDouble(textField2.getText());
                Double resultado = (numero1 % numero2);
                resultadoOperacion.setText(resultado.toString());
            }
        });
        divisonExactaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(textField1.getText());
                int numero2 = Integer.parseInt(textField2.getText());
                if (numero2 != 0)
                {
                    int resultado = (numero1 / numero2);
                    resultadoOperacion.setText(Integer.toString(resultado));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No es posible dividir para 0");
                }


            }
        });
    }
}
