package Faizzakiramadhan.PRAKTIKUM.pass;

public class testpass {
    int nomor1,nomor2;

    public testpass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //pass by value
    void calculate(int m, int n){
        m = m*10;
        n = n/2;
    }

    //pass by reference
    void calculate(testpass passed){
        passed.nomor1 = passed.nomor1 * 10;
        passed.nomor2 = passed.nomor2 /2;
    }
}
