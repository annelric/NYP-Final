/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

public class Delete {
    public static void setData(String Query, String message) {
        Connection con = null;
        Statement st = null;

        try {
            con = ConnectionProvider.getCon(); // Bu da senin bağlantı sınıfın olmalı
            st = con.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, message);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                if(st != null) st.close();
                if(con != null) con.close();
            } catch (Exception e) {}
        }
    }
}