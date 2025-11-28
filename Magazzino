 import java.util.Scanner;

public class Magazzino {
   static  Pezzo[] magazzino = new Pezzo[5];

    public static void ricercaPezzo(Scanner s){
        String risposta = "o";
        while (!risposta.toUpperCase().equals("M") && !risposta.toUpperCase().equals("C")) {
            System.out.print("In base a cosa si vuole cercare il pezzo? (M per modello e marca/C per codice): ");
            risposta = s.next();
        }

        s.nextLine(); // NECESSARIO per pulire il buffer
        if (risposta.toUpperCase().equals("M")){
            int indice=ricercaIndicePezzoModello(s);
            if(indice!=-1){
                System.out.print(magazzino[indice].toString());
            }
        }else{
            int indice=ricercaIndicePezzoCodice(s);
            if(indice!=-1){
                System.out.print(magazzino[indice].toString());
            }
        }
    }
    public static int ricercaIndicePezzoModello(Scanner s){
        System.out.print("Nome pezzo: ");
        String nome = s.nextLine();
        System.out.print("Modello: ");
        String modello = s.nextLine();
        System.out.print("Marca: ");
        String marca = s.nextLine();

        nome=nome.toUpperCase();
        modello=modello.toUpperCase();
        marca=marca.toUpperCase();

        for(int i = 0; i < magazzino.length; i++){
            if(magazzino[i].getNome().toUpperCase().equals(nome)
                    && magazzino[i].getModello().toUpperCase().equals(modello)
                    && magazzino[i].getMarca().toUpperCase().equals(marca)){
                return i;
            }
        }
        System.out.println("Dati sbagliati o pezzo inesistente");
        return -1;
    }
    public static int ricercaIndicePezzoCodice(Scanner s){
        System.out.print("Codice: ");
        int codice=s.nextInt();

        for(int i = 0; i < magazzino.length; i++){
            if(magazzino[i].getCodice() == codice){
                return i;
            }
        }
        System.out.println("Codice sbagliato o pezzo inesistente");
        return -1;
    }

    public static void inizializzazione() {
        magazzino[0] = new Pezzo("Filtro Olio HF138", "Hiflofiltro", "Yamaha MT-07", "R01-A", 1001, 20, 9.90, 4.50);
        magazzino[1] = new Pezzo("Pastiglie Freno Anteriori", "Brembo", "Honda CBR600RR", "R05-B", 2005, 15, 65.50, 32.00);
        magazzino[2] = new Pezzo("Candela CR9E", "NGK", "Kawasaki Z900", "R03-C", 3010, 50, 8.20, 3.80);
        magazzino[3] = new Pezzo("Catena Serie 520", "DID", "Ducati Monster 821", "R02-D", 4003, 10, 120.00, 65.00);
        magazzino[4] = new Pezzo("Batteria al Litio YT12B-BS", "Yuasa", "Suzuki GSX-R 750", "R04-E", 5022, 5, 155.00, 80.00);
    }

    public static void stampa(){
        System.out.println("--- Lista magazzino completa ---");
        for(int i = 0; i < magazzino.length; i++){
            System.out.println(magazzino[i].toString());
        }
        System.out.println("------------------------------");
    }
}
