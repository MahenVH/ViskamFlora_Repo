/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Purnima
 */
public class RemoveVendor extends javax.swing.JFrame {

    /**
     * Creates new form RemoveVendor
     */
    public RemoveVendor() {
        initComponents();
    }
    
     String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Viskam_Flora_DB";
    String user="purnima";
    String pass="1234";
    
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnremovevsearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtvremovesearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtremovevid = new javax.swing.JTextField();
        txtremovevname = new javax.swing.JTextField();
        txtremovecompany = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendortable = new javax.swing.JTable();
        txtremovelocation = new javax.swing.JTextField();
        txtremovevtp = new javax.swing.JTextField();
        txtremovevemail = new javax.swing.JTextField();
        btnvremove = new javax.swing.JButton();
        btnvcancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtremoveitype = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtremovevquantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Company Name");

        btnremovevsearch.setText("Search");
        btnremovevsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremovevsearchActionPerformed(evt);
            }
        });

        jLabel4.setText("Location");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Email");

        txtremovevid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremovevidActionPerformed(evt);
            }
        });

        vendortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VendorID", "Vendor Name", "Company Name", "Location", "Contact Number", "Email", "Item Bought", "Item Quantity Bought"
            }
        ));
        jScrollPane1.setViewportView(vendortable);

        btnvremove.setText("Update");
        btnvremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvremoveActionPerformed(evt);
            }
        });

        btnvcancel.setText("Cancel");

        jLabel7.setText("Item Type Bought");

        jLabel1.setText("Vendor ID");

        jLabel2.setText("Vendor Name");

        jLabel8.setText("Quantity");

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnvremove)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtvremovesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnremovevsearch))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnvcancel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtremovevname, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremovevid, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremovecompany, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremovelocation, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremovevtp, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremovevemail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremoveitype, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremovevquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvremovesearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremovevsearch))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(jLabel6)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtremoveitype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtremovevquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtremovevid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtremovevname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtremovecompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtremovelocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtremovevtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addComponent(txtremovevemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnvremove)
                            .addComponent(btnvcancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnview)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnremovevsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremovevsearchActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement pst;
            String sql="select * from Vendor_Details where Vendor_Name=?";

            pst=con.prepareStatement(sql);
            pst.setString(1, txtvremovesearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {

                getVlaue();
                txtremovevname.setText(rs.getString("Vendor_Name"));
            }

            String sql1="select * from Vendor_Details where Vendor_ID=?";
            pst=con.prepareStatement(sql1);
            pst.setString(1, txtvsearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                getVlaue();

                txtremovevid.setText(rs.getString("Vendor_ID"));

            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btnremovevsearchActionPerformed

    private void txtremovevidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremovevidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtremovevidActionPerformed

    private void btnvremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvremoveActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url, user, pass);

            String value=txtvsearch.getText().toString();

            String query2="UPDATE Vendor_Details SET Vendor_Name=?,Comapny_Name=?, Location=?,Contact_Number=?,Email=?,Item_Bought=?,Item_Quantity_Bought=? where Vendor_ID="+value;

            PreparedStatement pst=con.prepareStatement(query2);
            pst.setString(1,txtremovevname.getText());
            pst.setString(2, txtremovecompany.getText());
            pst.setString(3,txtremovelocation.getText());
            pst.setString(4, txtremovevtp.getText());
            pst.setString(5, txtremovevemail.getText());
            pst.setString(6,txtremoveitype.getText());
            pst.setString(7, txtremovevquantity.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnvremoveActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        try {
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement pst;
            pst=con.prepareStatement("select * from Vendor_Details");
            rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)vendortable.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[]={rs.getInt("Vendor_ID"),
                    rs.getString("Vendor_Name"),
                    rs.getString("Comapny_Name"),
                    rs.getString("Location"),
                    rs.getInt("Contact_Number"),
                    rs.getString("Email"),
                    rs.getString("Item_Bought"),
                    rs.getInt("Item_Quantity_Bought")};
                tm.addRow(o);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnviewActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveVendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnremovevsearch;
    private javax.swing.JButton btnvcancel;
    private javax.swing.JButton btnview;
    private javax.swing.JButton btnvremove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtremovecompany;
    private javax.swing.JTextField txtremoveitype;
    private javax.swing.JTextField txtremovelocation;
    private javax.swing.JTextField txtremovevemail;
    private javax.swing.JTextField txtremovevid;
    private javax.swing.JTextField txtremovevname;
    private javax.swing.JTextField txtremovevquantity;
    private javax.swing.JTextField txtremovevtp;
    private javax.swing.JTextField txtvremovesearch;
    private javax.swing.JTable vendortable;
    // End of variables declaration//GEN-END:variables
}
