package GENERIK;


public class data<T> {
    private T[] ruang;     
    private int banyak;    

    public data() {
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    public T getIsi(int index) {
        if (index < 1 || index > 100) {
            throw new IndexOutOfBoundsException("Indeks harus 1..100");
        }
        return ruang[index - 1]; // karena array Java 0-based
    }

    public void setIsi(int index, T nilai) {
        if (index < 1 || index > 100) {
            throw new IndexOutOfBoundsException("Indeks harus 1..100");
        }

        if (ruang[index - 1] == null && nilai != null) {
            banyak++;
        } else if (ruang[index - 1] != null && nilai == null) {
            banyak--; 
        }

        ruang[index - 1] = nilai;
    }

    public int getSize() {
        return banyak;
    }
}

/* 
class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}


*/