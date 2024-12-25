import java.util.Scanner;

public class SiakadWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nilai, jml, i = 0;

            System.out.print("Masukkan jumlah mahasiswa: ");
            jml = sc.nextInt();

            while (i < jml) { 
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai = sc.nextInt();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Nilai harus antara 0 dan 100");
                    continue;
                }

                if (nilai > 80 && nilai <= 100) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " mendapatkan nilai A");
                } else if (nilai > 73 && nilai <= 80) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " mendapatkan nilai B");
                } else if (nilai > 66 && nilai <= 73) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " mendapatkan nilai C");
                } else if (nilai > 50 && nilai <= 66) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " mendapatkan nilai D");
                } else {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " mendapatkan nilai E");
                }
                i++;
            }
        }
    }
}