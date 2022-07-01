import java.text.DecimalFormat;
import java.util.Scanner;
public class jarak2titik{
    public static void main (String [] args){
        System.out.println("Nama : Yuda Hadi Prasetyo");
        System.out.println("NIM : 065002100004");
        System.out.println("Rabu, 6 April 2022");
        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        int x1,y1,x2,y2;
        double hasil;

        System.out.print("Masukkann nilai x1: ");
        x1 = input.nextInt();

        System.out.print("Masukkann nilai y1: ");
        y1 = input.nextInt();

        System.out.print("Masukkann nilai x2: ");
        x2 = input.nextInt();

        System.out.print("Masukkann nilai y2: ");
        y2 = input.nextInt();

        hasil = Double.valueOf(Math.sqrt(((x2-x1)^2+((y2-y1)))));

        DecimalFormat df = new DecimalFormat("#,##");

        System.out.print("Jarak kedua titik adalah " + (df.format(hasil)));
    }
}
