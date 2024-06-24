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
        senoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double grados1 = Double.parseDouble(textField1.getText());
                Double grados2 = Double.parseDouble(textField2.getText());
                Double radianes1 = Math.toRadians(grados1);
                Double radianes2 = Math.toRadians(grados2);
                Double resultado1 = Math.sin(radianes1);
                Double resultado2 = Math.sin(radianes2);
                JOptionPane.showMessageDialog(null, "El seno de " + grados1 + " grados es: " + resultado1.toString() +
                        "\nEl seno de " + grados2 + " grados es: " + resultado2.toString());
            }
        });
        cosenoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double grados1 = Double.parseDouble(textField1.getText());
                Double grados2 = Double.parseDouble(textField2.getText());
                Double radianes1 = Math.toRadians(grados1);
                Double radianes2 = Math.toRadians(grados2);
                Double resultado1 = Math.cos(radianes1);
                Double resultado2 = Math.cos(radianes2);
                JOptionPane.showMessageDialog(null, "El seno de " + grados1 + " grados es: " + resultado1.toString() +
                        "\nEl seno de " + grados2 + " grados es: " + resultado2.toString());
            }
        });
        tangenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double grados1 = Double.parseDouble(textField1.getText());
                Double grados2 = Double.parseDouble(textField2.getText());
                Double radianes1 = Math.toRadians(grados1);
                Double radianes2 = Math.toRadians(grados2);
                Double resultado1 = Math.tan(radianes1);
                Double resultado2 = Math.tan(radianes2);
                JOptionPane.showMessageDialog(null, "El seno de " + grados1 + " grados es: " + resultado1.toString() +
                        "\nEl seno de " + grados2 + " grados es: " + resultado2.toString());
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel);
                frame.dispose();
            }
        });
    }
}
