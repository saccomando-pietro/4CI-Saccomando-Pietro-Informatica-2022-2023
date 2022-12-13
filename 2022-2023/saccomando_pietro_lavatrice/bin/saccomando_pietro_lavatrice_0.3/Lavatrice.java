public class Lavatrice{
    private String marca;
    private String modello;
    private double prezzo;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private  int kg;
    private boolean acceso;
    private double tempo;
    public Lavatrice(){
        this.marca="anonimo";
        this.modello="anonimo";
        this.prezzo=0.0;
        this.programma=0;
        this.temperatura=0;
        this.giriCentrifuga=0;
        this.kg=0;
        this.acceso=false;
        this.tempo=0.0;
    }
    public Lavatrice(String m, String mod, double p){
        if(m!=null){
            this.marca=m;
        }else{
            this.marca="anonimo";
        }
        if(mod!=null){
            this.modello=mod;
        }else{
            this.modello="anonimo";
        }
        if(p<0.0){
            this.prezzo=0.0;
        }else{
            this.prezzo=p;
        }
        this.programma=0;
        this.temperatura=0;
        this.giriCentrifuga=0;
        this.kg=0;
        this.acceso=false;
        this.tempo=0.0;
    }
    public void accendi(){
        this.acceso=true;
    }
    public void spento(){
        this.acceso=false;
    }
    public void setMarca(String m){
        if(m==null){
            this.marca="anonimo";
        }else{
            this.marca=m;
        }
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModello(String mod){
        if(mod==null){
            this.modello="anonimo";
        }else{
            this.modello=mod;
        }
    }
    public String getModello(){
        return this.modello;
    }
    public void setPrezzo(double p){
        if(p<0){
            this.prezzo=0.0;
        }else{
            this.prezzo=p;
        }
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public String toString(){
        String out="La lavatrice è di marca: "+ this.marca +"\n";
        out+="il modello è: "+this.modello+"\n";
        out+="costa: "+this.prezzo;
        return out;
    }
}
    