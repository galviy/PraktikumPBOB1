package Teman;


import java.util.ArrayList;
import java.util.List;



public class Teman{
    private int nbElmn;

    List<String> LNama;

    public Teman(){
        nbElmn =0;
        this.LNama =  new ArrayList<>();
    }


    public int getNbelm(){
        return this.nbElmn;
    }
    public List<String> getNama(){
        return this.LNama;
    }
    public void setNama(int index, String input){
        this.LNama.set(index,input);

    }

    public void addNama(String nama){
        this.LNama.add(nama); 
        this.nbElmn++;
    }

    public void delNama(String nama){
        LNama.remove(nama);
        if (LNama.remove(nama)){
            System.out.println(nama + " berhasil di delete");
            this.nbElmn--;
        } else{
             System.out.println(nama + " tidak ketemu");
        }
        
    }

    public boolean isMember(String nama){
       for (String namaa : LNama) {
            if (namaa == nama){
                return true;
                
            }
        }
        return false;
    }
   public void gantiNama(String namaLama, String namaBaru) {
    for (int i = 0; i < LNama.size(); i++) {
        if (LNama.get(i).equals(namaLama)) {
                LNama.set(i, namaBaru); 
            }
        }
    }

    public int countNama(String nama){
        int hitungTemen = 0;

        for(String n : LNama){
            if(n.equals(nama)){
                hitungTemen ++;
            }
        }
        return hitungTemen;
    }

    public void showTeman(){
        for(String n : LNama){
            
            System.out.println(n);
        }
    }
    
}