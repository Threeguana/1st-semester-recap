import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tahun;
            
            System.out.print("Masukkan tahun: ");
            tahun = sc.nextInt();

            if ((tahun % 4) == 0) {
                if ((tahun % 100) != 0) 
                    System.out.println(tahun + " adalah tahun kabisat");
            } else {
                System.out.println(tahun + " bukan tahun kabisat");
            }
        }
    }
}