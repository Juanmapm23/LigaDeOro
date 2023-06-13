import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aviso extends JFrame implements ActionListener {

    private JLabel problema;
    public Aviso(int caso){
        setLayout(null);
        switch (caso){
            case 0:
                problema = new JLabel("Ya hay 6 equipos.");
                break;
        }
        problema.setBounds(100,0,200,100);
        add(problema);
        mostrar(caso);
    }

    public void mostrar(int caso){

        this.setBounds(0,0,300,150);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
