/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_UAS_BINTIKK;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class insert {
    
    koneksi konek = new koneksi();
   

    public void insert(String Nama, String Ttl, String Jabatan , String Alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            // Use PreparedStatement to prevent SQL injection
            String sql = "insert into mhs_ilkom (Nama, Jabatan, Ttl, Alamat ) values (?,?,?,?,?)";
            
            //Create a PreparedStatement with the SQL query
            PreparedStatement  preparedStatement = konek.con.prepareStatement(sql);
           
            //set values for each parameter
             preparedStatement.setString(1, Nama);
             preparedStatement.setString(2, Jabatan);
             preparedStatement.setString(3, Ttl);
             preparedStatement.setString(4, Alamat);
             
            
           
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

}

    
    
    
    

