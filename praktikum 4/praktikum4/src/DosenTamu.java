import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen{
    private String nidk;
    private LocalDate tglBerakhirKontrak;

    private static final double tunjangan = 0.025;


    //konstruktor dosen
     public DosenTamu(String nip, String nidk, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas, String tglBerakhirKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = LocalDate.parse(tglBerakhirKontrak, fmt);

    }

    //mengeluarkan berapa bulan lagi dosen tamu akan berakhir
    public double getMasaKontrakBerakhir() {
        return ChronoUnit.MONTHS.between( LocalDate.now(), this.tglBerakhirKontrak);
    }
    //mengeluarkan nidk dari dosen tamu
    public String getnidk(){
        return nidk;
    }
    //mengeluarkan date dari tanggal berakhir dosen tamu
    public LocalDate getTglBerakhirKontrak(){
        return tglBerakhirKontrak;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("nidk dosen tamu :" + nidk);
        System.out.println("Kontrak berakhir dalam :" + getMasaKontrakBerakhir());
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }

    //mengeluarkan berapa banyak tunjangan dari dosen tamu
    public double getTunjangan(){
        return tunjangan*getGajiPokok();
    }
   
}
