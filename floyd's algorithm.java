package pgm5;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		n = in.nextInt();
		int i,j,k;
		int D[][] = new int[n][n];
		System.out.println("Enter the matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				D[i][j] = in.nextInt();
			}
		}
		System.out.println("The entered matrix is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(D[i][j]+" " );
			}
			System.out.println();
		}
		System.out.println("Computing distance");
		for(k=1;k<=n;k++)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					D[i][j] = Math.min(D[i][j],D[i][k-1]+D[k-1][j]);
				}
			}
		}
		System.out.println("The distance matrix D is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(D[i][j]+" " );
			}
			System.out.println();
		}
	}
}
}


