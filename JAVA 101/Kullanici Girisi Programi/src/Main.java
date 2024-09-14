import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcı adımız: Patika
        //Kullanıcı e-postamız: patika-java@gmail.com
        //Kullanıcı şifremiz: Java123

        String userName = "Java", userEMail = "patika-java@gmail.com", userPassword = "Java123";
        String userEntr1;
        String userEntr2;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı veya e-posta adresinizi giriniz: ");
        userEntr1 = inp.next();

            if (userEntr1.equals(userName) || userEntr1.equals(userEMail)) {

                System.out.print("Kullanıcı şifrenizi giriniz: ");
                userEntr2 = inp.next();

                    if (userEntr2.equals(userPassword)) {

                        System.out.println("Giriş başarılı.");

                    } else System.out.println("Şifreniz hatalı.");


            } else System.out.println("Kullanıcı adınız veya e-postanız hatalı.");

    }


}