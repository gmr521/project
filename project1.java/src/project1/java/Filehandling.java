package project1.java;

import java.io.FileReader;
import java.io.FileWriter;


public class Filehandling {
	 public static void main(String args[]){ 
		
		 
         try{    
        	 FileReader fs=new FileReader("E:\\ui\\java\\project1.java\\src\\project1\\java\\file2.txt");  
        	 FileWriter ft=new FileWriter("E:\\ui\\java\\project1.java\\src\\project1\\java\\file3.txt");  
          int i;  
           while((i=fs.read())!=-1) {
           System.out.print((char)i);
           ft.write((char)i);}
 fs.close();
 ft.close();
             
         }catch(Exception e) {
         e.printStackTrace();  } 
        }  
	
       } 


