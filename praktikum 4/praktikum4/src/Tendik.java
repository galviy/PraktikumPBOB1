import java.time.LocalDate;



public class Tendik extends Pegawai {
     private String bidang; 
     private static final int BUP = 55;
     private static final double tunjangan = 0.01;

     //konstruktor tendik
     public Tendik(String nip, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }
    //set bidang
    public void setBidang(String bidang){
     this.bidang = bidang;
    }
    //mengeluarkan bidang
    public String getBidang(){
     return bidang;
    }

    //print tunjangan berdasarkan berapa lama telah bekerja
    
    public double getTunjangan() {
        return tunjangan * getMasaKerja().getYears() * getGajiPokok();
    }
    
    //mendapatkan tanggal pensiun
 
    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }


}
