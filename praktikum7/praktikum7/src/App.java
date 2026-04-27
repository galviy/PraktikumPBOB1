import nomor2.*;
import nomor3.*;
import nomor4.*;


public class App {
    public static void main(String[] args) throws Exception {
        // Nomor 1  A*/
        int angka = 65;
        double angka_real = (double)angka;

        System.out.println("angka double -> " + angka_real);


        //*Nomor 1 B */

        angka = (int)angka_real;
        System.out.println("real to int -> " + angka_real);
        //*Nomor 1 C */

        String angka2 = "1234";
        String angka3 = "5678";

        String S = angka2+angka3;

        int z = Integer.parseInt(angka2)+ Integer.parseInt(angka3);
        System.out.println("Konkatenasi -> " + S);
        System.out.println("Pertambahan -> " + z);


        //*Nomor 1 D */

        String P = "12.34";
        String Q = "56.78";

        String R = P+Q;
        double D =Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi P dan Q " + R);
        System.out.println("Pertambahan P dan Q " + D);

        //*Nomor 1 E */

        int A = Integer.parseInt(S);
        System.out.println("Convert S string ke Integer " + A);


        //*Nomor 1 F */
        String T  = Integer.toString(A);
        System.out.println("Convert T string ke Integer " + T);

        /*Nomor 2 */

          // 1. Konstruktor Kosong
        Mahasiswaa mm1 = new Mahasiswaa();
        System.out.println("Default:");
        System.out.println(mm1.getNim() + " - " + mm1.getNama() + " - " + mm1.getProgramStudi());
        System.out.println();

        // 2. Konstruktor parameter
        Mahasiswaa mm2 = new Mahasiswaa("M001", "Galvin", "Informatika");
        System.out.println("Constructor isi:");
        System.out.println(mm2.getNim() + " - " + mm2.getNama() + " - " + mm2.getProgramStudi());
        System.out.println();

        // 3. Copy konstruktor
        Mahasiswaa mm3 = new Mahasiswaa(mm2);
        System.out.println("Copy constructor:");
        System.out.println(mm3.getNim() + " - " + mm3.getNama() + " - " + mm3.getProgramStudi());
        System.out.println();

        // 4. setProgramStudi(String)
        mm3.setProgramStudi("Sistem Informasi");
        System.out.println("Set program studi (String):");
        System.out.println(mm3.getProgramStudi());
        System.out.println();

        // 5. setProgramStudi() kosong
        mm3.setProgramStudi();
        System.out.println("Set program studi kosong:");
        System.out.println(mm3.getProgramStudi());
        System.out.println();

        // 6. setProgramStudi(Mahasiswaa)
        mm3.setProgramStudi(mm2);
        System.out.println("Set program studi dari objek lain:");
        System.out.println(mm3.getProgramStudi());
    

        /*Nomor 3 */
        Anabul a1 = new Anjing("Doggy");
        Anabul a2 = new Kucing("Kitty");
        Anabul a3 = new Burung("Birdy");

            // input array array
        Anabul[] daftar = new Anabul[3];
        daftar[0] = a1;
        daftar[1] = a2;
        daftar[2] = a3;

            // tampilkan semua
        for (int i = 0; i < daftar.length; i++) {
                System.out.println("Nama: " + daftar[i].getNama());
                System.out.print("Gerak: ");
                daftar[i].Gerak();
                System.out.print("Suara: ");
                daftar[i].Bersuara();
                System.out.println("----------------------");
        }
        /*Nomor 4 */

        Seminar seminar = new Seminar();

        
        Dosen d1 = new Dosen("Bu Yeva", "133713371337");
        Dosen d2 = new Dosen("Pak Aries", "133713371338");


        Mahasiswa m1 = new Mahasiswa("Galvin", "24060124140162");
        Mahasiswa m2 = new Mahasiswa("Dinda", "24060124140165");
        Mahasiswa m3 = new Mahasiswa("Rizky ", "24060124120001");
        Mahasiswa m4 = new Mahasiswa("Farras", "24060124120003");
        Mahasiswa m5 = new Mahasiswa("Nabong", "24060124140169");

       
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);


        System.out.println("Total peserta: " + seminar.countPeserta());


        System.out.println("\nDaftar Peserta:");
        seminar.tampilPeserta();

      
        System.out.println("\nJumlah mahasiswa: " + seminar.countMahasiswa());

       
        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
