import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
class Customer
{
  private String name;
  private String date_of_birth;
  public Customer (String Name, String Date_of_birth)
  {
    name = Name;
    date_of_birth = Date_of_birth;
  }
  public void displayData ()
  {
    StringTokenizer st = new StringTokenizer (date_of_birth, "/");
    System.out.print (name);
    while (st.hasMoreTokens ())
      {
	System.out.print ("," + st.nextToken ());
      }
  }
}

class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
      System.out.println ("Enter Name :-");
    String name = in.nextLine ();
      System.out.println ("Enter Date of birth in dd/mm/yyyy format:-");
    String date = in.next ();
    Customer Cust = new Customer (name, date);
      Cust.displayData ();
  }
}

