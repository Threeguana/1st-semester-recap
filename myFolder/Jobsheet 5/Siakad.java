import java.util.Scanner;

public class Siakad {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int absen, kuis, tugas, ujian;
            String nama, nim, kualifikasi, nilaiHuruf, kelas;

            System.out.print("Masukkan Nama         : ");
            nama = sc.nextLine();
            System.out.print("Masukkan NIM          : ");
            nim = sc.nextLine();
            System.out.print("Masukkan Kelas        : ");
            kelas = sc.nextLine();
            System.out.print("Masukkan Nomor Absen  : ");
            absen = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis   : ");
            kuis = sc.nextInt();
            System.out.print("Masukkan Nilai Tugas  : ");
            tugas = sc.nextInt();
            System.out.print("Masukkan Nilai Ujian  : ");
            ujian = sc.nextInt();

            double nilaiAkhir = (kuis + tugas + ujian) / 3;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                kualifikasi = "Sangat Baik";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                kualifikasi = "Lebih dari Baik";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                kualifikasi = "Baik";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                kualifikasi = "Cukup";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                kualifikasi = "Kurang";
            } else {
                nilaiHuruf = "E";
                kualifikasi = "Gagal";
            }

            System.out.println("\nMahasiswa dengan nama " + nama + " \nNIM " + nim + ". " + " \nKelas " + kelas + " \nnomor absen " + absen);
            System.out.printf("\nNilai Akhir: %.2f\nIndex Nilai: %s\nKualifikasi: %s\n", nilaiAkhir, nilaiHuruf, kualifikasi);
        }
    }
}