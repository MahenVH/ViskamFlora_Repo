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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Purnima
 */
public class Remove_Customer extends javax.swing.JFrame {

    /**
     * Creates new form RemoveVendor
     */
    public Remove_Customer() {
        initComponents();
    }
    /*
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Viskam_Flora_DB";
    String user="purnima";
    String pass="1234";
    */
    
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Viskam_Flora_DB";
    String user="mahen123";
    String pass="1234";
    
    
    ResultSet rs;
    
    private void getValue()
    {
        try {
           
         
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnremovevsearch = new javax.swing.JButton();
        txtvremovesearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        btnvremove = new javax.swing.JButton();
        btnvcancel = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove Customer");
        setLocation(new java.awt.Point(650, 250));

        btnremovevsearch.setBackground(new java.awt.Color(0, 0, 0));
        btnremovevsearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnremovevsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnremovevsearch.setText("Search");
        btnremovevsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremovevsearchActionPerformed(evt);
            }
        });

        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer FName", "Customer LName", "Address", "Contact Number", "Email", "Date Added"
            }
        ));
        jScrollPane1.setViewportView(customertable);

        btnvremove.setBackground(new java.awt.Color(51, 0, 0));
        btnvremove.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnvremove.setForeground(new java.awt.Color(255, 255, 255));
        btnvremove.setText("Remove");
        btnvremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvremoveActionPerformed(evt);
            }
        });

        btnvcancel.setBackground(new java.awt.Color(0, 0, 0));
        btnvcancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnvcancel.setForeground(new java.awt.Color(255, 255, 255));
        btnvcancel.setText("Cancel");

        btnview.setBackground(new java.awt.Color(0, 0, 0));
        btnview.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setText("Remove Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtvremovesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnremovevsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnvcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnvremove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel8)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnremovevsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvremovesearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnvcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnvremove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnremovevsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremovevsearchActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement pst;
            String sql="select * from Customer_Details where Customer_FName=?";

            pst=con.prepareStatement(sql);
            pst.setString(1, txtvremovesearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {

                getValue();
                txtvremovesearch.setText(rs.getString("Customer_FName"));
            }

            String sql1="select * from Customer_Details where Customer_ID=?";
            pst=con.prepareStatement(sql1);
            pst.setString(1, txtvremovesearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                getValue();

                txtvremovesearch.setText(rs.getString("Customer_ID"));

            }

        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Incorrect details");
        }

    }//GEN-LAST:event_btnremovevsearchActionPerformed

    private void btnvremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvremoveActionPerformed
        // TODO add your handling code here:
        
        try {
                Class.forName(driver);
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement pst;
            int row = customertable.getSelectedRow();
            String value=(customertable.getModel().getValueAt(row, 0).toString());
            String query4="DELETE FROM Customer_Details where Customer_ID="+value;
            pst=con.prepareStatement(query4);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Deleted successfully");
            
        } 
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       

    }//GEN-LAST:event_btnvremoveActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        try {
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement pst;
            pst=con.prepareStatement("select * from Customer_Details");
            rs=pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)customertable.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[]={rs.getInt("Customer_ID"),
                    rs.getString("Customer_FName"),
                    rs.getString("Customer_LName"),
                    rs.getString("Customer_Address"),
                    rs.getInt("Customer_Contact_Number"),
                    rs.getString("Customer_Email"),
                    rs.getString("Customer_Date_Added")};
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
            java.util.logging.Logger.getLogger(Remove_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnremovevsearch;
    private javax.swing.JButton btnvcancel;
    private javax.swing.JButton btnview;
    private javax.swing.JButton btnvremove;
    private javax.swing.JTable customertable;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtvremovesearch;
    // End of variables declaration//GEN-END:variables
}
