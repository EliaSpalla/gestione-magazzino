import java.util.Scanner;

public class Main {
    static Pezzo[] magazzino=new Pezzo[5];
    public static void main(String[] args) {
        //invocazione pezzo per pezzo con valori predefiniti
        Scanner s=new Scanner(System.in);
        String risposta="o";
        while(risposta.toUpperCase()!="M" ||risposta.toUpperCase()!="C"){
            System.out.print("in base a cosa si vuole cercare il pezzo? (M per modello e marca/C per codice)");
            risposta=s.next();
        }

        if (risposta.toUpperCase()=="M"){
            System.out.print("\nPezzo: ");
            String pezzo=s.next();
            System.out.print("\nModello: ");
            String modello=s.next();
            System.out.print("\nMarca: ");
            String marca=s.next();
        }else{
            System.out.print("\nCodice: ");
            int codice=s.nextInt();
        }


    }
    public static int ricercaIndicePezzo(String pezzo,String modello,String marca){
        for(int i=0;i<magazzino.length;i++){
            //controlla i tre impicci
        }
        return 1;//return indice
    }
    public static int ricercaIndicePezzo(int codice){
        for(int i=0;i<magazzino.length;i++){
            //controlla un impiccio
        }
        return 1; //return indice
    }

}