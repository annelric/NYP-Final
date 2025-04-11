import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.Delete;
import project.Select;


public class Ticket extends javax.swing.JFrame {

    public Ticket() {
        initComponents();
        setSize(1366, 768);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMovie = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Ticket Review");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 28, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClear.setBorderPainted(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 106, 70, 30));

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
        jScrollPane1.setViewportView(tableMovie);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1290, 570));

        btnBack.setBackground(new java.awt.Color(233, 186, 73));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-50.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 132, 86));

        btnExit1.setBackground(new java.awt.Color(233, 186, 73));
        btnExit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-50.png"))); // NOI18N
        btnExit1.setText("Exit");
        btnExit1.setBorder(null);
        btnExit1.setBorderPainted(false);
        btnExit1.setContentAreaFilled(false);
        btnExit1.setFocusPainted(false);
        btnExit1.setFocusable(false);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 132, 86));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background-login.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -320, 1820, 1230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
       int a = JOptionPane.showConfirmDialog(null, "Do you really want to close the application?","Select", JOptionPane.YES_NO_OPTION);
        if(a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExit1ActionPerformed

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

    private void tableMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMovieMouseClicked
        int index = tableMovie.getSelectedRow();
        TableModel model = tableMovie.getModel();
        String id = model.getValueAt(index, 0).toString(); 
        //String name = model.getValueAt(index, 1).toString();
        int response = JOptionPane.showConfirmDialog(null,"Do you really want to delete this session?", "Select", JOptionPane.YES_NO_OPTION);

    if (response == JOptionPane.YES_OPTION) {
        try {
            Delete.setData("DELETE FROM filmler WHERE film_id = '" + id + "'", "Session deleted succesfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_tableMovieMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setVisible(false);
        new Ticket().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMovie;
    // End of variables declaration//GEN-END:variables
}
