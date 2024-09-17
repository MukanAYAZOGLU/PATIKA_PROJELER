import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int num;
        int fakTotal=1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tam sayınızı giriniz: ");
        num=inp.nextInt();

        for (int i = 1; i<=num; i++) {

            fakTotal*=i;

        }

        System.out.println("Girmiş olduğunuz "+num+" sayının faktörİyeli= "+fakTotal);

        /*
           Kombinasyon hesaplayan program yazınız.

           N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

            Kombinasyon formülü

            C(n,r) = n! / (r! * (n-r)!)

        */





    }
}