/**
 * File : petani.java
 * Deskripsi :  child kelas manusia kelas petani dengan implementasi interface pajak
 * Nama : Galvin Shalahudin
 * Tanggal : 17 Maret 2026
**/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class petani extends Manusia implements pajak  {

    private String asal_kota;
    static int counterPetani = 0;

    //konstruktor pns sekaligus build parent manusia

    public petani(String nama,LocalDate tanggal_masuk,String alamat,double pendapatan, String asal_kota){
       super(nama,tanggal_masuk,alamat,pendapatan);
        counterPetani++;
        this.asal_kota = asal_kota;
    }
    //selektor nip
    public String getNip(){
        return this.asal_kota;
    }
    //setter nip
    public void setNip(String s){
        this.asal_kota = s;
    }
    //turunan interface pajak untuk menghitung pajak
    public double hitungPajak(){
        return 0;
    }

    //fungsi turunan manusia (abstract) untuk menghitung sudah berapa PNS ini bekerja (satuan tahun)
    //+ 2 karena nim ke 12 saya 1
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 1;
    }
    static int getCounterPetani(){
        return counterPetani;
    }

     public void cetakInfo(){
        super.cetakInfo();
        System.out.println("asal kota petani: " + this.asal_kota);
     }
}
