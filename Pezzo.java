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
        if(nome!=null||!nome.isEmpty()){
            this.nome=nome;
        }else{
            //eccexione
        }

        if(modello!=null||modello.isEmpty()){
            this.modello=modello;
        }else{
            //eccexione
        }

        if(posizione!=null||posizione.isEmpty()){
            this.posizione=posizione;
        }else{
            //eccexione
        }
        if (marca!=null|| marca.isEmpty()){
            this.marca=marca;
        } else{
            //eccexione
        }
        if(codice>0){
            this.codice=codice;
        }else{}

        if(quantita>0){
            this.quantita=quantita;
        }else{}

        if(prezzo>0){
            this.prezzo=prezzo;
        }else{}

        if(costo>0){
            this.costo=costo;
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

}
