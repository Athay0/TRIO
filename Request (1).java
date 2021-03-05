/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Request {
    

      private int id;
      private  String RecipientsName;
      private String ContactNo;
      private String EmailId;
       private String Bag;
       private String BloodGroup;
      
    public Request(int id, String RecipientsName, String ContactNo, String Emailid, String Bag, String BloodGroup) {
        this.id = id;
        this.RecipientsName =RecipientsName;
        this.ContactNo =ContactNo;
        this.EmailId =EmailId;
        this.Bag=Bag;
        this.BloodGroup = BloodGroup;
    }
     public  void setid(int id)
     {
         this.id=id;
     }
    public int getid() {
        return id;
    }
public  void setName(String RecipientsName)
     {
         this.RecipientsName=RecipientsName;
     }
    public String getRecipientsName() {
        return RecipientsName;
    }
    public void setContactNo()
    {
        this.ContactNo= ContactNo;
    }
    public String getContactNo()
    {
        return ContactNo;
    }
    public  void setEmailid(String Emailid)
     {
         this.EmailId=EmailId;
     }
    public String getEmailId() {
        return EmailId;
    }
    public  void setBag(String Bag)
     {
         this.Bag=Bag;
     }
    public String getBag() {
        return Bag;
    }
     public  void setBloodGroup(String BloodGroup)
     {
         this.BloodGroup=BloodGroup;
     }
    public String getBloodGroup() {
        return BloodGroup;
    }
      @Override
    public String toString() {
        return ("Request id =" + getid() + "Request Name =" + getRecipientsName() + "ContactNo =" + getContactNo() + "EmailId is =" + getEmailId() + "Bag =" + getBag() + "Requried Blood Group is =" +getBloodGroup());
       
    }
}

