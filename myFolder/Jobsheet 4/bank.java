import java.util.Scanner;

public class  bank {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int jmlTabunganAwal, lamaNabung;
            double jmlTabunganAkhir, bunga;
            double presentaseBunga = 0.02;
            
            System.out.print("Masukkan jumlah tabungan awal: ");
            jmlTabunganAwal = sc.nextInt();
            System.out.print("Masukkan lama menabung: ");
            lamaNabung = sc.nextInt();

            bunga = lamaNabung * presentaseBunga * jmlTabunganAwal;
            jmlTabunganAkhir = jmlTabunganAwal + bunga;

            System.out.println("Anda mendapatkan bunga sebesar : " + bunga);
            System.out.println("Jumlah tabungan Anda           : " + jmlTabunganAkhir);
        }
    }
}