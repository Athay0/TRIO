/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
 public class Donor {

      private int id;
      private  String Name;
     private String ContactNo;
     private String Address;
     private String Emailid;

    public Donor(int id, String Name, String ContactNo, String Address, String Emailid) {
        this.id = id;
        this.Name = Name;
        this.ContactNo = ContactNo;
        this.Address = Address;
        this.Emailid = Emailid;
    }
     public  void setid(int id)
     {
         this.id=id;
     }
    public int getid() {
        return id;
    }
public  void setName(String Name)
     {
         this.Name=Name;
     }
    public String getName() {
        return Name;
    }
    public void setContactNo()
    {
        this.ContactNo= ContactNo;
    }
    public String getContactNo()
    {
        return ContactNo;
    }
public  void setAddress(String Address)
     {
         this.Address=Address;
     }
    public String getAddress() {
        return Address;
    }
public  void setEmailid(String Emailid)
     {
         this.Emailid=Emailid;
     }
    public String getEmailid() {
        return Emailid;
    }

    public String toString() {
        return ("Donor id =" + getid() + "Donor Name =" + getName() + "Contact No =" + getContactNo() + "Address =" + getAddress() + "Emailid is =" + getEmailid());
       
    }
}


