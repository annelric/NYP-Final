import javax.swing.JOptionPane;
import project.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdminHome extends javax.swing.JFrame {

    public AdminHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        btnSearchName = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        btnTicket = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldMovieName = new javax.swing.JTextField();
        fieldGenre = new javax.swing.JTextField();
        fieldRuntime = new javax.swing.JTextField();
        fieldShowtime = new javax.swing.JTextField();
        fieldCinemaHall = new javax.swing.JTextField();
        fieldCapasity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMovie = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Welcome Admin!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 28, -1, -1));

        btnLogout.setBackground(new java.awt.Color(233, 186, 73));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-rounded-50 (1).png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setFocusPainted(false);
        btnLogout.setFocusable(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 6, 110, 86));

        btnExit.setBackground(new java.awt.Color(233, 186, 73));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-50.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1129, 6, 132, 86));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Search by Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        fieldName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 230, -1));

        btnSearchName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchName.setText("Search");
        btnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNameActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Password"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 205, 630, 550));

        btnTicket.setBackground(new java.awt.Color(233, 186, 73));
        btnTicket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ticket-50.png"))); // NOI18N
        btnTicket.setText("Review the Tickets");
        btnTicket.setBorder(null);
        btnTicket.setBorderPainted(false);
        btnTicket.setContentAreaFilled(false);
        btnTicket.setFocusPainted(false);
        btnTicket.setFocusable(false);
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        getContentPane().add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 6, -1, 90));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Movie Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Genre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Runtime");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Showtime");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Cinema Hall");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Capasity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        fieldMovieName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, 230, -1));

        fieldGenre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 230, -1));

        fieldRuntime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldRuntime, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 230, -1));

        fieldShowtime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldShowtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 230, -1));

        fieldCinemaHall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldCinemaHall, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 230, -1));

        fieldCapasity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldCapasity, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 230, -1));

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Movie Name", "Genre", "Runtime", "Showtime", "Cinema Hall", "Capasity"
            }
        ));
        tableMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMovieMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableMovie);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 540, 350));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background-login.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -360, 2180, 1450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close the application?","Select", JOptionPane.YES_NO_OPTION);
        if(a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout?","Select", JOptionPane.YES_NO_OPTION);
        if(a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // yanlışlıkla açtım :)))
    }//GEN-LAST:event_formComponentHidden

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        String name = fieldName.getText();
        ResultSet rs = Select.getData("select * from kullanicilar where kullaniciadi like '%"+name+"%' ");
        DefaultTableModel model = (DefaultTableModel)tableUser.getModel();
        model.setRowCount(0);
        try {
            while(rs.next()) {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2), rs.getString(3)});
            }
            rs.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        ResultSet rs2 = Select.getData("SELECT * FROM filmler");
        DefaultTableModel model2 = (DefaultTableModel) tableMovie.getModel();
        model2.setRowCount(0);

        try {
            while(rs2.next()) {
                model2.addRow(new Object[] {
                    rs2.getString("film_id"),
                    rs2.getString("filmadi"),
                    rs2.getString("tur"),
                    rs2.getString("film_suresi"),
                    rs2.getString("seans"),
                    rs2.getString("salon"),
                    rs2.getString("kapasite")
                });
            }
            rs2.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNameActionPerformed
        String name = fieldName.getText();
        ResultSet rs = Select.getData("select * from kullanicilar where kullaniciadi like '%"+name+"%' ");
        DefaultTableModel model = (DefaultTableModel)tableUser.getModel();
        model.setRowCount(0);
        try {
            while(rs.next()) {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2), rs.getString(3)});
            }
            rs.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchNameActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int index = tableUser.getSelectedRow();
        TableModel model = tableUser.getModel();
        String id = model.getValueAt(index, 0).toString(); 
        String name = model.getValueAt(index, 1).toString();
        int response = JOptionPane.showConfirmDialog(null,"Do you really want to delete '"+ name + "' ?", "Select", JOptionPane.YES_NO_OPTION);

    if (response == JOptionPane.YES_OPTION) {
        try {
            Delete.setData("DELETE FROM kullanicilar WHERE film_id = '" + id + "'", "User deleted succesfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_tableUserMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = fieldMovieName.getText();
        String genre = fieldGenre.getText();
        String runtime = fieldRuntime.getText();
        String showtime = fieldShowtime.getText();
        String cinemaHall = fieldCinemaHall.getText();
        String capasity = fieldCapasity.getText();

        String query = "INSERT INTO filmler (filmadi, tur, film_suresi, seans, salon, kapasite) VALUES ('" + name + "', '" + genre + "', '" + runtime + "', '" + showtime + "', '" + cinemaHall + "' ,'" + capasity + "')";
        InsertUpdateDelete.setData(query, "Movie added succesfully!");

        ResultSet rs = Select.getData("SELECT * FROM filmler");
        DefaultTableModel model2 = (DefaultTableModel) tableMovie.getModel();
        model2.setRowCount(0);

        try {
            while(rs.next()) {
                model2.addRow(new Object[] {
                    rs.getString("film_id"),
                    rs.getString("filmadi"),
                    rs.getString("tur"),
                    rs.getString("film_suresi"),
                    rs.getString("seans"),
                    rs.getString("salon"),
                    rs.getString("kapasite")
                });
            }
            rs.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void tableMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMovieMouseClicked
        int index = tableMovie.getSelectedRow();
        TableModel model2 = tableMovie.getModel();
        String id = model2.getValueAt(index, 0).toString();
        int response = JOptionPane.showConfirmDialog(null,"Do you really want to delete the movie?", "Select", JOptionPane.YES_NO_OPTION);

    if (response == JOptionPane.YES_OPTION) {
        try {
            Delete.setData("DELETE FROM filmler WHERE film_id = '" + id + "'", "Movie deleted succesfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_tableMovieMouseClicked

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        setVisible(false);
        new Ticket().setVisible(true);
    }//GEN-LAST:event_btnTicketActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearchName;
    private javax.swing.JButton btnTicket;
    private javax.swing.JTextField fieldCapasity;
    private javax.swing.JTextField fieldCinemaHall;
    private javax.swing.JTextField fieldGenre;
    private javax.swing.JTextField fieldMovieName;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldRuntime;
    private javax.swing.JTextField fieldShowtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableMovie;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}
