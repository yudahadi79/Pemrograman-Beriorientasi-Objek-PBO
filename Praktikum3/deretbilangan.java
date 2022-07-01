import java.util.Scanner;
public class deretbilangan {
    public static void main (String [] args ){
        System.out.println("Nama : Yuda Hadi Prasetyo");
        System.out.println("NIM : 065002100004");
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Masukkan Bilangan x : ");
        x = input.nextInt();
        if(x % 2 == 1) {
            DeretGanjil(x);
        }
        else{
            DeretGenap(x);
        }
    }

    public static void DeretGanjil(int x) {
        int deret = x ;
        System.out.println("\nHasil = ") ;
        for (deret = x ; deret>=1;deret--){
            System.out.println(deret);
            deret-- ;
        }
        System.out.println("Deret Bilangan Ganjil");
    }

    public static void DeretGenap(int x) {
        int deret = x ;
        System.out.println("\nHasil = ") ;
        for(deret = x ;deret>=1;deret--){
            System.out.println(deret) ;
            deret-- ;
        }
        System.out.println("Deret Bilangan Genap") ;
    }
}
