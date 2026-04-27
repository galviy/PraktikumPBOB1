package nomor4;

public abstract class Civitasakademika {
    private String nama;

    Civitasakademika(String input){
        this.nama = input;

    }

    public String getNama(){
        return this.nama;
    }
    
     public abstract String getNomor(); 
  
}
