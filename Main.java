import java.util.Scanner;

public class Main {
    static Pezzo[] magazzino = new Pezzo[5];
    //funzione che stampa il magazzino
    //funzioni della ricerca 
    //calcolo sconto
    public static void main(String[] args) {
        magazzinoTest(); //inizializa array
        Scanner s=new Scanner(System.in);

        String risposta="o";
        while(risposta.toUpperCase()!="M" ||risposta.toUpperCase()!="C"){
            System.out.print("in base a cosa si vuole cercare il pezzo? (M per modello e marca/C per codice)");
            risposta=s.next();
        }

        if (risposta.toUpperCase()=="M"){
            ricercaIndicePezzoModello(s);
        }else{
            ricercaIndicePezzoCodice(s);
        }


    }
    public static int ricercaIndicePezzoModello(Scanner s){
        System.out.print("\nPezzo: ");
        String pezzo=s.next();
        System.out.print("\nModello: ");
        String modello=s.next();
        System.out.print("\nMarca: ");
        String marca=s.next();

        return 1;//return indice
    }
    public static int ricercaIndicePezzoCodice(Scanner s){
        System.out.print("\nCodice: ");
        int codice=s.nextInt();
        return 1;
    }

    public static void magazzinoTest() {
        magazzino[0] = new Pezzo("Filtro Olio HF138", "Hiflofiltro", "Yamaha MT-07", "R01-A", 1001, 20, 9.90, 4.50);
        magazzino[1] = new Pezzo("Pastiglie Freno Anteriori", "Brembo", "Honda CBR600RR", "R05-B", 2005, 15, 65.50, 32.00);
        magazzino[2] = new Pezzo("Candela CR9E", "NGK", "Kawasaki Z900", "R03-C", 3010, 50, 8.20, 3.80);
        magazzino[3] = new Pezzo("Catena Serie 520", "DID", "Ducati Monster 821", "R02-D", 4003, 10, 120.00, 65.00);
        magazzino[4] = new Pezzo("Batteria al Litio YT12B-BS", "Yuasa", "Suzuki GSX-R 750", "R04-E", 5022, 5, 155.00, 80.00);
    }
}
