public class Pezzo {
    private String nome;
    private String marca;
    private String modello;
    private String posizione;
    private int codice;
    private double prezzo;
    private double costo;
    private int quantita;

    public Pezzo(String nome, String marca, String modello, String posizione, int codice,int quantita, double prezzo, double costo){
        if(nome!=null && !nome.isEmpty()){
            this.nome=nome;
        }else{
            throw new IllegalArgumentException("nome non valido, riprovace");
        }

        if (marca!=null && marca.isEmpty()){
            this.marca=marca;
        } else{
            throw new IllegalArgumentException("marca non valido, riprovace");
        }

        if(modello!=null && modello.isEmpty()){
            this.modello=modello;
        }else{
            throw new IllegalArgumentException("modello non valido, riprovace");
        }

        if(posizione!=null && posizione.isEmpty()){
            this.posizione=posizione;
        }else{
            throw new IllegalArgumentException("posizione non valido, riprovace");
        }

        if(codice>0){
            this.codice=codice;
        }else{
            throw new IllegalArgumentException("codice non valido, riprovace");
        }

        if(quantita>0){
            this.quantita=quantita;
        }else{
            throw new IllegalArgumentException("quantita non valido, riprovace");
        }

        if(prezzo>0){
            this.prezzo=prezzo;
        }else{
            throw new IllegalArgumentException("prezzo non valido, riprovace");
        }

        if(costo>0){
            this.costo=costo;
        }else{
            throw new IllegalArgumentException("costo non valido, riprovace");
        }

    }
    public Pezzo(String nome,String marca,String modello, int codice){
        if(nome!=null||!nome.isEmpty()){
            this.nome=nome;
        }else{}

        if (marca!=null|| marca.isEmpty()){
            this.marca=marca;
        } else{}

        if(modello!=null||modello.isEmpty()){
            this.modello=modello;
        }else{}

        if(codice>0){
            this.codice=codice;
        }else{}
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
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", posizione='" + posizione + '\'' +
                ", codice=" + codice +
                ", prezzo=" + String.format("%.2f", prezzo) + // Formatta per 2 cifre decimali
                ", costo=" + String.format("%.2f", costo) +   // Formatta per 2 cifre decimali
                ", quantita=" + quantita +
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
