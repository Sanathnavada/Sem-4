import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int adj[][] = new int[30][30];
		int vis[]= new int[30];
		//int unvis[]= new int[30];
		int dist[] =new int [30];
		
		System.out.println("enter the number of vertices ");
		int n = sc.nextInt();
		System.out.println("enter the matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				adj[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("the matrix is ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(adj[i][j]+" ");		
			}
			System.out.println();
		}
		
		System.out.println("Enter source vertex ");
		int src = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			dist[i]= adj[src][i];
			vis[i]=0;
		}
		vis[src]=1;
		pgm obj = new pgm();
		obj.dijj(n,adj,src,dist,vis);
		
	}

}


 class pgm{
	public  void dijj(int n ,int adj[][],int src ,int dist[],int vis[])
		{int unvis=0;
		
		for(int i=0;i<n;i++)
		{			unvis= calcmin(unvis,dist,n,vis);
					vis[unvis]=1;
			for(int vertex =0;vertex<n;vertex++)
			{    
				if (dist[unvis] +adj[unvis][vertex]<dist[vertex])
				{
					dist[vertex]= dist[unvis] + adj[unvis][vertex];
				} 
			}
		}
		System.out.println("Distance from source "+src+ " to ");

		for(int i=0;i<n;i++)
		{
			System.out.print("vertex "+(i+1)+" is "+dist[i]+"\n");

			
		
		}
        }
	
	private static int calcmin(int unvis,int dist[],int n,int vis[])
	{	int min= 999;
	     int v=0;
		for(unvis=0;unvis<n;unvis++)
		{
		if(vis[unvis]!=1 && dist[unvis]<=min) 
			{ 
			min= dist[unvis];
			v=unvis;
			}
		}
		return v;
	}
}







/*
 * 0 3 999 7 999
3 0 4 2 999
999 4 0 5 6
7 2 5 0 4
999 999 6 4 0
 */
