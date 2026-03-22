/**
 * File : PNS.java
 * Deskripsi :  child kelas manusia kelas PNS dengan implementasi interface pajak
 * Nama : Galvin Shalahudin
 * Tanggal : 17 Maret 2026
**/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements pajak  {

    private String nip;
    static int counterPNS = 0;

    //konstruktor pns sekaligus build parent manusia
    
    
    public PNS(String nama,LocalDate tanggal_masuk,String alamat,double pendapatan, String nip){
        super(nama,tanggal_masuk,alamat,pendapatan);
        counterPNS++;
        this.nip = nip;
    }
    //selektor nip
    public String getNip(){
        return this.nip;
    }
    //setter nip
    public void setNip(String s){
        this.nip = s;
    }
    //turunan interface pajak untuk menghitung pajak
    public double hitungPajak(){
        return getPendapatan()*0.1;
    }

    //fungsi turunan manusia (abstract) untuk menghitung sudah berapa PNS ini bekerja (satuan tahun)
    //+ 2 karena nim ke 14 saya 2
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 2;
    }

     public void cetakInfo(){
        super.cetakInfo();
        System.out.println("nip PNS: " + this.nip);
     }
     static int getCounterPNS(){
        return counterPNS;
     }
}
