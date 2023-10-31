/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author ASUS
 */
public class KoneksiDatabase {
    //Koneksi Database
    public static Connection koneksi;
    //Kelas Untuk Setting Database
    public static Connection KonfigurasiDB() throws SQLException{
        try {
            //Menentukan Database
            String url = "jdbc:mysql://localhost/db_pbo";
            String username_database = "root";
            String password_database = "";
            
            //Koneksi Database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, username_database, password_database);
            
            //Bikin Status Kalau Berhasil
            //JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal" + e);
        }
    
        return koneksi;
    }
    
    public static void main(String[] args) throws SQLException{
        System.out.println("Datav");
        
        Connection penghubung = (Connection)KoneksiDatabase.KonfigurasiDB();
    }
}
