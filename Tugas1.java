import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int hargaTiket = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0;
        int pelanggan = 0;
 
        System.out.println("(Masukkan 0 untuk membatalkan)");
 
         do {
            System.out.print("Jumlah tiket pelanggan ke-" + (pelanggan + 1) + ": ");
            jumlahTiket = sc.nextInt();

           if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Masukkan jumlah tiket yang benar.");
                continue;
            }
 
            if (jumlahTiket == 0) {
                break;
            }
 
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
 
            double hargaKotor = jumlahTiket * hargaTiket;
            double hargaBayar = hargaKotor - (hargaKotor * diskon);
 
            System.out.println("  Diskon       : " + (hargaKotor * diskon));
            System.out.println("  Total bayar  : Rp " + hargaBayar);
 
            totalTiket += jumlahTiket;
            totalPenjualan += hargaBayar;
            pelanggan++;

        } while (jumlahTiket != 0);
 
        System.out.println("Jumlah pelanggan     : " + pelanggan);
        System.out.println("Total tiket terjual  : " + totalTiket);
        System.out.printf("Total penjualan      : Rp" + totalPenjualan);
 
        sc.close();
    }
}
    
    

