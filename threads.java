import java.util.Random;
class Random_Num_Thread extends Thread
{
  public void run ()
  {
    Random rand;
    int i = 0, m;
    do
      {
    	rand = new Random ();
    	m = rand.nextInt (100);
    	System.out.println (m + " ");
    	i++;
    	try
    	{
    	  Thread.sleep (1000);
    	}
    	catch (InterruptedException e)
    	{
    	  e.printStackTrace ();
    	}
      }
    while (i < 10);
  }
}

class Square_Num extends Thread
{
  int n;
  public void run ()
  {
    System.out.println ("Square of a Number " + this.n + " is: " + Math.pow (this.n, 2));
  }
  public Square_Num (int a)
  {
    this.n = a;
  }
}

class Cube_Num extends Thread
{
  int n;
  public void run ()
  {
    System.out.println ("\nCube of a Number " + this.n + " lgis: " + Math.pow (this.n, 3));
  }
  public Cube_Num (int a)
  {
    this.n = a;
  }
}

public class Main
{
  public static void main (String[]args)
  {
    Thread thread1 = new Random_Num_Thread ();
      thread1.start ();
    Thread thread2 = new Square_Num (2);
      thread2.start ();
    Thread thread3 = new Cube_Num (3);
      thread3.start ();
  }
}

