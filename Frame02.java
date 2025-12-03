import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Frame02 extends JFrame implements ActionListener {
    JButton indietro;
    JButton pulsante1;
    JButton pulsante2;
    JButton pulsante3;
    JButton pulsante4;
    String indirizzo;
    Magazzino magazzino;

    public Frame02(String indirizzo,Magazzino magazzino) {
        magazzino.caricaOggetto();

        this.magazzino=magazzino;
        this.indirizzo = indirizzo;

        indietro=new JButton("Indietro");
        this.add(indietro);
        pulsante1=new JButton("");
        pulsante2=new JButton("");
        pulsante3=new JButton("");
        pulsante4=new JButton("");

        switch(indirizzo){
            case "vendita":
                pulsante1.setText("");
                pulsante2.setText("");
                pulsante3.setText("");
                this.add(pulsante1);
                this.add(pulsante2);
                this.add(pulsante3);
                break;
            case "database":
                pulsante1.setText("Modifica");
                pulsante2.setText("Salvataggio");
                pulsante3.setText("Stampa");
                pulsante4.setText("Ricerca");
                this.add(pulsante1);
                this.add(pulsante2);
                this.add(pulsante3);
                this.add(pulsante4);
                break;
            case "resoconto":
                pulsante1.setText("Guadagno");
                pulsante2.setText("Spese");
                pulsante3.setText("Vendite");
                this.add(pulsante1);
                this.add(pulsante2);
                this.add(pulsante3);
                break;
            default:
                this.setVisible(false);

        }
        this.setTitle("Frame");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        indietro.setBounds(150, 150, 500, 50);
        indietro.setLayout(null);
        indietro.addActionListener(this);
        indietro.setHorizontalAlignment(SwingConstants.CENTER);

        pulsante1.setBounds(150, 150, 500, 50);
        pulsante1.setLayout(null);
        pulsante1.addActionListener(this);
        pulsante1.setHorizontalAlignment(SwingConstants.CENTER);

        pulsante2.setBounds(150, 225, 500, 50);
        pulsante2.setLayout(null);
        pulsante2.addActionListener(this);
        pulsante2.setHorizontalAlignment(SwingConstants.CENTER);

        pulsante3.setBounds(150, 300, 500, 50);
        pulsante3.setLayout(null);
        pulsante3.addActionListener(this);
        pulsante3.setHorizontalAlignment(SwingConstants.CENTER);

        pulsante4.setBounds(150, 375, 500, 50);
        pulsante4.setLayout(null);
        pulsante4.addActionListener(this);
        pulsante4.setHorizontalAlignment(SwingConstants.CENTER);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(indirizzo.equals("vendita")){
            if(e.getSource()== pulsante1){

            }
            if(e.getSource()== pulsante2){

            }
            if(e.getSource()== pulsante3){

            }
        }
        if(indirizzo.equals("database")){
            if(e.getSource()== pulsante1){
                magazzino.modificaOggetto();
            }
            if(e.getSource()== pulsante2){
                magazzino.salvaOggetto();
            }
            if(e.getSource()== pulsante3){
                magazzino.stampa();
            }
            if(e.getSource()== pulsante4){
                FrameRicerca fr=new FrameRicerca();
                setVisible(false);
            }
        }
        if(indirizzo.equals("resoconto")){
            if(e.getSource()== pulsante1){
                magazzino.modificaOggetto();
            }
            if(e.getSource()== pulsante2){
                magazzino.salvaOggetto();
            }
            if(e.getSource()== pulsante3){
                magazzino.stampa();
            }
        }
        if(e.getSource() == indietro){
            setVisible(false);
            new Frame01(magazzino);
        }
    }
}
