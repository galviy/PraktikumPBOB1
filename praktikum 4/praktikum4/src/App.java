

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      //  BangunDatar p = new Persegi(2,"putih","gatau");
        //p.printInfo();
        //    public DosenTetap(String nip, String nidn, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        DosenTetap p = new DosenTetap("9545647548", "212212121", "Jordan Selatan","7 Agustus 1965","1 Januari 2020",10000000,"STEI-Komputasi");
        p.printInfo();

        // DosenTamu(String nip, String nidk, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas, String tglBerakhirKontrak) {
         DosenTamu p2 = new DosenTamu("9545647548", "212212121", "Jordan Timur","7 Agustus 1965","1 Januari 2020",10000000,"STEI-Rekayasa","1 Januari 2027");
        p2.printInfo();
    }
}
