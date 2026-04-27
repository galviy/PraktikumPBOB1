
package nomor4;


public class Mahasiswa extends Civitasakademika {

    private String nim;

    private Dosen dosenWali;
   
    public Mahasiswa(String input,String nim){
        super(input);
        this.nim = nim;
    }

    
     public String gitNim(){
        return this.nim;
    }
    public String getNomor() {
        return nim;
    }

     public void setWali(Dosen d) {
        this.dosenWali = d;
    }


     public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + getNama());
        if (dosenWali != null ){
            System.out.println("Dosen Wali: "  + dosenWali.getNama());
        }
        
        System.out.println();
    }


}
