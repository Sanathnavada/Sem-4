import java.util.*;

public class Main
{
 public static void main (String[]args)
 {
  while (true)
  {
	try
	{
	     System.out.println("Hierarchylevels of try throw finally used here is \n 1(a=0)\n   2a(a=1)\n     3(1st)(a=2)\n   2b(a=3)\n     3(2nd)(a=4)");
	     System.out.println("Enter value of a");
	  Scanner sc = new Scanner (System.in);
	  int a = sc.nextInt ();
	  int b = 42 / a;
	  System.out.println ("a=" + a);
	   try
	    {
    	    if (a == 1)
    	      a = a / (a - a);
    	    try
    	    {
        	      if (a == 2)
        		{
        		  int c[] = { 1 };
        		  c[42] = 99;
        
        		}
    	    } 
    	    catch (ArrayIndexOutOfBoundsException e)
    	    {
    	      System.out.println("ArrayIndexOutOfBoundsException of innermost(3(1st)) try" + e);
    
    	    }
    	    finally
    	    {
    	      System.out.println ("level 3(1st)'s finally");
    	    }
	  }
	  catch (ArithmeticException e)
	  {
	    System.out.println ("ArithmeticException of inner(2nd) try " + e);
	  }
	  finally
	  {
	    System.out.println ("level 2a's finally");

	  }

       try
	   {
	     if (a == 3)
	      demothrow ();
           try{
               if(a==4)
               demothrow2();
               }
               catch(IllegalAccessException e)
               {
  	                 System.out.println ("IllegalAccessException of innermost 3(2nd)'s try " + e);
                 
               }
               finally
    	    {
    	      System.out.println ("level 3(2nd)'s finally");
    	    }
	   }
	   catch (NullPointerException e)
	   {
	    System.out.println("function's rethrow caught/ NullPointerException of inner (2nd) try " + e);

	   }
	   finally
	   {
	    System.out.println("Main function's finally/ level 2b's finally ");

	   }
	   
        
   }
   catch (ArithmeticException e)
   {
	  System.out.println ("ArithmeticException of 1st try " + e);
        return;
   }
   finally
   {
	  System.out.println ("level 1's finally");

   }
  }
 }

  static void demothrow ()
  {
    try
    {
      throw new NullPointerException ("ownthrow");
    }
    catch (NullPointerException e)
    {
      System.out.println ("function's throw caught(inside)");
      
      throw e;
      
    }
    finally
    {
      System.out.println ("function's finally");

    }
  }
  
  static void demothrow2() throws IllegalAccessException
  {
      throw new IllegalAccessException("this is to demonstrate throws");
  }



}



