package Praktik;

import java.util.Scanner;

public class Aplikasi {

    public static boolean isRunning = true;

    public static void showmenu() {
        boolean run = true;
        System.out.println("Selamat Datang di Perpustakaan Kota Balik Tembok");
        System.out.println("==========MENU==========");
        System.out.println("[1] Buku Hijau");
        System.out.println("[2] Buku Orange");
        System.out.println("[3] Buku Kuning");
        System.out.println("[4] Buku Merah");
        System.out.println("[5] Buku Biru");
        System.out.println("[6] Buku Hitam");
        System.out.println("[7] Buku Ungu");
        System.out.println("[8] Buku Abu-Abu");
        System.out.println("[9] Buku Putih");
        System.out.println("[0] Exit");

        System.out.println("==MASUKKAN PILIHAN ANDA==");
        Scanner noir = new Scanner(System.in);
        int nomor = noir.nextInt();

        switch (nomor) {
            case 1:
                System.out.println("=========Buku Hijau=========");
                Buku book = new Buku("Bulan", "Novel", "Mizan", 345);
                book.info();
                break;
            case 2:
                System.out.println("=========Buku Orange=========");
                Buku book2 = new Buku("Komet", "Novel", "Mizan", 325);
                book2.info();
                break;
            case 3:
                System.out.println("=========Buku Kuning=========");
                Buku book3 = new Buku("Dasar Pemrogramman Java", "Non-Fiksi", "JS.Staff", 873);
                book3.info();
                break;
            case 4:
                System.out.println("=========Buku Merah=========");
                Buku book4 = new Buku("Fisika Itu Mudah Kls X", "Non-Fiksi", "MOKLETMLG", 765);
                book4.info();
                break;
            case 5:
                System.out.println("=========Buku Biru=========");
                Buku book5 = new Buku("Aku Kamu", "Novel", "Mizan", 120);
                book5.info();
                break;
            case 6:
                System.out.println("=========Buku Hitam=========");
                Buku book6 = new Buku("Kasih Sayang Kepada Orang Tua", "Novel", "Mizan", 124);
                book6.info();
                break;
            case 7:
                System.out.println("=========Buku Ungu=========");
                Buku book7 = new Buku("The Glory Day Of China", "Non-Fiksi", "PraYus", 500);
                book7.info();
                break;
            case 8:
                System.out.println("=========Buku Abu-Abu=========");
                Buku book8 = new Buku("Avatar The Legend Of Moklet", "Novel", "MOKLETMLG", 210);
                book8.info();
                break;
            case 9:
                System.out.println("=========Buku Putih=========");
                Buku book9 = new Buku("Bahagia Itu Simple", "Non-Fiksi", "JS.Staff", 115);
                book9.info();
                break;
            case 0:
                System.out.println("Terimakasih Telah Menggunakan Layanan Kami!!!");
                isRunning = false;
                break;
            default:
                System.out.println("Tolong periksa kembali nomor yang anda input");
        }
    }

    public static void main(String[] args) {
        do {
            showmenu();
        } while (isRunning);
    }
}
