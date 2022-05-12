package grafica;
import java.awt.*;
import javax.swing.*;


public class frmCalculadoraGeomtrica extends JFrame {
    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloArea;
    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtTrianguloArea;
    private JTextField txtTranguloBase;
    private JTextField txtTrianguloAltura;
    private JButton btnCircuferenciaCalcularArea;
    private JButton btnRetanguloCalcularArea;
    private JButton btnTrianguloCalcularArea;

    public frmCalculadoraGeomtrica(){
        setSize(new Dimension(720, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));
        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Circulo"));
        add(pnl);
        pnl.setLayout(new GridLayout(1, 5, 10, 50));
        pnl.add(new JLabel("Raio:"));
        txtCircunferenciaRaio = new JTextField();
        pnl.add(txtCircunferenciaRaio);
        btnCircuferenciaCalcularArea = new JButton("Calcular");
        pnl.add(btnCircuferenciaCalcularArea);
        pnl.add(new JLabel("Area:"));
        txtCircunferenciaArea = new JTextField();
        pnl.add(txtCircunferenciaArea);
        
        


        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retangulo"));
        add(pnl);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triangulo"));
        add(pnl);
    }
}
