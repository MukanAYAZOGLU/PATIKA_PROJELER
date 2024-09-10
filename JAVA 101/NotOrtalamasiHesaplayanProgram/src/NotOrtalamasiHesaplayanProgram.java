
import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {


        Scanner inp= new Scanner(System.in);


        int matNot, fizikNot, cogfNot, turkceNot,bedenNot, kimyaNot, geoNot;

        System.out.print("Lütfen matematik notunu giriniz");
        matNot=inp.nextInt();

        System.out.print("Lütfen fizik notunu giriniz");
        fizikNot=inp.nextInt();

        System.out.print("Lütfen coğrafya notunu giriniz");
        cogfNot=inp.nextInt();

        System.out.print("Lütfen Türkçe notunu giriniz");
        turkceNot=inp.nextInt();

        System.out.print("Lütfen deben eğitimi notunu giriniz");
        bedenNot=inp.nextInt();

        System.out.print("Lütfen kimya notunu giriniz");
        kimyaNot=inp.nextInt();

        System.out.print("Lütfen geometri notunu giriniz");
        geoNot=inp.nextInt();

        int toplam=(matNot+geoNot+turkceNot+fizikNot+bedenNot+cogfNot+kimyaNot);

        double ort=toplam/7;

        System.out.println("Ders ortalamanız= "+ort);

        String gecKal=ort>=65 ? "Başarılı" : "Kaldı";

        System.out.println(gecKal);


    }
}






