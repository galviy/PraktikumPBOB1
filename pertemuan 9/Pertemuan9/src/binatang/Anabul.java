package binatang;

public abstract class Anabul {
    private String nama;

    public Anabul(String input){
        this.nama = input;
    }

    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama; 
    }
    public abstract void Gerak();

    public abstract  void Bersuara();
}
