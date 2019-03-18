package project1.java;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class CountChar {
 public static void main(String[] args) {
	    	
	    int count=0;

	       
	        File file = new File("E:\\\\ui\\\\java\\\\project1.java\\\\src\\\\project1\\\\java\\\\file2.txt");

	        FileInputStream fis = null;
	        String str = "";

	        try {
	            fis = new FileInputStream(file);
	            int i;
	            while ((i= fis.read()) != -1) {
	               
	                str += (char)i;
	            }
	            for(int j=0;j<str.length();j++) {
	          	  if(str.charAt(j)!=' ')
	          	  {
	          		  count++;
	          	  }
	      

	            }
	            
	            System.out.println(count);
	            } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (fis != null)
	                    fis.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	        }
 }
	        
	

