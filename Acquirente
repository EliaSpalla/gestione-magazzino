public class Acquirente {
    String Nome;
    int quantitaRichiesta;

    public Acquirente(String Nome, int quantitaRichiesta){
        this.Nome = Nome;
        if (quantitaRichiesta < 0) {
            throw new IllegalArgumentException("la quantità non può essere negativa: " + quantitaRichiesta);
        }
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setQuantitaRichiesta(int quantitaRichiesta){}
    public String getNome(){
        return Nome;
    }
    public int getQuantitaRichiesta(){
        return quantitaRichiesta;
    }

    public float calcSconto(){
        //da finire
        return 1;
    }

    @Override
    public String toString() {
        return "Acquirente{" +
                "Nome='" + Nome + '\'' +
                ", quantitaRichiesta=" + quantitaRichiesta +
                '}';
    }
}
