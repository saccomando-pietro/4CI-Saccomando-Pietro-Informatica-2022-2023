import java.util.*;
public class LavatriceTest{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int acc;
        System.out.println("Inserisci marca");
        String marca=input.next();
        System.out.println("Inserisci modello");
        String modello=input.next();
        System.out.println("Inserisci prezzo");
        double prezzo=input.nextDouble();
        Lavatrice lavatrice1 = new Lavatrice(marca, modello, prezzo);
        System.out.println("marca: "+lavatrice1.getMarca());
        System.out.println("modello: "+lavatrice1.getModello());
        System.out.println("prezzo: "+lavatrice1.getPrezzo());
        do{
            System.out.println("Digita 1 se vuoi accendere la lavatrice, 0 se vuoi spegnerla");
            acc=input.nextInt();
        }while(acc!=1 && acc!=0);
        if(acc==1){
            lavatrice1.accendi();
            System.out.println("La lavatrice è accesa");
        }
        if(acc==0){
            lavatrice1.spento();
            System.out.println("La lavatrice è spenta");
        }
        
    }
}