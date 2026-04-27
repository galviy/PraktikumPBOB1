
package nomor4;


public class Dosen extends Civitasakademika {

    private String nip;

    public String getNip(){
        return this.nip;
    }
    public Dosen(String input,String nip){
        super(input);
        this.nip = nip;
    }

     public String getNomor() {
        return nip;
    }


}
