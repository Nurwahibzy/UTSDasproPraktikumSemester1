
import java.util.Scanner;

public class UTSPembayaranPajak21 {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);

        boolean isPunyaUsaha = true;
        String usaha, keluarga, barangHartaKekayaan, bendaBergerak, tidakBergerak;
        double pajakGaji = 0.15, pajakAkhir = 0, jumlahPajak;
        int penghasilan = 0, jmlHartaKekayaan = 0, hargaBarang = 0;
        int totalHargaKekayaan = 0, jmlAnakKuliah = 0, jmlAnakSMA = 0;
        System.out.println("===Tugas UTS Ganjil Semester 1===");
        System.out.println("Nurwahib Zakki Yahya");
        System.out.println("NIM: 2341720154");
        System.out.println("Kelas: 1F Absen: 21 \n");
        int i = 1;
        while (i > 0) {
            System.out.println("Apakah anda memiliki usaha? (y/t)");
            usaha = scan21.nextLine();
            if (usaha.equalsIgnoreCase("y")) {
                System.out.print("Berapa total penghasilan dalam setahun: ");
                penghasilan = scan21.nextInt();
                isPunyaUsaha = true;
                System.out.println("karena Anda memiliki usaha maka anda dikenai pajak sebesar 15%");
                penghasilan -= (pajakGaji * penghasilan);
                System.out.println("Penghasilan Bersih anda adalah: " + penghasilan);
                totalHargaKekayaan += penghasilan;

                break;
            } else if (usaha.equalsIgnoreCase("t")) {
                isPunyaUsaha = false;
                break;
            } else {
                System.out.println("Input yang anda masukkan salah");
                i++;
            }
        }
        System.out.print("Masukkan jumlah Harta kekayaan :");
        jmlHartaKekayaan = scan21.nextInt();
        scan21.nextLine();

        for (int j = 0; j < jmlHartaKekayaan; j++) {

            System.out.printf("Nama barang harta kekayaan %d : ", (j + 1));
            barangHartaKekayaan = scan21.nextLine();

            System.out.print("Harga barang : ");
            hargaBarang = scan21.nextInt();
            scan21.nextLine();
            totalHargaKekayaan += hargaBarang;
        }

        System.out.println("Apakah anda memiliki keluarga? (y/t)");
        keluarga = scan21.nextLine();
        if (keluarga.equalsIgnoreCase("y")) {
            System.out.println("Berapa jumlah anak yang Kuliah: ");
            jmlAnakKuliah = scan21.nextInt();
            System.out.println("Berapa jumlah Anak yang masih SMA: ");
            jmlAnakSMA = scan21.nextInt();
            if (jmlAnakKuliah == 1 && jmlAnakSMA == 1 && totalHargaKekayaan >= 50000000) {
                pajakAkhir = 0.1;
            } else if (jmlAnakKuliah == 0 && jmlAnakSMA == 0 && totalHargaKekayaan < 50000000) {
                pajakAkhir = 0.5;
            }

        }
        System.out.println("Total kekayaan anda sejumlah: " + totalHargaKekayaan);
        jumlahPajak = (long)totalHargaKekayaan * pajakAkhir ;
        System.out.println("Total pajak yang harus anda bayarkan adalah: " + jumlahPajak);
        totalHargaKekayaan -= jumlahPajak;
        System.out.println("Jadi sisa kekayaan anda adalah: " + totalHargaKekayaan );

        
    }
}
