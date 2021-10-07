package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName, password;

        System.out.println("Lutfen kullanici adinizi giriniz: ");
        userName = scanner.nextLine();

        System.out.println("lutfen sifrenizi giriniz :");
        password = scanner.nextLine();

        //Check userName and password
        if (password.equals("java123") && userName.equals("baris")) {
            System.out.println("Giris yaptiniz.");
        } else if (!(password.equals("12345")) && userName.equals("baris")) {
            System.out.println("Sifreniz hatali");

            int secenek;
            String sifreTutucu;

            System.out.println("Sifrenizi sıfırlamak ister misiniz ?");
            System.out.println("1.EVET \t 2.HAYIR");

            secenek = scanner.nextInt();

            // Switch-case to operate password operationss
            switch (secenek) {

                case 1:

                    sifreTutucu = password;
                    System.out.println("Lutfen yeni sifrenizi giriniz:");

                    scanner.nextLine();
                    password = scanner.nextLine();
                    //checking password is the same wrong-enter and valid password
                    if (sifreTutucu.equals(password) || password.equals("java123")) {
                        System.out.println("Yeni sifreniz eski sifreniz veya hatali giris yaptiginiz sifreniz ile ayni olamaz");
                    } else System.out.println("Sifre Degisti");

                    break;

                case 2:
                    System.out.println("Sifrenizi degistirmek istemediniz.");
                    break;

                default:
                    System.out.println("Yanlis secim yapildi.");

            }
        } else if (password.equals("12345") && !(userName.equals("baris"))) {
            System.out.println("Kullanici adiniz hatali:");
        } else System.out.println("Hatali islem");

    }
}
