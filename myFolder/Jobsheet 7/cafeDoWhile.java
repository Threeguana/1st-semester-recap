import java.util.Scanner;

public class cafeDoWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int kopi, teh, roti;
            String nama;
            float hargaKopi = 12000, hargaTeh = 5000, hargaRoti = 20000;

            do {
                System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
                nama = sc.nextLine();
                if (nama.equalsIgnoreCase("batal")) {
                    System.out.println("Terima kasih telah berkunjung ke cafe kami!");
                    break;
                }
                System.out.print("Masukkan jumlah kopi yang dipesan: ");
                kopi = sc.nextInt();
                System.out.print("Masukkan jumlah teh yang dipesan: ");
                teh = sc.nextInt();
                System.out.print("Masukkan jumlah roti yang dipesan: ");
                roti = sc.nextInt();

                double total = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

                System.out.println("Total harga: Rp " + String.format("%.2f", total));
                System.out.print("Apakah Anda ingin memesan lagi? (y/n): ");
                String jawaban = sc.next();
                
                if (jawaban.equalsIgnoreCase("y")) {
                    System.out.println("Silakan memesan lagi!");
                    } else if (jawaban.equalsIgnoreCase("n")) {
                        System.out.println("Terima kasih telah berkunjung ke cafe kami!");
                        break;
                    }
                sc.nextLine();
            } while (true);

        }
    }
}