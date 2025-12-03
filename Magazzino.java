import java.util.Scanner;
import java.io.*;
import java.io.Serializable;

public class Magazzino implements Serializable {
    private static final String NOME_FILE = "database.ser";
    static Pezzo[] magazzino = new Pezzo[10];

    public static int ricercaIndicePezzo(Pezzo appoggioUtente){
        int i=0;
        for(Pezzo p:magazzino) {
            if(p != null && appoggioUtente.equals(p)){
                System.out.println(p.toString());
                return i;
            }
            i++;
        }
        System.out.println("Dati sbagliati o pezzo inesistente");
        return -1;
    }

    public static void inizializzazione() {
        // Ho assunto un costruttore Pezzo(String nome, String marca, String modello, String codiceAlpha, int codiceNum, int quantita, double prezzoVendita, double prezzoAcquisto)
        magazzino[0] = new Pezzo("Kit Trasmissione Completo", "RK", "Triumph Street Triple", "R07-G", 7002, 12, 185.00, 90.00);
        magazzino[1] = new Pezzo("Catena Serie 520", "DID", "Ducati Monster 821", "R02-D", 4003, 10, 120.00, 65.00);
        magazzino[2] = new Pezzo("Candela CR9E", "NGK", "Kawasaki Z900", "R03-C", 3010, 50, 8.20, 3.80);
        magazzino[3] = new Pezzo("Pastiglie Freno Anteriori", "Brembo", "Honda CBR600RR", "R05-B", 2005, 15, 65.50, 32.00);
        magazzino[4] = new Pezzo("Batteria al Litio YT12B-BS", "Yuasa", "Suzuki GSX-R 750", "R04-E", 5022, 5, 155.00, 80.00);
        magazzino[5] = new Pezzo("Pneumatico Posteriore 180/55-17", "Michelin", "BMW S1000RR", "R06-F", 6015, 8, 210.00, 105.00);
        magazzino[6] = new Pezzo("Filtro Olio HF138", "Hiflofiltro", "Yamaha MT-07", "R01-A", 1001, 20, 9.90, 4.50);
        magazzino[7] = new Pezzo("Leva Frizione Regolabile", "Barracuda", "MV Agusta Brutale", "R10-L", 1007, 25, 45.00, 20.00);
        magazzino[8] = new Pezzo("Liquido Refrigerante -15°C", "Motul", "KTM 790 Duke", "R09-I", 9008, 30, 15.90, 7.50);
        magazzino[9] = new Pezzo("Disco Freno Anteriore", "Galfer", "Aprilia RSV4", "R08-H", 8030, 7, 130.50, 60.00);

        ordinamentoPerCodice();
        System.out.println("✅ Inizializzazione dati completata e ordinata.");
    }

    public static void ordinamentoPerCodice(){
        for(int i=0;i<magazzino.length;i++){
            for(int j=i;j<magazzino.length;j++){
                if(magazzino[i].getCodice()>magazzino[j].getCodice()){
                    scambia(i,j);
                }
            }
        }
    }
    public static void scambia(int indiceI, int indiceJ){
        Pezzo temp;
        temp = magazzino[indiceI];
        magazzino[indiceI] = magazzino[indiceJ];
        magazzino[indiceJ] = temp;
    }

    public static void stampa(){
        System.out.println("--- Lista magazzino completa ---");
        // Controlla se l'array è stato inizializzato
        if (magazzino[0] == null) {
            System.out.println("Il magazzino è vuoto. Eseguire l'inizializzazione o il caricamento.");
            return;
        }
        for(int i = 0; i < magazzino.length; i++){
            System.out.println(magazzino[i].toString());
        }
        System.out.println("------------------------------");
    }

    public static void salvaOggetto(){
        try (FileOutputStream fileOut = new FileOutputStream(NOME_FILE);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(magazzino);
            System.out.println("✅ Array di pezzi salvato in " + NOME_FILE);

        } catch (IOException i) {
            System.err.println("❌ Errore durante il salvataggio: " + i.getMessage());
        }
    }

    /**
     * Carica l'array di Pezzi da file. Se il file non esiste,
     * esegue l'inizializzazione predefinita.
     */
    public static void caricaOggetto(){
        File f = new File(NOME_FILE);

        if (!f.exists()) {
            System.out.println("⚠️ File di database non trovato (" + NOME_FILE + "). Eseguo l'inizializzazione predefinita.");
            inizializzazione();
            return;
        }

        try (FileInputStream fileIn = new FileInputStream(NOME_FILE);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            magazzino = (Pezzo[]) in.readObject();
            System.out.println("✅ Array di pezzi caricato con successo da " + NOME_FILE);

        } catch (IOException i) {
            System.err.println("❌ Errore durante il caricamento (IO): " + i.getMessage());
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.err.println("❌ Classe Pezzo non trovata.");
            c.printStackTrace();
        }
    }
    public static void modificaOggetto(){
        System.out.println("modificando");
    }
}import java.util.Scanner;
import java.io.*;
import java.io.Serializable;

public class Magazzino implements Serializable {
    private static final String NOME_FILE = "database.ser";
    static Pezzo[] magazzino = new Pezzo[10];

    public static int ricercaIndicePezzo(Pezzo appoggioUtente){
        int i=0;
        for(Pezzo p:magazzino) {
            if(p != null && appoggioUtente.equals(p)){
                System.out.println(p.toString());
                return i;
            }
            i++;
        }
        System.out.println("Dati sbagliati o pezzo inesistente");
        return -1;
    }

    public static void inizializzazione() {
        // Ho assunto un costruttore Pezzo(String nome, String marca, String modello, String codiceAlpha, int codiceNum, int quantita, double prezzoVendita, double prezzoAcquisto)
        magazzino[0] = new Pezzo("Kit Trasmissione Completo", "RK", "Triumph Street Triple", "R07-G", 7002, 12, 185.00, 90.00);
        magazzino[1] = new Pezzo("Catena Serie 520", "DID", "Ducati Monster 821", "R02-D", 4003, 10, 120.00, 65.00);
        magazzino[2] = new Pezzo("Candela CR9E", "NGK", "Kawasaki Z900", "R03-C", 3010, 50, 8.20, 3.80);
        magazzino[3] = new Pezzo("Pastiglie Freno Anteriori", "Brembo", "Honda CBR600RR", "R05-B", 2005, 15, 65.50, 32.00);
        magazzino[4] = new Pezzo("Batteria al Litio YT12B-BS", "Yuasa", "Suzuki GSX-R 750", "R04-E", 5022, 5, 155.00, 80.00);
        magazzino[5] = new Pezzo("Pneumatico Posteriore 180/55-17", "Michelin", "BMW S1000RR", "R06-F", 6015, 8, 210.00, 105.00);
        magazzino[6] = new Pezzo("Filtro Olio HF138", "Hiflofiltro", "Yamaha MT-07", "R01-A", 1001, 20, 9.90, 4.50);
        magazzino[7] = new Pezzo("Leva Frizione Regolabile", "Barracuda", "MV Agusta Brutale", "R10-L", 1007, 25, 45.00, 20.00);
        magazzino[8] = new Pezzo("Liquido Refrigerante -15°C", "Motul", "KTM 790 Duke", "R09-I", 9008, 30, 15.90, 7.50);
        magazzino[9] = new Pezzo("Disco Freno Anteriore", "Galfer", "Aprilia RSV4", "R08-H", 8030, 7, 130.50, 60.00);

        ordinamentoPerCodice();
        System.out.println("✅ Inizializzazione dati completata e ordinata.");
    }

    public static void ordinamentoPerCodice(){
        for(int i=0;i<magazzino.length;i++){
            for(int j=i;j<magazzino.length;j++){
                if(magazzino[i].getCodice()>magazzino[j].getCodice()){
                    scambia(i,j);
                }
            }
        }
    }
    public static void scambia(int indiceI, int indiceJ){
        Pezzo temp;
        temp = magazzino[indiceI];
        magazzino[indiceI] = magazzino[indiceJ];
        magazzino[indiceJ] = temp;
    }

    public static void stampa(){
        System.out.println("--- Lista magazzino completa ---");
        // Controlla se l'array è stato inizializzato
        if (magazzino[0] == null) {
            System.out.println("Il magazzino è vuoto. Eseguire l'inizializzazione o il caricamento.");
            return;
        }
        for(int i = 0; i < magazzino.length; i++){
            System.out.println(magazzino[i].toString());
        }
        System.out.println("------------------------------");
    }

    public static void salvaOggetto(){
        try (FileOutputStream fileOut = new FileOutputStream(NOME_FILE);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(magazzino);
            System.out.println("✅ Array di pezzi salvato in " + NOME_FILE);

        } catch (IOException i) {
            System.err.println("❌ Errore durante il salvataggio: " + i.getMessage());
        }
    }

    /**
     * Carica l'array di Pezzi da file. Se il file non esiste,
     * esegue l'inizializzazione predefinita.
     */
    public static void caricaOggetto(){
        File f = new File(NOME_FILE);

        if (!f.exists()) {
            System.out.println("⚠️ File di database non trovato (" + NOME_FILE + "). Eseguo l'inizializzazione predefinita.");
            inizializzazione();
            return;
        }

        try (FileInputStream fileIn = new FileInputStream(NOME_FILE);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            magazzino = (Pezzo[]) in.readObject();
            System.out.println("✅ Array di pezzi caricato con successo da " + NOME_FILE);

        } catch (IOException i) {
            System.err.println("❌ Errore durante il caricamento (IO): " + i.getMessage());
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.err.println("❌ Classe Pezzo non trovata.");
            c.printStackTrace();
        }
    }
    public static void modificaOggetto(){
        System.out.println("modificando");
    }
}import java.util.Scanner;
import java.io.*;
import java.io.Serializable;

public class Magazzino implements Serializable {
    private static final String NOME_FILE = "database.ser";
    static Pezzo[] magazzino = new Pezzo[10];

    public static int ricercaIndicePezzo(Pezzo appoggioUtente){
        int i=0;
        for(Pezzo p:magazzino) {
            if(p != null && appoggioUtente.equals(p)){
                System.out.println(p.toString());
                return i;
            }
            i++;
        }
        System.out.println("Dati sbagliati o pezzo inesistente");
        return -1;
    }

    public static void inizializzazione() {
        // Ho assunto un costruttore Pezzo(String nome, String marca, String modello, String codiceAlpha, int codiceNum, int quantita, double prezzoVendita, double prezzoAcquisto)
        magazzino[0] = new Pezzo("Kit Trasmissione Completo", "RK", "Triumph Street Triple", "R07-G", 7002, 12, 185.00, 90.00);
        magazzino[1] = new Pezzo("Catena Serie 520", "DID", "Ducati Monster 821", "R02-D", 4003, 10, 120.00, 65.00);
        magazzino[2] = new Pezzo("Candela CR9E", "NGK", "Kawasaki Z900", "R03-C", 3010, 50, 8.20, 3.80);
        magazzino[3] = new Pezzo("Pastiglie Freno Anteriori", "Brembo", "Honda CBR600RR", "R05-B", 2005, 15, 65.50, 32.00);
        magazzino[4] = new Pezzo("Batteria al Litio YT12B-BS", "Yuasa", "Suzuki GSX-R 750", "R04-E", 5022, 5, 155.00, 80.00);
        magazzino[5] = new Pezzo("Pneumatico Posteriore 180/55-17", "Michelin", "BMW S1000RR", "R06-F", 6015, 8, 210.00, 105.00);
        magazzino[6] = new Pezzo("Filtro Olio HF138", "Hiflofiltro", "Yamaha MT-07", "R01-A", 1001, 20, 9.90, 4.50);
        magazzino[7] = new Pezzo("Leva Frizione Regolabile", "Barracuda", "MV Agusta Brutale", "R10-L", 1007, 25, 45.00, 20.00);
        magazzino[8] = new Pezzo("Liquido Refrigerante -15°C", "Motul", "KTM 790 Duke", "R09-I", 9008, 30, 15.90, 7.50);
        magazzino[9] = new Pezzo("Disco Freno Anteriore", "Galfer", "Aprilia RSV4", "R08-H", 8030, 7, 130.50, 60.00);

        ordinamentoPerCodice();
        System.out.println("✅ Inizializzazione dati completata e ordinata.");
    }

    public static void ordinamentoPerCodice(){
        for(int i=0;i<magazzino.length;i++){
            for(int j=i;j<magazzino.length;j++){
                if(magazzino[i].getCodice()>magazzino[j].getCodice()){
                    scambia(i,j);
                }
            }
        }
    }
    public static void scambia(int indiceI, int indiceJ){
        Pezzo temp;
        temp = magazzino[indiceI];
        magazzino[indiceI] = magazzino[indiceJ];
        magazzino[indiceJ] = temp;
    }

    public static void stampa(){
        System.out.println("--- Lista magazzino completa ---");
        // Controlla se l'array è stato inizializzato
        if (magazzino[0] == null) {
            System.out.println("Il magazzino è vuoto. Eseguire l'inizializzazione o il caricamento.");
            return;
        }
        for(int i = 0; i < magazzino.length; i++){
            System.out.println(magazzino[i].toString());
        }
        System.out.println("------------------------------");
    }

    public static void salvaOggetto(){
        try (FileOutputStream fileOut = new FileOutputStream(NOME_FILE);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(magazzino);
            System.out.println("✅ Array di pezzi salvato in " + NOME_FILE);

        } catch (IOException i) {
            System.err.println("❌ Errore durante il salvataggio: " + i.getMessage());
        }
    }

    /**
     * Carica l'array di Pezzi da file. Se il file non esiste,
     * esegue l'inizializzazione predefinita.
     */
    public static void caricaOggetto(){
        File f = new File(NOME_FILE);

        if (!f.exists()) {
            System.out.println("⚠️ File di database non trovato (" + NOME_FILE + "). Eseguo l'inizializzazione predefinita.");
            inizializzazione();
            return;
        }

        try (FileInputStream fileIn = new FileInputStream(NOME_FILE);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            magazzino = (Pezzo[]) in.readObject();
            System.out.println("✅ Array di pezzi caricato con successo da " + NOME_FILE);

        } catch (IOException i) {
            System.err.println("❌ Errore durante il caricamento (IO): " + i.getMessage());
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.err.println("❌ Classe Pezzo non trovata.");
            c.printStackTrace();
        }
    }
    public static void modificaOggetto(){
        System.out.println("modificando");
    }
}
