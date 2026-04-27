package nomor3;


public abstract class Anabul {
    private String nama;

    public Anabul(String input){
        this.nama = input;
    }

    public String getNama(){
        return this.nama;
    }
   public abstract void Gerak();

    public abstract  void Bersuara();
}


