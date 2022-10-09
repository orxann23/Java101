import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();
        System.out.print("Turkce Notunuz :");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();
        System.out.print("Muzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamaniz :" + ortalama);

        String durum = (ortalama >= 60) ? "\"Sinifi Gectiniz\" " : "\"Sinifta Kaldiniz\"";
        System.out.print("Genel Durumunuz :" + durum);





    }
}
