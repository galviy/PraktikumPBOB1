
import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    static int counterMns = 0;

    static String nim = "24060124140162";

    //konstruktor manusia
    public Manusia(){}
    public Manusia(String nama,LocalDate tanggal_masuk,String alamat,double pendapatan ){
         counterMns++;
         this.nama = nama;
         this.tgl_mulai_kerja = tanggal_masuk;
         this.pendapatan = pendapatan;
         this.alamat = alamat;
    }
    
    //getter

    //menggembalikan value private dari nama
    public String getNama(){
        return this.nama;
    }

   //menggembalikan value private dari tanggal mulai kerja
    public LocalDate getTgl_mulai_kerja(){
        return this.tgl_mulai_kerja;
    }

    public String getAlamat(){
        return this.alamat;
    }
    //menggembalikan value private dari pendapatan 
    public double getPendapatan(){
        return this.pendapatan;
    }
    public void setAlamat(String s){
        this.alamat = s;
    }
    static int getCounterMns(){
        return counterMns;
    }

    //set value untuk mengganti nama menjadi nama baru
    public void setNama(String s){
        this.nama = s;
    }

    //set value untuk mengganti tanggal mulai kerja menjadi tanggal baru
    public void setTgl_mulai_kerja(LocalDate s){
        this.tgl_mulai_kerja = s;
    }

    //set value untuk mengganti pendepatan menjadi pendapatan baru
    public void setpendapatan(double p){
        this.pendapatan = p;
    }
    
    public void cetakInfo(){
        System.out.println("Nama Manusia: " + this.nama + "\nTanggal Masuk: " + tgl_mulai_kerja + "\npendapatan: " + this.pendapatan);
    }
    public abstract int hitungMasaKerja();
}
