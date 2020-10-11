package Faizzakiramadhan.PRAKTIKUM.CONSTRUCTOR;

public class Manusia {
    private String nama;
    private int umur;

    //construct pertama
    public Manusia(){}

    //construct kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //construct ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Definisi Methode

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
