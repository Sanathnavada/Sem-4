import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the number of vertices");
		n = sc.nextInt();
		int R[][] = new int[n][n];
		System.out.println("Enter the matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				R[i][j] = sc.nextInt();
			}
		}
		Main obj = new Main();
		obj.war(n,R);
	}
	void war(int n,int R[][])
	{
		int i,j,k;
		for(k=0;k<n;k++)						//( a[i][k] && a[k][j] )
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					R[i][j] = R[i][j]|( R[i][k]&R[k][j]);
				}
			}
		}
		System.out.println("The transitive closure is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(R[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}

