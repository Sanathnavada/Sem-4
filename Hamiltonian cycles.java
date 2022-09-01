import java.util.Scanner;

public class Main 
{
	static int n;
	static int adj[][] = new int[10][10];
	static int x[] = new int[10];
	static int flag = 0;
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		n = scan.nextInt();
		System.out.println("Enter the adjacency matrix");
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= n; j++)
				adj[i][j] = scan.nextInt();
		x[1] = 1;
		Hamiltonian(2);
		if(flag == 0)
			System.out.println("No Hamiltonian cycle present for the given graph");
	}
	
	static void Hamiltonian(int k)
	{// for all values in x[assume 5 vertices x[5]]
	//the algorithm will check 5(1 to 5 ,1 not possible) values for x[5], values for x[4] backtracking upto x[2] (x[1] is fixed as 1)
		do
		{
			NextValue(k);
			if(x[k] == 0)
				return;        // base case for recursive call
			if(k == n)     // if it has reached the last node then print the answer then  backtrack to find other posssible solns using k+1
    			{
    				flag = 1;
    				System.out.println("The Hamiltonian cycle is:");
    				for(int i = 1; i <= n; i++)
    					System.out.print(x[i]+" ");
    				System.out.print("1\n");
    			}
			else
				Hamiltonian(k + 1);
		}while(true);
	}
	
	static void NextValue(int k)
	{
		int j;
		do
		{
			x[k] = (x[k] + 1) % (n + 1);   // used for backtracking
			if(x[k] == 0)    //if 0 further path does not exist back track to the last recently used vertex
				return;
			if(adj[x[k - 1]][x[k]] == 1)      // is there any edge connecting k-1 to k vertice(finding out from adj matric)
			{
				for(j = 1; j <= k - 1; j++)   //for checking duplicate(ie if the edge k  is already taken into consideration
				     if(x[j] == x[k])         //(ie already in the path of the cycle that we are exploring hence from j=1,2..k if found break)
						break;                            
				    
				if(j == k)                    //if the k is not already present then j will be equal to k after the previous loop finishes
					if((k < n) || ((k == n) && adj[x[n]][x[1]] == 1))   //check if you are on the last vertex and there is a path from last to first
						return;
			}
		}while(true);
	}
}


