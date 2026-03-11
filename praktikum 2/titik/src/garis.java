
public class garis {
    private titik TAwal, Takhir;
    static int counterGaris;

    // Kontruktor dengan parameter
    garis(titik TAwal, titik TAkhir) {
        this.TAwal = TAwal;
        this.Takhir = TAkhir;
        counterGaris++;
    }

    // Kontruktor tanpa parameter
    public garis() {
        this.TAwal = new titik();   
        this.Takhir = new titik();
        counterGaris++;
    }

    // Selektor titik awal
    public titik getTitikAwal() {
        return this.TAwal;
    }

    // selektor titik akhir
    public titik getTitikAkhir() {
        return this.Takhir;
    }

    // mutator titik awal
    public void setTitikAwal(titik T) {
        this.TAwal = T;
    }

    // mutator titik akhir
    public void setTitikAkhir(titik T) {
        this.Takhir = T;
    }

    // selektor untuk counter garis
    public int getCounterGaris() {
        return counterGaris;
    }

    // mengemmbalikan panjang garis (jarak antara titik awal dan titik akhir)
    public double getPanjang() {
        return getTitikAwal().getJarak(getTitikAkhir());
    }

    // mengembalikan nilai gradien garis
    public double getGradien() {
        return (getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat()) /
           (getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
}

    // mengembalikan titik tengah dari garis
    public titik titikTengah() {
        titik THasil = new titik((getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2,
                (getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2);
        return THasil;
    }

    // memeriksa apakah suatu garis sejajar dengan garis lainnya
    public boolean isSejajar(garis G) {
        return getGradien() == G.getGradien();
    }

    // memeriksa apakah suatu garis itu tegak lurus dengan garis lainnya
    public boolean isTegakLurus(garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    // menampilkan titik awal dan titik akhir dari suatu garis
    public void printGaris() {
        System.out.println(getTitikAwal());
        System.out.println(getTitikAkhir());
    }

    // menampilkan suatu garis dalam persamaan garis lurus
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = getTitikAwal().getOrdinat() - (m * getTitikAwal().getAbsis());
        return "y = " + m + "x + " + c;
    }
}
