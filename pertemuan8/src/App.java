
import GENERIK.*;
import binatang.*;
import binatang.jenis_kucing.anggora;
import binatang.jenis_kucing.kembangtelon;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
       
        Datum<Integer> a = new Datum<>(1337);
        Datum<Integer> b = new Datum<>(7331);

        System.out.println("Integer sebelum: a=" + a.getIsi() + ", b=" + b.getIsi());

        OperatorGenerik.Tukar(a, b);

        System.out.println("Integer sesudah: a=" + a.getIsi() + ", b=" + b.getIsi());


    
        Datum<String> s1 = new Datum<>("i use cachy os btw");
        Datum<String> s2 = new Datum<>("i use aarch btw");

        System.out.println("String sebelum: s1=" + s1.getIsi() + ", s2=" + s2.getIsi());

        OperatorGenerik.Tukar(s1, s2);

        System.out.println("String sesudah: s1=" + s1.getIsi() + ", s2=" + s2.getIsi());



        Datum<Anabul> guguk = new Datum<>(new Anjing("husky"));
        Datum<Anabul> mengmeng = new Datum<>(new Kucing("Miuza",10));

        System.out.println("Sebelum:");
        guguk.getIsi().Bersuara();
        mengmeng.getIsi().Bersuara();

        OperatorGenerik.Tukar(a, b);

        System.out.println("Sesudah:");
        guguk.getIsi().Bersuara();
        mengmeng.getIsi().Bersuara();
        //

        anggora k1 = new anggora("hailey beiber", 3.5);
        anggora k2 = new anggora("justin beiber", 4.0);

        double total = OperatorGenerik.Bobot2(k1, k2);
        System.out.println("Total bobot Anggora: " + total);

        kembangtelon p1 = new kembangtelon("Kitty", 5.0);
        kembangtelon p2 = new kembangtelon("Snow", 4.5);

        double total2 = OperatorGenerik.Bobot2(p1, p2);
        System.out.println("Total bobot Persia: " + total2);



        data<Anabul> dataHewan = new data<>();

        dataHewan.setIsi(1, new Kucing("Milo",10));
        dataHewan.setIsi(2, new Anjing("Doggy"));

        dataHewan.getIsi(1).Bersuara();
        dataHewan.getIsi(2).Bersuara();
    
      
    }
}
