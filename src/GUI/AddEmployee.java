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
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Purnima
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
 
    
 /*   private static Pattern txt_Phone = Pattern.compile("\\d{3}-\\d{7}");
    
    
    public static boolean validatePhoneNumber(String phonenum){
        
         
        Matcher mtch1 = txt_Phone.matcher(phonenum);
        if(mtch1.matches()){
            return true;
        }
        return false;
        
    }
   
    
    private static Pattern DobPtrn = Pattern.compile( "^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$");
    
    
    public static boolean validateDob(String dob){
        
         
        Matcher mtch2 = DobPtrn.matcher(dob);
        if(mtch2.matches()){
            return true;
        }
        return false;
        
    }
    
       public static void DOB(String date) {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("\\d{2}-\\d{2}-\\d{4}");
        try
        {
            
            formatter.parse(date);
            System.out.println("");
        }
        catch(Exception e)
                {
                    System.out.print("X");
                }
    }
    
  
    public boolean Validation()
    {
        String dob=txt_dob.getText();
        String phonenum= txt_Phone.getText();
        
        
        if(validateDob(dob) && validatePhoneNumber(phonenum))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    } */
    public AddEmployee() {
        initComponents();
    }
    
   
   String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
   String url="jdbc:sqlserver://localhost:1433;databaseName=Viskam_Flora_DB_New_";
   String user="nethsara123";
   String pass="123";
 
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Fname = new javax.swing.JTextField();
        txt_Designation = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_Shift = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_Phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        View_Emp_tbl = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btneadd = new javax.swing.JButton();
        btnecancel = new javax.swing.JButton();
        cmbposition = new javax.swing.JComboBox<>();
        txtpassword = new javax.swing.JPasswordField();
        txtpasswordconfirm = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        errPhoneNum = new javax.swing.JLabel();
        errFname = new javax.swing.JLabel();
        errDes = new javax.swing.JLabel();
        errDob = new javax.swing.JLabel();
        errAddr = new javax.swing.JLabel();
        errCon = new javax.swing.JLabel();
        errpw = new javax.swing.JLabel();
        errCpw = new javax.swing.JLabel();
        errShift = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Employee Name");

        jLabel4.setText("Designation");

        jLabel5.setText("Position");

        jLabel6.setText("DOB");

        jLabel7.setText("Shift");

        jLabel8.setText("Address");

        jLabel9.setText("Contact Number");

        jLabel10.setText("Password");

        txt_Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FnameActionPerformed(evt);
            }
        });
        txt_Fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_FnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FnameKeyReleased(evt);
            }
        });

        txt_Designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_DesignationKeyReleased(evt);
            }
        });

        txt_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dobKeyReleased(evt);
            }
        });

        txt_Shift.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ShiftKeyReleased(evt);
            }
        });

        txt_Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_AddressKeyReleased(evt);
            }
        });

        txt_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PhoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PhoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PhoneKeyTyped(evt);
            }
        });

        View_Emp_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Designation", "Postion", "DOB", "Shift", "Address", "Contact_Number", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(View_Emp_tbl);
        if (View_Emp_tbl.getColumnModel().getColumnCount() > 0) {
            View_Emp_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel11.setText("Confirm Password");

        btneadd.setText("Add");
        btneadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneaddActionPerformed(evt);
            }
        });

        btnecancel.setText("Reset");
        btnecancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnecancelActionPerformed(evt);
            }
        });

        cmbposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager/Owner", "Regular Employee" }));

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });

        txtpasswordconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordconfirmActionPerformed(evt);
            }
        });
        txtpasswordconfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordconfirmKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordconfirmKeyTyped(evt);
            }
        });

        jLabel12.setText("Ex : 011-1234567");

        jLabel13.setText("Ex : yyyy-mm-dd");

        errFname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errFname.setForeground(new java.awt.Color(255, 0, 0));

        errDes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errDes.setForeground(new java.awt.Color(255, 51, 0));

        errDob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errDob.setForeground(new java.awt.Color(255, 0, 0));

        errAddr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errAddr.setForeground(new java.awt.Color(255, 0, 0));

        errCon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errCon.setForeground(new java.awt.Color(255, 0, 0));

        errpw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errpw.setForeground(new java.awt.Color(255, 0, 0));

        errCpw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errCpw.setForeground(new java.awt.Color(255, 0, 0));

        errShift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errShift.setForeground(new java.awt.Color(204, 0, 0));

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Add Employee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(btneadd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnecancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(errPhoneNum))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Shift, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbposition, 0, 290, Short.MAX_VALUE)
                                .addComponent(txt_Fname)
                                .addComponent(txt_Designation)
                                .addComponent(txt_dob)
                                .addComponent(txt_Address)
                                .addComponent(txt_Phone))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12))
                    .addComponent(txtpasswordconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(errFname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(errDob, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(errAddr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errDes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errShift, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errCon, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(errpw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errCpw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(errFname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6))
                                            .addComponent(errDob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_Shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(49, 49, 49))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(errDes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(150, 150, 150)
                                        .addComponent(errShift, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(errAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(errCon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(errpw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpasswordconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(errCpw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneadd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnecancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneaddActionPerformed
        // validation phone number
       
        
         try
             { 
              
         /*Database connection */
           Class.forName(driver);
           Connection con=DriverManager.getConnection(url, user, pass);
           
            /*sql query*/
           String sql= "Insert into Employee_Details"
                   +"(Employee_Name,Designation,Position,DOB,Shift,Address,Contact_Number,Password)"
                   +"Values(?,?,?,?,?,?,?,?)";
           PreparedStatement pst= con.prepareStatement(sql);
           pst.setString(1,txt_Fname.getText());
           pst.setString(2,txt_Designation .getText());
           String Position;
            Position=cmbposition.getSelectedItem().toString();
            pst.setString(3,Position);
           pst.setString(4,txt_dob.getText());
           
           pst.setString(5,txt_Shift.getText());
           pst.setString(6,txt_Address.getText());
           pst.setString(7,txt_Phone.getText());
           pst.setString(8,txtpassword.getText());
           
          pst.executeUpdate();
           JOptionPane.showMessageDialog(this, "Added successfully to the database");
         }
        
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e.getMessage());
         }
         
    
    }//GEN-LAST:event_btneaddActionPerformed

    private void txt_FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FnameActionPerformed

    private void txt_FnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FnameKeyPressed

    private void btnecancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnecancelActionPerformed
        // TODO add your handling code here:
        txt_Address.setText(" ");
        txt_Designation.setText(" ");
        txt_Fname.setText(" ");
       
        txt_Phone.setText(" ");
        txt_Shift.setText(" ");
        txt_dob.setText(" ");
        txtpassword.setText("");
        txtpasswordconfirm.setText("");
    }//GEN-LAST:event_btnecancelActionPerformed

    private void txtpasswordconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordconfirmActionPerformed

    private void txt_PhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PhoneKeyReleased
        // TODO add your handling code here:
      //validation phone
      
        String phone=txt_Phone.getText().toString();
        Pattern p = Pattern.compile("\\d{3}-\\d{7}");
        Matcher m = p.matcher(txt_Phone.getText());
        if(m.matches())
        {
            errCon.setText("");
        }
        else
       {
            errCon.setText("X");
       }
        
        
        
        
    }//GEN-LAST:event_txt_PhoneKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
   try {
       Connection con=DriverManager.getConnection(url,user, pass);
       PreparedStatement pst;
       pst= con.prepareStatement("select * from Employee_Details");
       ResultSet rs=pst.executeQuery();
       DefaultTableModel tm=(DefaultTableModel)View_Emp_tbl.getModel();
       tm.setRowCount(0);
       
       while (rs.next()) {
           Object o[]={rs.getInt("Employee_ID"),
               rs.getString("Employee_Name"),
               rs.getString("Designation"),
               rs.getString("Position"),
               rs.getDate("DOB"),
               rs.getString("Shift"),
               rs.getString("Address"),
               rs.getString("Contact_Number"),
               rs.getString("Password")};
             tm.addRow(o);
           
       }
       
   }     
   catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
       
   }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpasswordconfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordconfirmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordconfirmKeyTyped

    private void txt_FnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FnameKeyReleased
        // TODO add your handling code here:
        
        //validate name
                String fname=txt_Fname.getText().toString();
        if(fname.equals("")){
            errFname.setText("X");
        }
        else{
            errFname.setText("");
        }
        
    }//GEN-LAST:event_txt_FnameKeyReleased

    private void txt_DesignationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DesignationKeyReleased
        // TODO add your handling code here:
        //designation validate
                 String designation=txt_Designation.getText().toString();       
        if(designation.equals("")){
            errDes.setText("X");
        }
         else{
            errDes.setText("");
        }
        
    }//GEN-LAST:event_txt_DesignationKeyReleased

    private void txt_dobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dobKeyReleased
        // TODO add your handling code here:
        //validate dob
                String dob=txt_dob.getText().toString();
        if(dob.equals("")){
            errDob.setText("X");
        }
         else{
            errDob.setText("");
        }
                Pattern b = Pattern.compile("\\d{4}-[01]\\d-[0-3]\\d");
        Matcher ma = b.matcher(txt_dob.getText());
        if(ma.matches())
        {
            errDob.setText("");
         }
        else
       {
            errDob.setText("X");
       }
        
        
    }//GEN-LAST:event_txt_dobKeyReleased

    private void txt_AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AddressKeyReleased
        // TODO add your handling code here:
        //address validation
                        String address=txt_Address.getText().toString();
        if(address.equals("")){
            errAddr.setText("X");
        }
         else{
            errAddr.setText("");
        }
 
    }//GEN-LAST:event_txt_AddressKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        // TODO add your handling code here:
        //pw validation
                  String password=txtpassword.getText().toString();   
        if(password.equals("")){
            errpw.setText("X");
        }
         else{
            errpw.setText("");
        }
        
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtpasswordconfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordconfirmKeyReleased
        // TODO add your handling code here:
        //comfirm pw validation
                
        String passwordconfirm=txtpasswordconfirm.getText().toString();
        if(passwordconfirm.equals(txtpassword.getText())){
            errCpw.setText("");
        }
         else{
            errCpw.setText("X");
        }
        
    }//GEN-LAST:event_txtpasswordconfirmKeyReleased

    private void txt_ShiftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ShiftKeyReleased
        // TODO add your handling code here:
        //shift validation        

        String Shift=txt_Shift.getText().toString();
       

        if(Shift.equals("")){
            errShift.setText("X");
        }
         else{
            errShift.setText("");
        }
        
    }//GEN-LAST:event_txt_ShiftKeyReleased

    private void txt_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PhoneKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_PhoneKeyTyped

    private void txt_PhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PhoneKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_PhoneKeyPressed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable View_Emp_tbl;
    private javax.swing.JButton btneadd;
    private javax.swing.JButton btnecancel;
    private javax.swing.JComboBox<String> cmbposition;
    private javax.swing.JLabel errAddr;
    private javax.swing.JLabel errCon;
    private javax.swing.JLabel errCpw;
    private javax.swing.JLabel errDes;
    private javax.swing.JLabel errDob;
    private javax.swing.JLabel errFname;
    private javax.swing.JLabel errPhoneNum;
    private javax.swing.JLabel errShift;
    private javax.swing.JLabel errpw;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_Designation;
    private javax.swing.JTextField txt_Fname;
    private javax.swing.JTextField txt_Phone;
    private javax.swing.JTextField txt_Shift;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpasswordconfirm;
    // End of variables declaration//GEN-END:variables
}
