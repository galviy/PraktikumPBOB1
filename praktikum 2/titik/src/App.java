public class App {
    public static void main(String[] args) {
        //membuat object titik di 0,0
        Titik T1 = new Titik(); 
        // Membuat objek titik T2 
        Titik T2 = new Titik(7, 2); 
        //mengubah absis 
        T1.setAbsis(4);
        //mengubah ordinat
        T1.setOrdinat(1); 
        //print titik t1
        T1.printTitik();

        T1.geser(9, 1); // Menggeser T1 
        T1.printTitik(); // Menampilkan koordinat T1 setelah digeser
    }
}
