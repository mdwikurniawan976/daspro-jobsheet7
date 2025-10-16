import java.util.Scanner;
public class Tugas1 {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int jmlTiket, hargaTiket =50000;
        double diskon, totalHarga;
        
        for (int i = 0; i <= 4; i++){
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();
            if (jmlTiket < 0) {
                System.out.println("Input jumlah tiket tidak valid (negatif)");
                continue;
            }
            diskon = 0;
            if (jmlTiket > 10) {
                diskon = 0.15;
            }
            else if (jmlTiket > 4) {
                diskon = 0.1;
            }
            totalHarga = jmlTiket * hargaTiket * (1 - diskon);
            System.out.println("====== Rekap Penjualan Hari ini ======");
            System.out.println("Total tiket yang terjual: Rp." + (int) jmlTiket);
            System.out.println("Total harga penjualan tiket: Rp." + (int) totalHarga);
        }
    }
}
