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
  public class RequestManager {
      private List<Request> requestlist;
     public RequestManager()
     {
       requestlist = new ArrayList<Request>();
         
     }
     public void init(String filename)
    {
        FileReader reader =null;
        BufferedReader bufReader =null;        
        try{
            reader = new FileReader("Requestlist.csv");
            bufReader = new BufferedReader(reader);
            bufReader.readLine();    
            String oneLine = bufReader.readLine();
            
               while(oneLine !=null){
                System.out.println(oneLine);
                String parts[] = oneLine.split(",");
                StringTokenizer st = new StringTokenizer(oneLine, ",");
                     Integer id=Integer.parseInt(parts[0].trim());
                    String BloodGroup = parts[1].trim();
                    String RequiredBlood = parts[2].trim();
                    String Time = parts[3].trim();
                  this.requestlist.add(new Request(id,BloodGroup,RequiredBlood,Time));
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
           // return new Request[4];
            //System.out.println(requestlist.toString());
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
     

public static void main(String[] args)
{
   RequestManager mgr = new RequestManager();
    mgr.init("Requestlist.csv");
    assert(mgr.getdonor)
}
  }