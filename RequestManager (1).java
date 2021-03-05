/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class RequestManager {
      private List<Request> REQUEST;
     public RequestManager()
     {
       REQUEST = new ArrayList<Request>();
         
     }
     public void init(String filename)
    {
        FileReader reader =null;
        BufferedReader bufReader =null;        
        try{
            reader = new FileReader("REQUEST.csv");
            bufReader = new BufferedReader(reader);
            bufReader.readLine();    
            String oneLine = bufReader.readLine();
            
               while(oneLine !=null){
                System.out.println(oneLine);
                String parts[] = oneLine.split(",");
                StringTokenizer st = new StringTokenizer(oneLine, ",");
                     Integer id=Integer.parseInt(parts[0].trim());
                    String RecipientsName = parts[1].trim();
                    String ContactNo = parts[2].trim();
                    String EmailId = parts[3].trim();
                    String Bag = parts[4].trim();
                    String BloodGroup = parts[5].trim();
                 this.REQUEST.add(new Request(id,RecipientsName,ContactNo,EmailId,Bag,BloodGroup));
                 
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
           // return new request[4];
            //System.out.println(REQUEST.toString());
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
     public List<Request> getrequest()
     {
         List<Request> result =null;
         result = Collections.unmodifiableList(this.REQUEST);
         return result;
     }

public static void main(String[] args)
{
   RequestManager mgr = new RequestManager();
    mgr.init("REQUEST.csv");
   assert(mgr.getrequest().size()==6);
   assert(mgr.getrequest().get(0).getRecipientsName().equals("AAA"));
   
}
  }
