/*
Nama file : lambdalist.java
Deskripsi :  nama nama mahasiswa kedalam list
Penulis : Galvin Shalahudin 24060124140162
*/

import java.util.ArrayList;

public class Lambdalist {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda sebagai sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}