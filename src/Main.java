import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // Kullanıcı veri girişi
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = inp.nextInt();
        //Geçerli sayı girilmezse hata ver
        if (n <= 0) {
            System.out.print("Geçersiz giriş lütfen pozitif bir tam sayı giriniz.");
        } else {
            int min = 0;
            int max = 0;
            //Kullanıcının girdiği sayıya göre input döndürüp sayıları alma
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". sayıyı giriniz : ");
                int num = inp.nextInt();
                //Min ve Max'ı buluyoruz
                if (i == 0) {
                    min = num;
                    max = num;
                }
                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                }
            }
            System.out.println("En küçük sayı : " + min);
            System.out.print("En büyük sayı : " + max);
        }
    }
}