
package uts_binti;

import java.util.Scanner;
public class BusanaAdat extends RentalBusanaAdat{
Scanner masuk = new Scanner (System.in);
String[][] daftarBusana = new String[10][3];
int jumlahBusana = 0;
boolean isRunning;

    public void Masuk() {
       isRunning = true;
       RentalBusanaAdat user = new RentalBusanaAdat();
       user.SetUsername(" ");
       user.SetPassword(" ");

       System.out.print("Username : " + user.GetUsername());
       String nama = masuk.nextLine();
       System.out.print("Password : " + user.GetPassword());
       String pwd = masuk.nextLine();
       System.out.println("----- SELMAT DATANG DI Busana Adat -----");
    }

    @Override
    public void TambahBusana() {
        System.out.println("Masukkan nama Busana Adat : ");
        String judul = masuk.nextLine();
       

        daftarBusana[jumlahBusana][10]= judul;
       
    jumlahBusana ++;
        System.out.println("Busana berhasil di tambahkan !");
    }

    @Override
    public void LihatDaftarBusana() {
    if(jumlahBusana == 0){
        System.out.println("Belum ada Busana Adat yang terdaftar !");
        }else{
        System.out.println("Daftar Busana : ");
        for(int i = 0; i < jumlahBusana; i++){
            System.out.println((i+1) + ". " + daftarBusana[i][0] + "|" + daftarBusana[i][1] );
            }
        } 
    }

    @Override
    public void PinjamBusana() {
        System.out.println("Masukkan kode Busana yang ingin di pinjam : ");
        int kodeBuku = masuk.nextInt();
        masuk.nextInt();

        
    }

    @Override
    public void KembalikanBusana() {
        System.out.print("Masukkan kode Busana yang ingin di kembalikan : ");
        int kodeBusana = masuk.nextInt();
        masuk.nextLine();

        if(kodeBusana > 0 && kodeBusana <= jumlahBusana){
            System.out.println("Busana berhasil dikembalikan");
        }else{
            System.out.println("Kode Busana tidak valid !");
        }   
    }

     @Override
    public void cari() {
         System.out.print("Masukkan judul Busana yang ingin dicari : ");
         String judul = masuk.nextLine();

         for(int i = 0; i < jumlahBusana; i++){
             if(daftarBusana[i][0].equalsIgnoreCase(judul)){
                 System.out.println((i+1) + ". " + daftarBusana[i][0] + "|" + daftarBusana[i][1]);
                 return;
             }
        }
         System.out.println("Busana tidak ditemukan !");
    }

    @Override
    public void Keluar() {
        System.out.println("Terimakasih telah menggunakan layanan Rental Busana Adat :)");
        isRunning = false;
    }


}
