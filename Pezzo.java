import java.io.Serializable;

public class Pezzo implements Serializable{
    private String nome;
    private String marca;
    private String modello;
    private String posizione;
    private int codice;
    private double prezzo;
    private double costo;
    private int quantita;

    public Pezzo(String nome, String marca, String modello, String posizione, int codice,int quantita, double prezzo, double costo){
        if(nome!=null||!nome.isEmpty()){
            this.nome=nome;
        }else{
            throw new IllegalArgumentException("il nome non può essere nullo o vuoto.");
        }

        if (marca!=null|| marca.isEmpty()){
            this.marca=marca;
        } else{
            throw new IllegalArgumentException("la marca non può essere nulla o vuota.");
        }

        if(modello!=null||modello.isEmpty()){
            this.modello=modello;
        }else{
            throw new IllegalArgumentException("il modello non può essere nullo o vuoto.");
        }

        if(posizione!=null||posizione.isEmpty()){
            this.posizione=posizione;
        }else{
            throw new IllegalArgumentException("la posizione non può essere nulla o vuota.");
        }

        if(codice>0){
            this.codice=codice;
        }else{
            throw new IllegalArgumentException("il codice non può essere nullo o vuoto.");
        }

        if(quantita>0){
            this.quantita=quantita;
        }else{
            throw new IllegalArgumentException("la quantita non può essere nulla o vuota.");
        }

        if(prezzo>0){
            this.prezzo=prezzo;
        }else{
            throw new IllegalArgumentException("il prezzo non può essere nullo o vuoto.");
        }

        if(costo>0){
            this.costo=costo;
        }else{
            throw new IllegalArgumentException("il costo non può essere nullo o vuoto.");
        }

    }
    public Pezzo(String nome,String marca,String modello, int codice){
        if(nome!=null||!nome.isEmpty()){
            this.nome=nome;
        }else{
            throw new IllegalArgumentException("il nome non può essere nullo o vuoto.");
        }

        if (marca!=null|| marca.isEmpty()){
            this.marca=marca;
        }else{
            throw new IllegalArgumentException("la marca non può essere nulla o vuota.");
        }

        if(modello!=null||modello.isEmpty()){
            this.modello=modello;
        }else{
            throw new IllegalArgumentException("il modello non può essere nullo o vuoto.");
        }

        if(codice>0){
            this.codice=codice;
        }else{
            throw new IllegalArgumentException("il codice non può essere nullo o vuoto.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCodice() {
        return codice;
    }

    public String getPosizione() {
        return posizione;
    }

    public double getCosto() {
        return costo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getModello() {
        return modello;
    }

    public int getQuantita() {
        return quantita;
    }
    public String getMarca() {
        return marca;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public void setCodice(int codice){
        this.codice= codice;
    }

    public void setPosizione(String posizione){
        this.posizione= posizione;
    }

    public void setCosto(double costo){
        this.costo= costo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo= prezzo;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setModello(String modello){
        this.modello= modello;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double calcRicavo(){
        return prezzo-costo;
    }

    @Override
    public String toString() {
        return "Pezzo {" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", posizione='" + posizione + '\'' +
                ", quantita=" + quantita +
                ", prezzo=" + String.format("%.2f", prezzo) +
                ", costo=" + String.format("%.2f", costo) +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) { //controlla se il puntatore punta a questa instanza
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { //controlla se l'oggetto è vuoto o di un altra classe
            return false;
        }


        if (this.codice == ((Pezzo) obj).codice || (this.nome.toUpperCase().equals(((Pezzo) obj).nome.toUpperCase()) && this.marca.toUpperCase().equals(((Pezzo) obj).marca.toUpperCase()) && this.modello.toUpperCase().equals(((Pezzo) obj).modello.toUpperCase()))) {
            //deve avere lo stesso codice O nome, marca e modello uguali
            return true;
        }
        return false;
    }

}
