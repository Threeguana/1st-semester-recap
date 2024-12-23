import java.util.Scanner;
public class trial2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double bayar, diskon;
            int harga;

            System.out.println("-------------------------------");
            System.out.println("======== MENU KAFE JTI ========");
            System.out.println("-------------------------------");
            System.out.println("1. Ricebowl");
            System.out.println("2. Teh");
            System.out.println("3. Paket Bundling");
            System.out.println("-------------------------------");
            System.out.print("Pilih Menu : ");
            int pilih = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Apakah punya member? ");
            String member = sc.nextLine();
            System.out.println("-------------------------------");
            
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("Diskon sebesar 10%");
                if (pilih == 1) {
                    harga = 14000;
                    System.out.println("Ricebowl: " + harga);
                } else if (pilih == 2) {
                    harga = 3000;
                    System.out.println("Teh: " + harga);
                } else if (pilih == 3) {
                    harga = 15000;
                    System.out.println("Paket Bundling: " + harga);
                } else {
                    System.out.println("Pilihan tidak ada");
                    return;
                }
            bayar = harga - (harga * diskon);
            System.out.println("Total Bayar: " + bayar);
            } else if (member.equalsIgnoreCase("n")) {
                if (pilih == 1) {
                    harga = 14000;
                    System.out.println("Ricebowl: " + harga);
                } else if (pilih == 2) {
                    harga = 3000;
                    System.out.println("Teh: " + harga);
                } else if (pilih == 3) {
                    harga = 15000;
                    System.out.println("Paket Bundling: " + harga);
                } else {
                    System.out.println("Pilihan tidak ada");
                    return;
                }
                System.out.println("Total Bayar: " + harga);
            } else {
                System.out.println("Member tidak valid!");
            }
            System.out.println("-------------------------------");
        }
    }
}