import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        int num;
        int howMany=0;
        int total=0;


        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Lütfen sayınızı giriniz: ");
            num=inp.nextInt();

            if (num%2==1) {

                System.out.println("Tek sayı: "+num);

                total+=num;
                howMany++;
            }

            else System.out.println("Çift sayı: "+num);

        }while(num>=0);

        System.out.println("Toplamda "+howMany+" adet tek sayı girdiniz.");
        System.out.println("Girmiş olduğunuz tek sayıların toplamı= "+total);

    }
}