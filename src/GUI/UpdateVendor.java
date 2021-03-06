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
public class UpdateVendor extends javax.swing.JFrame {
    
     

    /**
     * Creates new form UpdateVendor
     */
    
    
    public UpdateVendor() {
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
    
    private static Pattern quantityPtrn = Pattern.compile(
    "^[1-9]\\d*$");
    
    public static boolean validateQuantity(String quantity){
        
         
        Matcher mtchquan = quantityPtrn.matcher(quantity);
        if(mtchquan.matches()){
            return true;
        }
       
        return false;
        
    }
    
     private static Pattern lettersOnlyPtrn = Pattern.compile(
    "[a-zA-Z]");
    
    
    public static boolean validateVendorName(String vname)
    {
         Matcher mtchname = lettersOnlyPtrn.matcher(vname);
        if(vname.length()!=0 && mtchname.matches() )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean validateCompanyName(String vcomname)
    {
          Matcher mtchcom = lettersOnlyPtrn.matcher(vcomname);
        if(vcomname.length()!=0 && mtchcom.matches() )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean validateLocation(String vlocation)
    {
       
          Matcher mtchloc = lettersOnlyPtrn.matcher(vlocation);
        if(vlocation.length()!=0 && mtchloc.matches() )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean validateItemType(String vitype)
    {
       
          Matcher mtchtype = lettersOnlyPtrn.matcher(vitype);
        if(vitype.length()!=0 && mtchtype.matches() )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean Validation()
    {
        String quantity=txtvquantity.getText();
        String vname=txtvname.getText();
        String vcomname=txtcompany.getText();
        String vlocation=txtlocation.getText();
        String vitype=txtitype.getText();
        String email=txtvemail.getText();
        String phonenum=txtvtp.getText();
        if(validateEmailAddress(email) && validatePhoneNumber(phonenum)&&validateVendorName(vname)&& validateCompanyName(vcomname)&& validateLocation(vlocation)&& validateItemType(vitype)&& validateQuantity(quantity))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    private void getValue()
    {
        try {
            
            txtvname.setText(rs.getString("Vendor_Name"));
            txtcompany.setText(rs.getString("Comapny_Name"));
            txtlocation.setText(rs.getString("Location"));
            txtvtp.setText(rs.getString("Contact_Number"));
            txtvemail.setText(rs.getString("Email"));
            txtitype.setText(rs.getString("Item_Bought"));
            txtvquantity.setText(rs.getString("Item_Quantity_Bought"));
            
            
            
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

        txtlocation = new javax.swing.JTextField();
        txtvtp = new javax.swing.JTextField();
        txtvemail = new javax.swing.JTextField();
        btnvupdate = new javax.swing.JButton();
        btnvcancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtitype = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtvname = new javax.swing.JTextField();
        txtcompany = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendortable = new javax.swing.JTable();
        txtvquantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnvsearch = new javax.swing.JButton();
        txtvsearch = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Vendor");

        btnvupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnvupdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnvupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnvupdate.setText("Update");
        btnvupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvupdateActionPerformed(evt);
            }
        });

        btnvcancel.setBackground(new java.awt.Color(0, 0, 0));
        btnvcancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnvcancel.setForeground(new java.awt.Color(255, 255, 255));
        btnvcancel.setText("Cancel");
        btnvcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvcancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Item Type Bought");

        jLabel1.setText("Vendor ID");

        jLabel2.setText("Vendor Name");

        jLabel3.setText("Company Name");

        jLabel4.setText("Location");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Email");

        vendortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VendorID", "Vendor Name", "Company Name", "Location", "Contact Number", "Email", "Item Bought", "Item Quantity Bought"
            }
        ));
        jScrollPane1.setViewportView(vendortable);

        jLabel8.setText("Quantity");

        btnvsearch.setBackground(new java.awt.Color(0, 0, 0));
        btnvsearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnvsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnvsearch.setText("Search");
        btnvsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvsearchActionPerformed(evt);
            }
        });

        btnview.setBackground(new java.awt.Color(0, 0, 0));
        btnview.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setText("Update Vendor");

        jLabel10.setText("eg - 071-1234567");

        jLabel11.setText("eg - someone@example.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnvupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(btnvcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(74, 74, 74)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtvquantity)
                                    .addComponent(txtvsearch, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtcompany, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtlocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtvtp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtitype, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtvemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnvsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtvsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnvsearch))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtvname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtvtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtvemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtitype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnvupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnvcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvsearchActionPerformed
        // TODO add your handling code here:
        
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement pst;

           
            String sql="select * from Vendor_Details where Vendor_Name=?";

            pst=con.prepareStatement(sql);
            pst.setString(1, txtvsearch.getText());
            
            rs = pst.executeQuery();
            
            if (rs.next()) 
            {

                getValue();
                txtvname.setText(rs.getString("Vendor_Name"));
            }
            
            String sql1="select * from Vendor_Details where Vendor_ID=?";
            pst=con.prepareStatement(sql1);
            pst.setString(1, txtvsearch.getText());
            
             rs = pst.executeQuery();

            if (rs.next()) 
            {
                getValue();

            if (rs.next()) {
                getValue();


                txtvsearch.setText(rs.getString("Vendor_ID"));
                
            }
            
            } 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_btnvsearchActionPerformed

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

    private void btnvupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvupdateActionPerformed
        // TODO add your handling code here:
        try {
            
            if(Validation())
                    {
                        Class.forName(driver);
                      Connection con=DriverManager.getConnection(url, user, pass);

                      String value=txtvsearch.getText().toString();

                      String query2="UPDATE Vendor_Details SET Vendor_Name=?,"
                              + "Comapny_Name=?, Location=?,Contact_Number=?,Email=?,Item_Bought=?,Item_Quantity_Bought=? where Vendor_ID="+value;

                     PreparedStatement pst=con.prepareStatement(query2);
                      pst.setString(1,txtvname.getText());
                      pst.setString(2, txtcompany.getText());
                      pst.setString(3,txtlocation.getText());
                      pst.setString(4, txtvtp.getText());
                      pst.setString(5, txtvemail.getText());
                      pst.setString(6,txtitype.getText());
                      pst.setString(7, txtvquantity.getText());

                      pst.executeUpdate();
                      JOptionPane.showMessageDialog(this, "Updated Successfully");
                    }
            else{
                        JOptionPane.showMessageDialog(this, "Invalid entry");
                }
           
           
        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btnvupdateActionPerformed

    private void btnvcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvcancelActionPerformed
        // TODO add your handling code here:
        txtvname.setText("");
        txtcompany.setText("");
        txtlocation.setText("");
        txtvtp.setText("");
        txtvemail.setText("");
        txtitype.setText("");
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
            java.util.logging.Logger.getLogger(UpdateVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateVendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvcancel;
    private javax.swing.JButton btnview;
    private javax.swing.JButton btnvsearch;
    private javax.swing.JButton btnvupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtitype;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtvemail;
    private javax.swing.JTextField txtvname;
    private javax.swing.JTextField txtvquantity;
    private javax.swing.JTextField txtvsearch;
    private javax.swing.JTextField txtvtp;
    private javax.swing.JTable vendortable;
    // End of variables declaration//GEN-END:variables
}
