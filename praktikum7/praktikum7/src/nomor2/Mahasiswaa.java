package nomor2;

public class Mahasiswaa {

    /*Nomor 2 A */

    private String nim;
    private String nama;
    private String Programstudi;



    /*Nomor 2 B */
    public Mahasiswaa(String nim,String nama,String Programstudi){
        this.nim = nim;
        this.nama = nama;
        this.Programstudi = Programstudi;
    }

    
    /*Nomor 3E */

    public Mahasiswaa(Mahasiswaa m){
        this.nim = m.getNim();
        this.nama = m.getNama();
        this.Programstudi = m.getProgramStudi();
        
    }


    public String getNim(){
        return this.nim;
    }
    public String getNama(){
        return this.nama;
    }
    public String getProgramStudi(){
        return this.Programstudi;
    }

    public void setProgramStudi(){
        this.Programstudi = "";
    }
    public void setProgramStudi(String input){
        this.Programstudi = input;
    }
     public void setProgramStudi(Mahasiswaa P){
        this.Programstudi = P.getProgramStudi();
     }

      /*Nomor 2 C */
     public Mahasiswaa(){
        this.nim = "-999";
        this.nama = "n/a";
        this.Programstudi = "n/a";
     }
    

     /*nomor 3 */
     


}
