import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java ile kullanıcıdan dik kenarlar uzunluğu alan ve hesaplayan program yazınız.
        //Değişkenlerimizi oluşturup projeye başlayalım.
        int a, b;
        double c;

        //Kullanıcıdan verilerimizi alalım
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("2. kenarı giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : " + c);
        


    }
}