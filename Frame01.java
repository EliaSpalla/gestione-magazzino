import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Frame01 extends JFrame implements ActionListener {
    JButton pulsante1;
    JButton pulsante2;
    JButton pulsante3;
    Magazzino magazzino;


    public Frame01(Magazzino magazzino) {
        this.magazzino=magazzino;

        pulsante1=new JButton("Vendita");
        pulsante2=new JButton("Database");
        pulsante3 = new JButton("Resoconto");

        this.setTitle("Frame");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        pulsante1.setBounds(150, 150, 500, 50);
        pulsante1.setLayout(null);
        pulsante1.addActionListener(this);
        pulsante1.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(pulsante1);

        pulsante2.setBounds(150, 225, 500, 50);
        pulsante2.setLayout(null);
        pulsante2.addActionListener(this);
        pulsante2.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(pulsante2);

        pulsante3.setBounds(150, 300, 500, 50);
        pulsante3.setLayout(null);
        pulsante3.addActionListener(this);
        pulsante3.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(pulsante3);


        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String indirizzo;
        if(e.getSource()== pulsante1){
            indirizzo = "Vendita";
            this.setVisible(false);
            Frame02 frame = new Frame02(indirizzo,magazzino);
        }
        if(e.getSource()== pulsante2){
            indirizzo ="database";
            this.setVisible(false);
            Frame02 frame = new Frame02(indirizzo,magazzino);
        }
        if(e.getSource()== pulsante3){
            indirizzo ="resoconto";
            this.setVisible(false);
            Frame02 frame = new Frame02(indirizzo,magazzino);
        }
    }
}
