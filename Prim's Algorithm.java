import java.util.*;
public class Main
{

	public static void main(String[] args)
	{
	
		int am[][] = new int[40][40];
		int vis[] = new int[30];
		int unvis[] = new int[30];
		int n,sv,index=0,min,i,j,k,tc=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter No of vertices ");
		n = sc.nextInt();
		
	System.out.println(" enter the adjacency matrix");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			am[i][j] = sc.nextInt();
		}
	 } 				
				System.out.println("The matrix is ");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(am[i][j] + " ");
			}
				System.out.println();
	}
	

		System.out.println("enter source vertex ");
		sv = sc.nextInt();
		
		vis[sv-1]=1;
unvis[sv-1]=0;

for(i=0;i<n;i++)
{
	if(i!=sv-1)
	{
		unvis[i]=1;
		vis[i] = 0;
	}
}	
for(i=1;i<n;i++)
{
	min=999;
	for(j=0;j<n;j++)
	{
		if(vis[j]==1)
		{
			for(k=0;k<n;k++)
			{
				if((unvis[k]==1)&&(am[j][k]!=999))
				{
					if(min>am[j][k])
					{		
						min=am[j][k];
						
						sv=j;
						index=k;
					}
				}
			}
		}
	}
	
	vis[index]=1;
	unvis[index]=0;
					System.out.println((sv+1) +" -> "+ (index+1));
	tc = tc+min;
	}
					System.out.println("MCST value is " + tc);
					
	}
}				
	
/*
sample i/p:
999 6 1 4 2
6 999 3 999 999
1 3 999 2 999
4 999 2 999 999
2 999 999 7 999
*/	
	
			
