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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Purnima
 */
public class AddVendor extends javax.swing.JFrame {
    
     private static Pattern PhoneNumPtrn = Pattern.compile("\\d{10}");
    
    
    public static boolean validatePhoneNumber(String phonenum){
        
         
        Matcher mtch1 = PhoneNumPtrn.matcher(phonenum);
        if(mtch1.matches()){
            return true;
        }
       
        return false;
        
    }
    
    
    private static Pattern emailNamePtrn = Pattern.compile(
    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
  
    
    
    public static boolean validateEmailAddress(String email){
        
         
        Matcher mtch = emailNamePtrn.matcher(email);
        if(mtch.matches()){
            return true;
        }
       
        return false;
        
    }
    
    public boolean Validation()
    {
        String email=txtvaddemail.getText();
        String phonenum=txtaddvtp.getText();
        if(validateEmailAddress(email) && validatePhoneNumber(phonenum))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    ResultSet rs;

    /**
     * Creates new form AddVendor
     */
    public AddVendor() {
        initComponents();
    }
  
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Viskam_Flora_DB";
    String user="purnima";
    String pass="1234";
    
   
     /*String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Viskam_Flora_DB";
    String user="mahen123";
    String pass="1234";*/
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtvaddname = new javax.swing.JTextField();
        txtaddcompany = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendortable = new javax.swing.JTable();
        txtaddlocation = new javax.swing.JTextField();
        txtaddvtp = new javax.swing.JTextField();
        txtvaddemail = new javax.swing.JTextField();
        btnvadd = new javax.swing.JButton();
        btnvcancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtiaddtype = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtvquantity = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Vendor Name");

        jLabel3.setText("Company Name");

        jLabel4.setText("Location");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Email");

        txtaddcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddcompanyActionPerformed(evt);
            }
        });

        vendortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "VendorID", "Vendor Name", "Company Name", "Location", "Contact Number", "Email", "Item Bought", "Item Quantity Bought"
            }
        ));
        jScrollPane1.setViewportView(vendortable);

        txtaddlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddlocationActionPerformed(evt);
            }
        });

        txtaddvtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddvtpActionPerformed(evt);
            }
        });

        btnvadd.setText("Add");
        btnvadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvaddActionPerformed(evt);
            }
        });

        btnvcancel.setText("Cancel");
        btnvcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvcancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Item Type Bought");

        txtiaddtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiaddtypeActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantity");

        btnview.setText("View All");
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnview))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8)))
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnvadd)
                                .addGap(53, 53, 53)
                                .addComponent(btnvcancel)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtvaddname)
                                .addComponent(txtaddcompany)
                                .addComponent(txtaddlocation)
                                .addComponent(txtaddvtp)
                                .addComponent(txtvaddemail)
                                .addComponent(txtiaddtype)
                                .addComponent(txtvquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel3)
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtaddlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtvaddname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtaddcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtaddvtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtvaddemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtiaddtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnvadd)
                            .addComponent(btnvcancel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnview)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvaddActionPerformed
      
      /* if (Validation())
        {
            JOptionPane.showMessageDialog(this, "Added successfully");
        }
        
        else
        {
        
            JOptionPane.showMessageDialog(this, "Invalid details entered");
        }*/
       
       try{
       
           if(Validation())
           {
           
           Class.forName(driver);
           Connection con=DriverManager.getConnection(url, user, pass);
           String sql="insert into Vendor_Details"
                   +"(Vendor_Name,Comapny_Name,Location,Contact_Number,Email,Item_Bought,Item_Quantity_Bought)"
                   +"values(?,?,?,?,?,?,?)";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1,txtvaddname.getText());
           pst.setString(2, txtaddcompany.getText());
           pst.setString(3,txtaddlocation.getText());
           pst.setString(4, txtaddvtp.getText());
           pst.setString(5, txtvaddemail.getText());
           pst.setString(6,txtiaddtype.getText());
           pst.setString(7, txtvquantity.getText());
           
           pst.executeUpdate();
           JOptionPane.showMessageDialog(this, "Added successfully to the database");
           }
           
           else
           {
               JOptionPane.showMessageDialog(this, "Invalid entry");
           }
           
           
      }
      
      catch(Exception e)
     {
         JOptionPane.showMessageDialog(this, e.getMessage());
       
      }
    }//GEN-LAST:event_btnvaddActionPerformed

    private void txtaddcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddcompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddcompanyActionPerformed

    private void txtiaddtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiaddtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiaddtypeActionPerformed

    private void txtaddvtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddvtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddvtpActionPerformed

    private void txtaddlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddlocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddlocationActionPerformed

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
                Object o[]={rs.getString("Vendor_ID"),
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

    private void btnvcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvcancelActionPerformed
        // TODO add your handling code here:
        txtvaddname.setText("");
        txtaddcompany.setText("");
        txtaddlocation.setText("");
        txtaddvtp.setText("");
        txtvaddemail.setText("");
        txtiaddtype.setText("");
        txtvquantity.setText("");
    }//GEN-LAST:event_btnvcancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvadd;
    private javax.swing.JButton btnvcancel;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtaddcompany;
    private javax.swing.JTextField txtaddlocation;
    private javax.swing.JTextField txtaddvtp;
    private javax.swing.JTextField txtiaddtype;
    private javax.swing.JTextField txtvaddemail;
    private javax.swing.JTextField txtvaddname;
    private javax.swing.JTextField txtvquantity;
    private javax.swing.JTable vendortable;
    // End of variables declaration//GEN-END:variables
}
