/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan_07;

/**
 *
 * @author LENOVO
 */
public class Jenis_Pengiriman_Paket {
    int Kirim_dengan(int berat_Cargo){
    return (int) (3000*berat_Cargo);
} 
float Kirim_dengan(float berat_JNT_Express){
    return (float) (berat_JNT_Express*8000);
}
double Kirim_dengan(double berat_JNE){
    return (double)(berat_JNE*10000);
}
    public static void main(String[] args) {
    Jenis_Pengiriman_Paket JPP = new Jenis_Pengiriman_Paket();
    int berat_Cargo = 12;
    float berat_JNT_Express = 109;
    double berat_JNE = 57.8;

    System.out.println("Total biaya pengiriman Cargo : " + JPP.Kirim_dengan(berat_Cargo));
    System.out.println("Total biaya pengiriman JNT Express : " + JPP.Kirim_dengan(berat_JNT_Express));
    System.out.println("Total biaya pengiriman JNE : "+ JPP.Kirim_dengan(berat_JNE));
    }
}
    

