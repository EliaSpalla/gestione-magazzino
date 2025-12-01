import java.util.Scanner;

public class Main {
    //calcolo sconto in acquirente
    static Magazzino magazzino=new Magazzino();
    public static void main(String[] args) {
        magazzino.inizializzazione();
        magazzino.stampa();

        Scanner s=new Scanner(System.in);
        magazzino.InterfacciaRicerca(s);
        s.close();
    }
}
