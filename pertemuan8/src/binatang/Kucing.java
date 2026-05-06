package binatang;

public class Kucing extends Anabul{

    double bobot;

    public Kucing(String input,double b){
        super(input);
        this.bobot = b;
    }
    public void Gerak(){
        System.out.println("Berjalan");
    }

    public  void Bersuara(){
        System.out.println("Meong Meong maong");
    }
    public double getBobot(){
        return this.bobot;
    }
}

