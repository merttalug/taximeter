package TemelVeriTipleriVeKullaniciGirisleri;
import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        double km,taxiFare,minTaxiFare;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the distance you traveled by taxi in kilometers: ");
        km=input.nextDouble();

        taxiFare= 10.0 + 2.20*km;

        minTaxiFare=20.0;


        taxiFare = (taxiFare<20.0) ? minTaxiFare : taxiFare;


        System.out.println("Taxi fare amount that you have to pay: " + taxiFare);







    }


}
