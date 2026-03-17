public class Dosen extends Pegawai
{

    private String fakultas;

    //konstruktor dosen
    public Dosen(String nip, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas)
    {
        super(nip, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
    //get fakultas
    public String getFakultas() { 
        return fakultas;
    }
    //set fakultas
    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }
    //print fakultas dan informasi dari parent
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas " + fakultas);
    }
}