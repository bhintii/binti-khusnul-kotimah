
package uts_binti;
import java.util.Scanner;
public class Busana extends RentalBusanaAdat{

Scanner masuk = new Scanner (System.in);
String[][] daftarBusana = new String[10][3];
String[][] KAPnew = new String[20][5];

int jumlahkartu = 0;
int jumlahBusana = 0;
boolean isRunning;

     @Override
    public void Masuk() {
        isRunning = true;
         System.out.println("----- SELMAT DATANG DI BUSANA -----");
    }

    @Override
    public void TambahBusana() {
        System.out.println("Masukkan judul Busana : ");
        String judul = masuk.nextLine();
       
       

    jumlahBusana ++;
        System.out.println("Busana berhasil di tambahkan !");
    }

    @Override
    public void LihatDaftarBusana() {
    if(jumlahBusana == 0){
        System.out.println("Belum ada Busana yang terdaftar !");
        }else{
        System.out.println("Daftar busana : ");
        for(int i = 0; i < jumlahBusana; i++){
            System.out.println((i+1) + ". " + daftarBusana[i][0] + "|" + daftarBusana[i][1] );
            }
        } 
    }

    @Override
    public void PinjamBusana() {
        System.out.println("Masukkan kode Busana yang ingin di pinjam : ");
        int kodeBusana = masuk.nextInt();
        masuk.nextInt();

        if(kodeBusana > 0 && kodeBusana <= jumlahBusana){
            System.out.println("Masukkan nama peminjam : ");
            String nama = masuk.nextLine();
            System.out.println("Busana berhasil dipinjam oleh : " + nama + "|");
        }else{
            System.out.println("Kode Busana tidak valid !");
        }   
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
         System.out.print("Masukkan nama Busana Adat yang ingin dicari : ");
         String judul = masuk.nextLine();

         for(int i = 0; i < jumlahBusana; i++){
             if(daftarBusana[i][0].equalsIgnoreCase(judul)){
                 System.out.println((i+1) + ". " + daftarBusana[i][0] + "|" + daftarBusana[i][1]);
                 return;
             }
        }
         System.out.println("Busana tidak ditemukan !");
    }
    public void KAP(){
        System.out.print("NAMA : ");
        String nama = masuk.nextLine();

        System.out.println("ALAMAT : ");
        String alamat = masuk.nextLine();

        KAPnew[jumlahkartu][0] = nama;

        KAPnew[jumlahkartu][1] = alamat;

        jumlahkartu ++;
        System.out.println("Kartu sudah tercetak !");
        System.out.println("-------------------- KARTU RENTAL ANDA --------------------");
        for(int i = 0; i < jumlahkartu; i++){
            System.out.println((i+1) + ". " + KAPnew[i][0] + "|" + KAPnew[i][1] + "|"  );
            }
    }

    @Override
    public void Keluar() {
        System.out.println("Terimakasih telah menggunakan layanan Rental Busana Adat :)");
        isRunning = false;
    }

}