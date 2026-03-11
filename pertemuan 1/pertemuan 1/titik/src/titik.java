public class titik {

    private double absis;
    private double ordinat;

    
    titik() {
        absis = 0;
        ordinat = 0;
    }


    double getAbsis(){
        return absis;
    }


    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }


    void setOrdinat(double y){
        ordinat = y;
    }


    void geser(double x, double y){
        this.absis = absis +x;
        this.ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
