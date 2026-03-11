public class titik {

    /**************** ATRIBUT ******************/
    private double absis;
    private double ordinat;
    static int countertitik;
     /**************** METHOD ******************/

    titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        countertitik ++;
    }

    titik(){
        absis = 0;
        ordinat = 0;
        countertitik ++;
    }
   // Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }
    // Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }
// Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }
 // Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
// Mencetak nilai Counter Titik
    public void printCounterTitik(){
        System.out.println(countertitik);
    }
    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return countertitik;
    }
   // mengembalikan nilai kuadran titik
    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else if (getAbsis() > 0 && getOrdinat() < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // mengembalikan jarak titik dari titik pusat
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
    }
    // mengembalikan jarak titik dari titik lainnya
    public double getJarak(titik T) {
        return Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
    }

    // mengubah titik menjadi titik refleksi terhadap sumbu X
    public void refleksiX() {
        setOrdinat(getOrdinat() * -1);
    }

    // mengubah titik menjadi titik refleksi terhadap sumbu Y
    public void refleksiY() {
        setAbsis(getAbsis() * -1);
    }

 // mengembalikan titik hasil refleksi terhadap sumbu X
    public titik getRefleksiX() {
        titik THasil = new titik(getAbsis(), getOrdinat());
        THasil.refleksiX();
        return THasil;
    }
 // mengembalikan titik hasil refleksi terhadap sumbu Y
    public titik getRefleksiY() {
        titik THasil = new titik(getAbsis(), getOrdinat());
        THasil.refleksiY();
        return THasil;
    }
    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double dx, double dy) {
        absis = absis + dx;
        ordinat = ordinat + dy;
    }
}