import java.util.Scanner;
public class KafeDOWHILE14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti ;
        String namaPelanggan;
        int hargakopi = 12000;
        int hargateh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            
            
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga);
            sc.nextLine();

        } while (true);
            System.out.println("Semua transaksi selesai");

            sc.close();
        }
        

        
    }

