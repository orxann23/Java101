package Giris;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Degiskenler
        double a, b, c, u, trianglePerimeter, area;
        // Scanner ayarlama ve daha guzel gozukmesi icin extra duzenleme
        Scanner tri = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = tri.nextInt();
        System.out.print("Enter B: ");
        b = tri.nextInt();
        System.out.print("Enter C: ");
        c = tri.nextInt();
        // U'yu bulmak icin hesaplama 𝑢 = (a+b+c) / 2
        u = (a+b+c)/2;
        System.out.println("Value of U:"  + u);
        // Cevreyi bulmak icin hesapalama/atama Ucgenin cevresi = 2𝑢
        trianglePerimeter = 2*u;
        System.out.println("Triangle Perimeter:"  + trianglePerimeter);
        // Alanin bulbunmasi Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Triangle Area:"  + area);



    }
}
