import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        r= yarı çap
        π= pi (3.14)

        Dairenin Çevre Formülü : 2 * π * r;
        Dairenin Alan Formülü : π * r * r;
         */

        Scanner inp= new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        double r=inp.nextInt();

        double pi=3.14;
        double cvr=2*pi*r;
        double aln=pi*Math.pow(r,2);

        System.out.println("Dairenin yarı çapı= "+r);
        System.out.println("Dairenin çevresi= "+cvr);
        System.out.println("Dairenin alanı= "+aln);












    }
}