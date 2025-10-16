import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        System.out.print("Masukkan jenis kendaraan (1.Mobil, 2.Motor, 0.Keluar): ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }   
            }
            System.out.print("Masukkan jenis kendaraan (1.Mobil, 2.Motor, 0.Keluar): ");
            jenis = sc.nextInt();
        }
        System.out.println("Total pembayaran parkir: " + total);
        sc.close();
    }
}
