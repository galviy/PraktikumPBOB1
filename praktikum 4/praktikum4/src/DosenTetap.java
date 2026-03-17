import java.time.LocalDate;


public class DosenTetap extends Dosen {
     private String nidn;
     private static final int BUP = 65;


    private static final double tunjangan = 0.02;


    //konstruktor dosen
     public DosenTetap(String nip, String nidn, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;

    }

    //mengeluarkan berapa bulan lagi dosen tamu akan berakhir
  
    //mengeluarkan nidk dari dosen tamu
    public String getnidn(){
        return nidn;
    }
    //mengeluarkan date dari tanggal berakhir dosen tamu


    public void printInfo(){
        super.printInfo();
        System.out.println("nidn dosen tetap :" + nidn);
   
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }

    //mengeluarkan berapa banyak tunjangan dari dosen tamu
    public double getTunjangan(){
        return tunjangan*getMasaKerja().getYears()*getGajiPokok();
    }

     public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }
   
}
