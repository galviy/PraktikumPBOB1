

import Teman.*;
import binatang.*;
import binatang.jenis_kucing.anggora;
import Piaraan.*;



public class App {
    public static void main(String[] args) throws Exception {
        Teman galvin = new Teman();
        galvin.addNama("Dinda");
        galvin.setNama(0, "Dinda isyariani");

        galvin.showTeman();
        int teman_galvin = galvin.getNbelm();
        System.out.println("Total teman galvin " + teman_galvin);

        Anjing p = new Anjing("Guguk");
        Kucing p2 = new anggora("Maong", 30);

        System.out.println("\n");
        Piaraan penampungan = new Piaraan();
        penampungan.enqueueAnabul(p);
        penampungan.enqueueAnabul(p2);
        penampungan.showAnabul();
        penampungan.countKucing();
        int total_meong = penampungan.countKucing();
        System.out.println("Total kucing " + total_meong);

        double total_berat_meong = penampungan.bobotKucing();
        System.out.println("Total berat meong " + total_berat_meong);
        penampungan.showJenisAnabul();
    }
}

/*
SRS software requirements specification
US user story
UCD user centered design
AD
 */