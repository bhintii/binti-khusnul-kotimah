/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6.settergetter;

/**
 *
 * @author LENOVO
 */
public class User {
    private String username ;
    private String passwort ;
    
    public void SetUsername(String username){
        this.username = username ;
     }
    public void SetPasswort(String passwort){
        this.passwort = passwort;
    }
    
    public String GetUsername(){
        return this.username;
    }
    
    public String GetPasswort(){
        return this.passwort;
        }
    
}
