import java.util.Scanner;

public class Siakad02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        byte absen;
        char kelas;
        String nama, nim;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama     : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM      : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas    : ");
        kelas = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Masukkan absen    : ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis     : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas    : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian    : ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Mahasiswa dengan nama " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Absen           : " + absen);
        System.out.println("Nilai Akhir     : " + nilaiAkhir);
        }
    }
}