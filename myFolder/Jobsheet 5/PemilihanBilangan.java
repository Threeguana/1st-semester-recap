import java.util.Scanner;

public class PemilihanBilangan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          int angka;
          
          System.out.print("Masukkan angka: ");
          angka = sc.nextInt();

          if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah genap");
          } else {
            System.out.println("Angka " + angka + " adalah ganjil");
          }
        }
    }
}