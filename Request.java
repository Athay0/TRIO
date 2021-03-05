/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
 public class Request {

      private int id;
      private  String Blood Group;
     private String Required Blood;
     private String Time;
     
 public Request(int id, String BloodGroup, String RequiredBlood, String Time) {
        this.id = id;
        this.BloodGroup = BloodGroup;
        this.RequiredBlood = RequiredBlood;
        this.Time = Time;
        }
     public  void setid(int id)
     {
         this.id=id;
     }
    public int getid() {
        return id;
    }
public  void setBloodGroup(String BloodGroup)
     {
         this.BloodGroup=BloodGroup;
     }
    public String getBloodGroup() {
        return BloodGroup;
    }
    public void setRequiredBlood()
    {
        this.RequiredBlood= RequiredBlood;
    }
    public String getRequiredBlood()
    {
        return RequiredBlood;
    }
public  void setTime(String Time)
     {
         this.Time=Time;
     }
    public String getTime() {
        return Time;
    }

  public String toString() {
        return ("Request id =" + getid() + "Blood Group =" + getBloodGroup() + "Required Blood =" + getRequiredBlood() + "Time =" + getTime());
       
    }
}


