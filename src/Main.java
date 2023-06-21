
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;



public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulamasi....");
        
        Random random = new Random();
        
        Queue<String> pide_kuyrugu = new  LinkedList<String>();
        
        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Eren");
        pide_kuyrugu.offer("Handan");
        pide_kuyrugu.offer("Ahmet");
        pide_kuyrugu.offer("Ozge");
        pide_kuyrugu.offer("Omur");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("gül");
        pide_kuyrugu.offer("Sevim");
        pide_kuyrugu.offer("Ozan");
        
        
        int pide_sayisi = 1 + random.nextInt(10);  // 1 dahil ile 10 dahil arası pide çıkarılmak için
        
        
        System.out.println("Pideler Cikiyor");
        System.out.println(" Cikan Pide Sayisi:" + pide_sayisi);
        Thread.sleep(30000);
        
        while(pide_sayisi != 0){ //pideler bitene kadar dönecek
            
            System.out.println(pide_kuyrugu.poll() + "Pide aldi....");
            pide_sayisi --;
            Thread.sleep(10000);
        }
        
        System.out.println("Pide Kalmadi.....");
        
        
        
    }
    
}
