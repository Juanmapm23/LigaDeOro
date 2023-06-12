import javax.swing.*;
import java.awt.event.*;

public class Gestor extends JFrame implements ActionListener{

    JButton boton1;
    public Gestor(){
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }


    public static void main(String[] args) {

        Gestor gestor = new Gestor();
        gestor.setBounds(0,0,900,700);
        gestor.setResizable(false);
        gestor.setVisible(true);
        gestor.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }
}