/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pemograman2_bkk;

/**
 *
 * @author LENOVO
 */
public class pelayan extends Pegawai{
    
     @Override
     public void menampilkan(){
       System.out.println("Nama :"+nama);
        System.out.println("Id Pegawai:"+id_pegawai);
        System.out.println("Gaji:"+gaji);
    }
    public void tugas(){
        System.out.println("Tugas:Melayani dan Menyajikan Pesanan Pembeli");
        System.out.println("---------------------------------------------");
    }
    
}
