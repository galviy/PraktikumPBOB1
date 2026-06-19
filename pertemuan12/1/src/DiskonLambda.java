/*
Nama file : DiskonLambda.java
Deskripsi :  menghitung diskon
Penulis : Galvin Shalahudin 24060124140162
*/

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon () {
            public double hitungDiskon (int harga) {
                return harga - (harga * 0.3); 
            }
        };

        // with lambdaa
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // with lambda memakai blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}