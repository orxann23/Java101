package Giris;
import java.util.Scanner;

public class Taximeter {
    public static void main (String[] args){

        double km, total, finalPrice, perKM = 2.20, openingPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter KM :");
        km = input.nextDouble();
        total = openingPrice + (km*perKM);
        System.out.println("Total Price :" + total);

        finalPrice = (total < 20) ? 20 : total;
        System.out.println("Final Price :" + finalPrice);

    }
}
