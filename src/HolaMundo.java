import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundo {
    private JPanel rootPanel;
    private JButton Calcular;
    private JLabel Titulo;
    private JTextField Nom;
    private JTextField peso;
    private JLabel Nombre;
    private JLabel Peso;
    private JLabel estatura;
    private JTextField Estatura;
    private JLabel IMC;
    private JLabel resultado;

    public HolaMundo() {
        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*double peso_ingresado = Double.parseDouble(peso.getText());
                double estatura_ingresada = Double.parseDouble(estatura.getText());
                double imc = peso_ingresado / (estatura_ingresada*estatura_ingresada);
                resultado.setText(" "+imc);*/
                double imc;
                double peso_ingresado;
                double estatura_ingresada;
                peso_ingresado = Double.parseDouble(peso.getText());
                estatura_ingresada = Double.parseDouble(Estatura.getText());
                imc = (peso_ingresado/(estatura_ingresada*estatura_ingresada));
                resultado.setText(Double.toString(peso_ingresado+estatura_ingresada));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IMC");
        frame.setContentPane(new HolaMundo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
