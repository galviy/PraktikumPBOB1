package nomor4;

public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakPeserta = 0;
    }


    public int countPeserta() {
        return banyakPeserta;
    }

   
    public void registrasi(Civitasakademika p) {
        if (banyakPeserta < pesertas.length) {
            pesertas[banyakPeserta] = p; // kontigu
            banyakPeserta++;
        } else {
            System.out.println("Seminar penuh!");
        }
    }

   
    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
    }

   
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}