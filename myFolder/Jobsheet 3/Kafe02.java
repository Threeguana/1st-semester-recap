import java.util.Scanner;

public class Kafe02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int jmlKopi, jmlTeh, jmlRoti;
        boolean keanggotaan;
        float diskon = 10 / 100f;
        double hargaRoti = 20000;
        double hargaKopi = 12000;
        double hargaTeh = 7000;
        double totHarga, nominalBayar;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah kopi  : ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan jumlah teh   : ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan jumlah roti  : ");
        jmlRoti = sc.nextInt();
        sc.nextLine();

        totHarga = (jmlKopi * hargaKopi) + (jmlRoti * hargaRoti) + (jmlTeh * hargaTeh);

        nominalBayar = totHarga - (totHarga * diskon);

        System.out.println("Keanggotaan pelanggan" + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        }
    }
}