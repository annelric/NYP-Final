
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.Select;
import project.InsertUpdateDelete;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldMovieName = new javax.swing.JTextField();
        btnSearchMovieName = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fieldShowtime = new javax.swing.JTextField();
        btnSearchShowtime = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fieldGenre = new javax.swing.JTextField();
        btnSearchGenre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMovie = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 110, 86));

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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 132, 86));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Home Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 28, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Search by Movie Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        fieldMovieName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, -1));

        btnSearchMovieName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchMovieName.setText("Search");
        btnSearchMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMovieNameActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Search by Showtime");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        fieldShowtime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldShowtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 230, -1));

        btnSearchShowtime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchShowtime.setText("Search");
        btnSearchShowtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchShowtimeActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchShowtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Search by Genre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        fieldGenre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(fieldGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 230, -1));

        btnSearchGenre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchGenre.setText("Search");
        btnSearchGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGenreActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Movie Name", "Genre", "Runtime", "Showtime", "Cinema Hall", "Capacity"
            }
        ));
        tableMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMovieMouseClicked(evt);
            }
        });
        tableMovie.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableMovieComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tableMovie);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 1270, 530));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Click the one you like to buy a ticket for!");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background-login.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -270, -1, 1290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout?","Select", JOptionPane.YES_NO_OPTION);
        if(a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close the application?","Select", JOptionPane.YES_NO_OPTION);
        if(a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchMovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMovieNameActionPerformed
        String name = fieldMovieName.getText();
        ResultSet rs = Select.getData("select * from filmler where filmadi like '%"+name+"%' ");
        DefaultTableModel model = (DefaultTableModel)tableMovie.getModel();
        model.setRowCount(0);
        try {
            while(rs.next()) {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6)});
            }
            rs.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchMovieNameActionPerformed

    private void btnSearchShowtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchShowtimeActionPerformed
        String showtime = fieldShowtime.getText();
        ResultSet rs = Select.getData("select * from filmler where seans like '%"+showtime+"%' ");
        DefaultTableModel model = (DefaultTableModel)tableMovie.getModel();
        model.setRowCount(0);
        try {
            while(rs.next()) {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7)});
            }
            rs.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchShowtimeActionPerformed

    private void btnSearchGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchGenreActionPerformed
       String genre = fieldGenre.getText();
        ResultSet rs = Select.getData("select * from filmler where tur like '%"+genre+"%' ");
        DefaultTableModel model = (DefaultTableModel)tableMovie.getModel();
        model.setRowCount(0);
        try {
            while(rs.next()) {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7)});
            }
            rs.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchGenreActionPerformed

    private void tableMovieComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableMovieComponentShown
        // yanlışlıkla açtım :)))
    }//GEN-LAST:event_tableMovieComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs = Select.getData("SELECT * FROM filmler");
        DefaultTableModel model = (DefaultTableModel) tableMovie.getModel();
        model.setRowCount(0);

        try {
            while(rs.next()) {
                model.addRow(new Object[] {
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
    }//GEN-LAST:event_formComponentShown

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMovieMouseClicked
        int selectedRow = tableMovie.getSelectedRow();

        if (selectedRow != -1) {
            String filmID = tableMovie.getValueAt(selectedRow, 0).toString(); 
            String kullaniciAdi = Login.kullanici_adi;

            int choice = JOptionPane.showConfirmDialog(this,"Do you want to buy ticket for this movie?","Buy Ticket",JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) { 
                String query = "INSERT INTO biletler (kullanici_adi, film_id) " +
                               "VALUES ('" + kullaniciAdi + "','" + filmID + "')";
                InsertUpdateDelete.setData(query, "Ticket purchased successfully!");
                String updateQuery = "UPDATE filmler SET kapasite = kapasite - 1 WHERE film_id = '" + filmID + "'";
                InsertUpdateDelete.setData(updateQuery, null);
            }
        }
    }//GEN-LAST:event_tableMovieMouseClicked

    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearchGenre;
    private javax.swing.JButton btnSearchMovieName;
    private javax.swing.JButton btnSearchShowtime;
    private javax.swing.JTextField fieldGenre;
    private javax.swing.JTextField fieldMovieName;
    private javax.swing.JTextField fieldShowtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMovie;
    // End of variables declaration//GEN-END:variables
}
