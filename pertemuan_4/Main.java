/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[]args){
        
        //objek Bangun Datar
        BangunDatar bangunDatar = new BangunDatar();
           
            Persegi persegi = new Persegi();
            persegi.sisi = 5;
            
            Lingkaran lingkaran = new Lingkaran();
            lingkaran.r = 22;
            
            PersegiPanjang persegipanjang = new PersegiPanjang();
            persegipanjang.lebar = 4;
            persegipanjang.panjang = 8;
            
            Segitiga segitiga = new Segitiga();
            segitiga.alas = 12;
            segitiga.tinggi = 8;
            
            //menunjukkan inheritance
            bangunDatar.luas();
            bangunDatar.keliling();
            
            persegi.luas();
            persegi.keliling();
            
            persegipanjang.luas();
            persegipanjang.keliling();
            
            segitiga.luas();
            segitiga.keliling();
            
            
                
    }
}    
    

