import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    int n;
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the numberof objects");
      n = sc.nextInt ();
    int W[] = new int[n + 1];
    int w;
    int P[] = new int[n + 1];
      System.out.println ("Enter the capacity");
      w = sc.nextInt ();
      System.out.println ("Enter the values");
    int i;
    for (i = 1; i <= n; i++)
      {
	P[i] = sc.nextInt ();
      }
    System.out.println ("Enter the weights");
    for (i = 1; i <= n; i++)
      {
	W[i] = sc.nextInt ();
      }
    int j;
    int V[][] = new int[n + 1][w + 1];
    for (i = 0; i <= n; i++)
      {
	    V[i][0] = 0;
      }
    for (j = 0; j <= w; j++)
      {
	    V[0][j] = 0;
      }
    for (i = 1; i <= n; i++)
      {
    	for (j = 1; j <= w; j++)
    	  {
    	    if (W[i] <= j)
    	      {
    		V[i][j] = Math.max (V[i - 1][j], P[i] + V[i - 1][j - W[i]]);
    	      }
    	    else
    	      {
    		V[i][j] = V[i - 1][j];
    	      }
    	  }
      }
    for (i = 0; i < n + 1; i++)
      {
    	for (j = 0; j < w + 1; j++)
    	  {
    	    System.out.print (V[i][j] + " ");
    	  }
    	System.out.println ();
      }
    System.out.println ("The optimal solution is:" + V[n][w]);

  }

}

