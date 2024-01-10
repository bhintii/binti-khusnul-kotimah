
package uts_binti;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    BusanaAdat SL = new BusanaAdat();
    Busana P = new Busana();
    String pilih;
    Scanner masuk = new Scanner (System.in);
while(true){
    System.out.println("=============== SELAMAT DATANG ===============");
    System.out.println("------ Di Rental Baju Adat ------");
    System.out.println("Aplikasi yang tersedia :");
    System.out.println("[1] BusanaAdat");
    System.out.println("[2] Busana");
    System.out.println("[3] Keluar");
    System.out.print("pilih aplikasi : ");
    pilih = masuk.nextLine();

    if(pilih.equals("1")){
    SL.GetUsername();
    SL.GetPassword();
    System.out.println("\nMenu");
    System.out.println("[1] Tambah Busana" );
    System.out.println("[2] Lihat daftar Busana");
    System.out.println("[3] Pinjam Busana");
    System.out.println("[4] Kembalikan Busana");
    System.out.println("[5] Cari Busana");
    System.out.println("[6] Keluar");
    System.out.print("Pilih menu : ");
    int pil = masuk.nextInt();
        switch(pil){
            case 1:
                SL.TambahBusana();
                break;
            case 2:
                SL.LihatDaftarBusana();
                break;
            case 3:
                SL.PinjamBusana();
                break;
            case 4:
                SL.KembalikanBusana();
                break;
            case 5:
                SL.cari();
                break;
            case 6:
                SL.Keluar();
                break;
            default:
                System.out.println("Pilihan tidak valid !");
        }
    }else 
    if(pilih.equals("2")){
    System.out.println("\nMenu");
    System.out.println("[1] Buat Kartu peminjaman baju");
    System.out.println("[2] Tambah Busana" );
    System.out.println("[3] Lihat daftar Busana");
    System.out.println("[4] Pinjam Busana");
    System.out.println("[5] Kembalikan Busana");
    System.out.println("[6] Cari Busana");
    System.out.println("[7] Keluar");
    System.out.print("Pilih menu : ");
    int pil = masuk.nextInt();
        switch(pil){
            case 1:
                P.KAP();
                break;
            case 2:
                P.TambahBusana();
                break;
            case 3:
                P.LihatDaftarBusana();
                break;
            case 4:
                P.PinjamBusana();
                break;
            case 5:
                P.KembalikanBusana();
                break;
            case 6:
                P.cari();
                break;
            case 7:
                P.Keluar();
                break;
            default:
                System.out.println("Pilihan tidak valid !");
        }
    }else
    if(pilih.equals("3")){
            System.exit(0);
        }else{
        System.out.println("Pilihan tidak valid!");
    }
 }
}
}
