/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Mahen
 */
public class User {
    private int Customer_ID,Customer_Contact_Number;
    private String Customer_FName,Customer_LName,
            Customer_Address,Customer_Email,Customer_Date_Added;
    
    public User(int Customer_ID,String Customer_FName,String Customer_LName,
            String Customer_Address,int Customer_Contact_Number,String Customer_Email,String Customer_Date_Added)
    {
        
    this.Customer_ID=Customer_ID;
    this.Customer_FName=Customer_FName;
    this.Customer_Address=Customer_Address;
    this.Customer_Contact_Number=Customer_Contact_Number;
    this.Customer_Email=Customer_Email;
    this.Customer_Date_Added=Customer_Date_Added;
  
    }
    
    public int Customer_ID()
    {
    return Customer_ID;
    
    }
    
    public String Customer_FName()
    {
    return Customer_FName;
    }
    
    public String Custommer_Lname()
    {
        return Customer_LName;
    }
    
    
    public String Customer_Address()
    {
    
    return Customer_Address;    
    }
    
    public int Customer_Contact_Number()
    {
    return Customer_Contact_Number;
    
    }
    
    public String Customer_Email()
    {
    return Customer_Email;
    }
    
    public String Customer_Date_Added()
    {
    return Customer_Date_Added;
    }
}
