import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Pegawai{
    private String nip;
    private String nama;
    LocalDate tanggalLahir, tmt;
    private double gajiPokok;

    static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));



    Pegawai(String nip,String nama,String tanggalLahir,String tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
  

        this.tanggalLahir = LocalDate.parse(tanggalLahir, fmt);
        this.tmt = LocalDate.parse(tmt, fmt);

        this.gajiPokok = gajiPokok;
    }

    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }

    public LocalDate getTglLahir() {    
        return tanggalLahir;
    }
    public LocalDate getTmt(){
        return tmt;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
     public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tglLahir){
        this.tanggalLahir = tglLahir;
    }
     public void setTmt(LocalDate tmt) { 
        this.tmt = tmt; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

     public Period getMasaKerja()
    {
        return Period.between(tmt, LocalDate.now());
    }
   

     public void printInfo()
    {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.format(fmt));
        System.out.println("TMT             : " + tmt.format(fmt));
        System.out.println("Masa Kerja      : " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }

}