package Faizzakiramadhan.PRAKTIKUM.CONSTRUCTOR;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arraymanusia[] = new Manusia[3];

        Manusia manusial = new Manusia(); //construct 1
        manusial.setNama("Faiz");
        manusial.setUmur(20);

        Manusia manusia2 = new Manusia("Adam"); //construct 2
        Manusia manusia3 = new Manusia("Vito",20); //construct 3

        arraymanusia[0] = manusial;
        arraymanusia[1] = manusia2;
        arraymanusia[2] = manusia3;

        for (Manusia x : arraymanusia){
            System.out.println("Character ");
            System.out.println("Nama\t : " + x.getNama());
            System.out.println("Umur\t : " + x.getUmur());
        }
    }

}
