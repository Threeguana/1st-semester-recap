import java.util.Scanner;

public class Kendaraan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int jenis, durasi, total = 0;
            while (true) {
                System.out.println("Jenis Kendaraan:");
                System.out.println("1. Mobil");
                System.out.println("2. Motor");
                System.out.println("0. Keluar");
                System.out.print("Masukkan jenis kendaraan: ");
                jenis = sc.nextInt();
                
                if (jenis == 0) {
                    System.out.println("Anda keluar.");
                    break;
                }
                
                System.out.print("Masukkan durasi parkir dalam jam: ");
                durasi = sc.nextInt();
                
                if (durasi > 5) {
                    total += 12500;
                } else {
                    switch (jenis) {
                        case 1 -> total += 3000 * durasi;
                        case 2 -> total += 2000 * durasi;
                        default -> {
                            System.out.println("Jenis kendaraan tidak dikenali.");
                            continue;
                        }
                    }
                }
                
                System.out.println("Total biaya parkir: Rp " + total);
            }
        }
    }
}
