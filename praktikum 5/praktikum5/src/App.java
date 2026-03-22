import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class App {
    // LocalDate.parse("01-04-2010", fmt)
    public static void main(String[] args) throws Exception {
         DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        PNS p1 =new PNS("Satrio",  LocalDate.parse("01-04-2006", fmt), "Jl. Seroja", 15000000.0, "198302032006041002");
       
        pengusaha pe1 = new pengusaha("Adhy", LocalDate.parse("01-01-2000", fmt), "Jl. Air", 55000000.0, "000-556-773-212-000-5");
        petani pt1 = new petani("Nugraha", LocalDate.parse("09-01-1977", fmt), "Jl. Bunga 9 Tembalang", 5000000.0, "wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.parse("01-04-2010", fmt), "", 10000000.0, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");



        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        // PNS(String nama,LocalDate tanggal_masuk,String alamat,double pendapatan, String nip){
    }
}
