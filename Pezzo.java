public class Pezzo {
   private String nome;
     private String marca;
     private String modello;
     private String posizione;
     private int codice;
     private double prezzo;
     private double costo;
     private int quantita;

     public Pezzo(String nome, String marca){
             if(nome!=null||nome.lenght<0){
                    this.nome=nome;
          }else{
               //eccexione
          }

          if(modello!=null||modello.lenght<0){
               this.modello=modello;
          }else{
               //eccexione
          }

          if(posizione!=null||posizione.lenght<0){
               this.posizione=posizione;
          }else{
               //eccexione
          }
          if (marca!=null|| marca.lenght<0){
               this.marca=marca;
          } else{
               //eccexione
          }
          if(codice!=null||codice<=0){
               this.codice=codice;
          }else{}

          if(quantita!=null||quantita<=0){
               this.quantita=quantita;
          }else{}

          if(prezzo!=null||prezzo<=0){
               this.prezzo=prezzo;
          }else{}

          if(costo!=null||costo<=0){
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
}

