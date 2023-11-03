/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_pertemuan_6.SetterGetter;

/**
 *
 * @author LENOVO
 */
public class User {
   private String nim;
   private String nama;
   private String ipk;

   public void Setnim(String nim){
    this.nim = nim;
   }
   public void Setnama(String nama){
    this.nama = nama;
   } 
   public void Setipk(String ipk){
    this.ipk = ipk;
   }

   public String Getnim(){
    return this.nim;
   }
   
   public String Getnama(){
       return this.nama;
   }
   
   public String Getipk(){
       return this.ipk;
   }
}
