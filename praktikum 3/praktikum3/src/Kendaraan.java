public class Kendaraan {

    /**************** ATRIBUT ******************/
    private String noPlat, jenis;


    /**************** KONSTRUKTOR ******************/

    // Konstruktor untuk membuat objek kendaraan
    public Kendaraan(String noPlat, String jenis) {
       

        if (jenis == "motor" || jenis == "mobil" || jenis == "") {
            this.jenis = jenis;
             this.noPlat = noPlat;
        } else {
            System.out.println("invalid jenis, harus motor atau mobil");
        }
    }

    // Konstruktor default
    public Kendaraan() {
        this("", "");
    }


    /**************** SELEKTOR ******************/

    // Mengembalikan nomor plat kendaraan
    public String getNoPlat() {
        return this.noPlat;
    }

    // Mengembalikan jenis kendaraan
    public String getJenis() {
        return this.jenis;
    }


    /**********************************/

    // Mengubah nomor plat kendaraan
    public void setNoPlat(String newNoPlat) {
        this.noPlat = newNoPlat;
    }

    // Mengubah jenis kendaraan
    public void setJenis(String newJenis) {
        if (newJenis == "motor" || newJenis == "mobil") {
            this.jenis = newJenis;
        }
    }
}