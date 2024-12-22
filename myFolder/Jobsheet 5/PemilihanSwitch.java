import java.util.Scanner;

public class PemilihanSwitch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int angka1, angka2, hasil = 0;
            char operator;

            System.out.print("Masukkan angka 1: ");
            angka1 = sc.nextInt();
            System.out.print("Masukkan angka 2: ");
            angka2 = sc.nextInt();
            System.out.print("masukkan operator (+ - * /): ");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+' -> hasil = angka1 + angka2;
                case '-' -> hasil = angka1 - angka2;
                case '*' -> hasil = angka1 * angka2;
                case '/' -> hasil = angka1 / angka2;
                default -> System.out.println("Operator tidak valid");
            }
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
    }
}