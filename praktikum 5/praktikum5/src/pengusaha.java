import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class pengusaha extends Manusia implements pajak  {

    private String npwp;
    static int counterPengusaha = 0;

    //konstruktor pns sekaligus build parent manusia
    
    public pengusaha(String nama,LocalDate tanggal_masuk,String alamat,double pendapatan, String npwp){
        super(nama,tanggal_masuk,alamat,pendapatan);
        counterPengusaha++;
        this.npwp = npwp;
    }
    //selektor nip
    public String getnpwp(){
        return this.npwp;
    }
    //setter nip
    public void setNpwp(String s){
        this.npwp = s;
    }
    //turunan interface pajak untuk menghitung pajak
    public double hitungPajak(){
        return getPendapatan()*0.15;
    }

    //fungsi turunan manusia (abstract) untuk menghitung sudah berapa PNS ini bekerja (satuan tahun)
    //+6 karena nim ke 13 saya 6                                                                  //
    public int hitungMasaKerja(){

        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 6;
    }
    static int getCounterPengusaha(){
        return counterPengusaha;
    }
     public void cetakInfo(){
        super.cetakInfo();
        System.out.println("npwp pengusaha: " + this.npwp);
     }
}
