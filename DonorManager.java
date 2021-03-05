/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JFrame;
  public class DonorManager {
      private List<Donor> donorlist;
     public DonorManager()
     {
       donorlist = new ArrayList<Donor>();
         
     }
     public void init(String filename)
    {
        FileReader reader =null;
        BufferedReader bufReader =null;        
        try{
            reader = new FileReader("Donorlist.csv");
            bufReader = new BufferedReader(reader);
            bufReader.readLine();    
            String oneLine = bufReader.readLine();
            
               while(oneLine !=null){
                System.out.println(oneLine);
                String parts[] = oneLine.split(",");
                StringTokenizer st = new StringTokenizer(oneLine, ",");
                     Integer id=Integer.parseInt(parts[0].trim());
                    String Name = parts[1].trim();
                    String ContactNo = parts[2].trim();
                    String Address = parts[3].trim();
                    String Emailid = parts[4].trim();
                 this.donorlist.add(new Donor(id,Name,ContactNo,Address,Emailid));
                while(st.hasMoreTokens())
                {
                    System.out.println(st.nextToken());
                }
           oneLine = bufReader.readLine();           
            }
             
        }
           catch (Exception e)
              {
         e.printStackTrace();
     System.out.println("IO Exception");
              }
           finally{
           // return new Donor[4];
            //System.out.println(donorlist.toString());
                   try{
              bufReader.close();
            reader.close();
        }
                   catch(IOException e)
                   {
                   e.printStackTrace();
                   }
                   }
  }
  public List<Donor> getdonor()
  {
      List<Donor> result =null;
      result = Collections.unmodifiableList(this.donorlist);
      return result;
  }
     

public static void main(String[] args)
{
   DonorManager mgr = new DonorManager();
    mgr.init("Donorlist.csv");
    assert(mgr.getdonor().size()==5);
    assert(mgr.getdonor().get(0).getName().equals("AAA"));
    JFrame manageDonorUI = new ManageDonorUI(mgr);
    manageDonorUI.setVisible(true);
      
}
  }