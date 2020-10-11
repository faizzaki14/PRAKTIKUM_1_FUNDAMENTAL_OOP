package Faizzakiramadhan.PRAKTIKUM.Object;

public class Objek {
    public static void main(String[] args) {

        //Deklarasi object Tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Faiz Zaki Ramadhan");
        mahasiswaTanpa.setNim(19104075);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t : " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t : " + mahasiswaTanpa.getNim());

        //Deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Faiz Zaki Ramadhan", 19104075);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t : " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t : " + mahasiswaTanpa.getNim());

    }
}
