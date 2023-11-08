/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_pertemuan4;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){
        Mawar mawar = new Mawar();
        float Merah = 0;
        mawar.WarnaBnga = Merah;
        float Serabut = 0;
        mawar.JenisAkar = Serabut;
        
        Melati melati = new Melati();
        float Putih = 0;
        melati.WarnaBnga = Putih;
        float Tunggang = 0;
        melati.JenisAkar = Tunggang;
        
        Matahari matahari = new Matahari();
        float Kuning = 0;
        matahari.WarnaBnga = Kuning;
        float Tunjang = 0;
        matahari.JenisAkar = Tunjang;
        
        
        //menunjukkan inheritance
       mawar.WarnaBunga();
       mawar.JenisAkar();
       
       melati.WarnaBunga();
       melati.JenisAkar();
       
      matahari.WarnaBunga();
      matahari.JenisAkar();
      
       
       
    }
    
}
