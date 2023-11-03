/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6.settergetter;

/**
 *
 * @author LENOVO
 */
public class MainUtama {
    public static void main(String[] args){
        User user = new User();
        
        user.SetUsername("bintikhusnul");
        user.SetPasswort("comel");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Passwortnya = " + user.GetPasswort());
    }
    
}
