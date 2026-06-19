

class Lingkaran{
    private double jarijari;

    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    public double hitungKeliling(){
        return 2 * Math.PI * jarijari;
    }
}
public class Asersi2 {
    public static void main(String[] args){
        double jarijari = 0;
        assert(jarijari > 0):"jari jari tidak boleh 0";

        Lingkaran lingkaran = new Lingkaran(jarijari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);

        /* penggunaan asersi kurang tepat karena dilakukan pada 
        validasi input, seharus nya asersi dilakukan dalam kondisi kondisional */
    }    
}
