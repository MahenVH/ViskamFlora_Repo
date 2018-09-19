/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Purnima
 */
public class Vendor {
    private int vendorid,vtp,quantity;
    private String vname,company,location,vemail,itype;
    
    public Vendor(int vendorid,String vname,String company,String location,int vtp,String vemail,String itype,int quant)
    {
        this.vendorid=vendorid;
        this.vname=vname;
        this.company=company;
        this.location=location;
        this.vtp=vtp;
        this.vemail=vemail;
        this.itype=itype;
        this.quantity=quant;
    }
    
    public int getvendorid()
    {
        return vendorid;
    }
    
    public String getvname()
    {
        return vname;
    }
    
    public String getcompany()
    {
        return company;
    }
    
    public String getlocation()
    {
        return location;
    }
    
    public int getvtp()
    {
        return vtp;
    }
    public String getvemail()
    {
        return vemail;
    }
    
    public String getitype()
    {
        return itype;
    }
    
    public int getquantity()
    {
        return quantity;
    }
}
