public class type {
    public static void main(String[] args) {
        char goldar = 'A';
        byte jarak = (byte) 130;
        short jmlPenduduk = 1025;
        float suhu = 60.50F;
        double berat = 0.546781;
        long saldo = 2000000;
        int angkaDesimal = 0 * 10;

        System.out.println("Golongan darah  : " + (byte) goldar);
        System.out.println("Jarak           : " + jarak);
        System.out.println("Jumlah penduduk : " + jmlPenduduk);
        System.out.println("Suhu            : " + suhu);
        System.out.println("Berat           : " + (float) berat);
        System.out.println("Saldo           : " + saldo);
        System.out.println("Angka desimal   : " + angkaDesimal);
    }
}