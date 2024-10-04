import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfElements;
        int min, max, closestNumberMin, closestNumberMax;
        int number;

        Scanner inp = new Scanner(System.in);


        System.out.print("Dizinizde kaç eleman olmasını istersiniz: ");
        numberOfElements=inp.nextInt();

        int [] myArray= new int[numberOfElements];


        System.out.println("Dizi elemanlarınızı giriniz: ");

        for (int i = 0; i <numberOfElements ; i++) {

            myArray[i]=inp.nextInt();
        }

        System.out.print("Dizi elemanlarınız: ");

        for (int a :myArray ) {
            System.out.print(a+" ");

        }

        min=myArray[0];
        max=myArray[0];

    for (int i : myArray ) {

        if (i>max) {

            max=i;

            }

        if (i<min) {

            min=i;

            }

        }
        System.out.println();

        System.out.println("Dizideki en küçük rakam= "+min);
        System.out.println("Dizideki en büyük rakam= "+max);

        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program

        System.out.print("Sayınızı giriniz: ");
        number=inp.nextInt();


        Arrays.sort(myArray);

        for (int j = myArray.length-1; j>=0 ; j--) {

            if (myArray[j]<number) {

                closestNumberMin=myArray[j];
                System.out.println("Girmiş olduğunuz rakama en yakın kendisinden küçük rakam: "+closestNumberMin);
                break;

            }

        }


        for (int i : myArray ) {

            if (i>number) {

                closestNumberMax=i;
                System.out.println("Girmiş olduğunuz rakama en yakın kendisinden büyük rakam: "+closestNumberMax);
                break;

            }
        }







        }
    }