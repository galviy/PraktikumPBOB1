
public class App {

    public static void main(String[] args) throws Exception {
        
        // Membuat objek mata kuliah
        Matakuliah PBO = new Matakuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        Matakuliah MBD = new Matakuliah("MBD", "Manajemen Basis Data", 3);
       mahasiswa M1 = new mahasiswa("24060124140162", "Galvin Shalahudin Mumtaz", "Informatika");

          // Membuat objek dosen
        Dosen D1 = new Dosen("1291291212", "Rismiyati", "Informatika");

        // Membuat objek kendaraan
        Kendaraan K1 = new Kendaraan("B705GSM", "MOBIL");
        //set dosen wali
         M1.setDosenWali(D1);

        // Mengatur kendaraan mahasiswa
        M1.setKendaraan(K1);

        // Menambahkan mata kuliah
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);

        // Menampilkan detail mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());

        // Menampilkan jumlah SKS
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());

    }
}
