/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Purnima
 */
public class Vendor_Admin_Main_Window extends javax.swing.JFrame {

    /**
     * Creates new form Vendor_Admin_Main_Window
     */
    public Vendor_Admin_Main_Window() {
        initComponents();
    }
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Viskam_Flora_DB";
    String user="purnima";
    String pass="1234";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmainaddv = new javax.swing.JButton();
        btnmainremovev = new javax.swing.JButton();
        btnmaincheckv = new javax.swing.JButton();
        btnmainupdatev = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnvreport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnmainaddv.setBackground(new java.awt.Color(153, 153, 153));
        btnmainaddv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmainaddv.setText("Add");
        btnmainaddv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmainaddvActionPerformed(evt);
            }
        });
        getContentPane().add(btnmainaddv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 202, 48));

        btnmainremovev.setBackground(new java.awt.Color(153, 153, 153));
        btnmainremovev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmainremovev.setText("Remove");
        btnmainremovev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmainremovevActionPerformed(evt);
            }
        });
        getContentPane().add(btnmainremovev, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 202, 45));

        btnmaincheckv.setBackground(new java.awt.Color(153, 153, 153));
        btnmaincheckv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmaincheckv.setText("Check");
        btnmaincheckv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaincheckvActionPerformed(evt);
            }
        });
        getContentPane().add(btnmaincheckv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 202, 44));

        btnmainupdatev.setBackground(new java.awt.Color(153, 153, 153));
        btnmainupdatev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmainupdatev.setText("Update");
        btnmainupdatev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmainupdatevActionPerformed(evt);
            }
        });
        getContentPane().add(btnmainupdatev, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 202, 47));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Vendor UI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 120));

        btnvreport.setBackground(new java.awt.Color(153, 153, 153));
        btnvreport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnvreport.setText("Report");
        btnvreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvreportActionPerformed(evt);
            }
        });
        getContentPane().add(btnvreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 202, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blur bubble.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmainaddvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmainaddvActionPerformed
        // TODO add your handling code here:
        
        Add_Vendor AV=new Add_Vendor();
        AV.setVisible(true);
        
    }//GEN-LAST:event_btnmainaddvActionPerformed

    private void btnmainremovevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmainremovevActionPerformed
        // TODO add your handling code here:
        
        RemoveVendor RV=new RemoveVendor();
        RV.setVisible(true);
    }//GEN-LAST:event_btnmainremovevActionPerformed

    private void btnmaincheckvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaincheckvActionPerformed
        // TODO add your handling code here:
        
        CheckVendor CV=new CheckVendor();
        CV.setVisible(true);
    }//GEN-LAST:event_btnmaincheckvActionPerformed

    private void btnmainupdatevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmainupdatevActionPerformed
        // TODO add your handling code here:
        
        UpdateVendor UV=new UpdateVendor();
        UV.setVisible(true);
    }//GEN-LAST:event_btnmainupdatevActionPerformed

    private void btnvreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvreportActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url, user, pass);
            String report="D:\\Viskam_Flora_Java_Project\\ViskamFlora_Repo\\src\\GUI\\VendorReport1.jrxml";
            JasperReport jr= JasperCompileManager.compileReport(report);
            JasperPrint jp=JasperFillManager.fillReport(jr, null,con);
            JasperViewer.viewReport(jp);
        } 
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e);
        
        }
    }//GEN-LAST:event_btnvreportActionPerformed

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
            java.util.logging.Logger.getLogger(Vendor_Admin_Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendor_Admin_Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendor_Admin_Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendor_Admin_Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendor_Admin_Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmainaddv;
    private javax.swing.JButton btnmaincheckv;
    private javax.swing.JButton btnmainremovev;
    private javax.swing.JButton btnmainupdatev;
    private javax.swing.JButton btnvreport;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
