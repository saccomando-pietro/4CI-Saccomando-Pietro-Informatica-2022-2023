import java.util.*;
public class FrigoriferoTest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String marca="Samsung";
        String modello="pro";
        int litriFrigo=20;
        int litriFreezer=10;
        double prezzo=499.99;
        Frigorifero frigo1 = new Frigorifero(marca, modello, litriFrigo, litriFreezer, prezzo);
        int acc;
        do{
            System.out.println("Inserisci 1 per accendere il frigo 0 per spegnerlo");
            acc=input.nextInt();
        }while(acc!=1 && acc!=0);
        if(acc==1){
            frigo1.accendi();
            System.out.println("Il frigo è acceso");
            frigo1.setMarca("Samsung");
            System.out.println("marca: "+frigo1.getMarca());
            frigo1.setModello("ag8200f");
            System.out.println("modello: "+frigo1.getModello());
            frigo1.setLitriFrigo(20);
            System.out.println("litri del frigo: "+frigo1.getLitriFrigo());
            frigo1.setLitriFreezer(10);
            System.out.println("litri del freezer: "+frigo1.getLitriFreezer());
            frigo1.setPrezzo(499.99);
            System.out.println("prezzo: "+frigo1.getPrezzo());
            System.out.println("Inserisci kwatt che consuma il frigorifero");
            double kWatt=input.nextDouble();
            frigo1.setKWatt(kWatt);
            System.out.println("I kWatt che consuma il frigo sono: "+ frigo1.getKWatt());
            System.out.println("Inserisci la temperatura del frigo");
            int tempFrigo=input.nextInt();
            frigo1.setTempFrigo(tempFrigo);
            System.out.println("La temperatura del frigo è: "+ frigo1.getTempFrigo());
            frigo1.aumentaTempFrigo();
            System.out.println("La temperatura del frigo è stata aumentata a: "+ frigo1.getTempFrigo());
            frigo1.diminuisciTempFrigo();
            System.out.println("La temperatura del frigo è stata diminuita a: "+ frigo1.getTempFrigo());
        }
        if(acc==0){
            frigo1.spegni();
            System.out.println("Il frigo è spento");
        }
    }
}