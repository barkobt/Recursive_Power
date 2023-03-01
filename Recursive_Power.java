import java.util.Scanner;
/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
        f(1) = 2
        f(2) = 2.2
        f(3) = 2.2.2 = f(2).2
        f(4) = 2.2.2.2 = f(3).2

 */

public class Recursive_Power {
    static int f(int base, int times) {
        if (times == 0) {
            return 1;
        } else {
            return base*f(base,times-1);
        }


    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir taban sayısı giriniz:");
        int base = scan.nextInt();
        System.out.println("Bir üs giriniz:");
        int times = scan.nextInt();
        System.out.println("Sonuç: " + f(base,times));
    }
}
