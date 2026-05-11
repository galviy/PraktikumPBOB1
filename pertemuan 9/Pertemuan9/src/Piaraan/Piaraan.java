package Piaraan;
import binatang.*;

import java.util.LinkedList;
import java.util.NoSuchElementException;



public class Piaraan {
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    public Piaraan(){
        this.nbelm = 0;
        Lanabul = new LinkedList<Anabul>();

    }
    int getNbelm(){
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul a){
        Lanabul.add(a);
        this.nbelm++;
    }
    public Anabul dequeueAnabul(){
        Anabul yangDikeluarkan;

        if (!Lanabul.isEmpty()){
            yangDikeluarkan = Lanabul.poll(); 
            System.out.println("Dikeluarkan: " + yangDikeluarkan.getNama());
            this.nbelm--;
            return yangDikeluarkan;
        }
         throw new NoSuchElementException("Antrean kosong! Tidak ada Anabul yang bisa dikeluarkan.");
    }

    public void showAnabul(){
         for(Anabul n : Lanabul){
            System.out.println("Nama anabul: " + n.getNama());
         }
    }
    public int countKucing(){
        int count = 0;
        for(Anabul n : Lanabul){

            if (n instanceof Kucing) { 
                count++;
            }
        }
         return count;
       
    }
     public double bobotKucing(){
        double bobot = 0;
        for(Anabul n : Lanabul){
          

            if (n instanceof Kucing) { 
                Kucing k = (Kucing) n;
                bobot += k.getBobot();
            }
        }
         return bobot;
       
    }

     public void showJenisAnabul(){
         for(Anabul n : Lanabul){
            System.out.println("Nama anabul: " + n.getNama() + "\nKelas: " + n.getClass().getSimpleName() + "\n=====");
         }
    }
    
}
