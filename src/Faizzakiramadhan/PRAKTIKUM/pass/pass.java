package Faizzakiramadhan.PRAKTIKUM.pass;

public class pass {

    //class main
    public static void main (String[] args){
        int nomor1, nomor2;

        testpass passed = new testpass(50,100);
        nomor1 = 10;
        nomor2 = 20;

        System.out.println("Nilai sebelum passed by value\t");
        System.out.println("Nomor1\t : " + nomor1);
        System.out.println("Nomor2\t : " + nomor2);

        passed.calculate(nomor1,nomor2);
        System.out.println("nilai setelah passed by value\t");
        System.out.println("Nomor1\t : " + nomor1);
        System.out.println("Nomor2\t : " + nomor2);
        System.out.println();

        //passed by reference
        System.out.println("Nilai sebelum passed reference\t : ");
        System.out.println("passed.nomor1\t : " + passed.nomor1);
        System.out.println("passed.nomor2\t : " + passed.nomor2);

        passed.calculate(passed);
        System.out.println("Nilai setelah passed reference\t : ");
        System.out.println("passed.nomor1\t : " + passed.nomor1);
        System.out.println("passed.nomor2\t : " + passed.nomor2);

    }
}
