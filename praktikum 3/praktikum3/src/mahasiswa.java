import java.util.ArrayList;

public class mahasiswa {

    /**************** ATRIBUT ******************/
    private String nim, nama, prodi;
    private ArrayList<Matakuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    /**************** KONSTRUKTOR ******************/

    // Konstruktor untuk membuat objek mahasiswa
    public mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Konstruktor default
    public mahasiswa() {
        this("", "", "");
    }


    /**************** SELEKTOR*****************/

    // Mengembalikan NIM mahasiswa
    public String getNIM() {
        return this.nim;
    }

    // Mengembalikan nama mahasiswa
    public String getNama() {
        return this.nama;
    }

    // Mengembalikan program studi mahasiswa
    public String getProdi() {
        return this.prodi;
    }


    /*********************************/

    // Mengubah NIM mahasiswa
    public void setNIM(String newNIM) {
        this.nim = newNIM;
    }

    // Mengubah nama mahasiswa
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // Mengubah program studi mahasiswa
    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }


    /**************** METHOD TAMBAHAN ******************/

    // Menambahkan mata kuliah ke dalam daftar mata kuliah
    public void addMatkul(Matakuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    // Menghitung jumlah total SKS yang diambil mahasiswa
    public int getJumlahSKS() {
        int i;
        int jumlahSks = 0;

        for (i = 0; i < listMatkul.size(); i++) {
            jumlahSks += listMatkul.get(i).getSks();
        }

        return jumlahSks;
    }

    // Mengembalikan jumlah mata kuliah yang diambil
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    // Mengatur dosen wali mahasiswa
    public void setDosenWali(Dosen newDosenWali) {
        this.dosenWali = newDosenWali;
    }

    // Mengatur kendaraan mahasiswa
    public void setKendaraan(Kendaraan newKendaraan) {
        this.kendaraan = newKendaraan;
    }


    /**************** OUTPUT ******************/

    // Menampilkan data dasar mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());

        int i;

        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Nama Mata Kuliah ke-" + (i + 1) + ": " + listMatkul.get(i).getNama());
        }

        System.out.println("No Plat: " + kendaraan.getNoPlat());
    }
}