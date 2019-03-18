package project1.java;
public class Exceptionarthemaic {
public static void main(String args[])
  {
    int a =10, b = 0, c;

    try
    {
      c = a/b;
      System.out.println(c);  
    }
    catch(ArithmeticException e)
    {
      System.out.println("Do not divide by zero" +e  );
    }
    
  }
}


