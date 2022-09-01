/*
 Design and implement in Java to find a subset of a given set S = {Sl, S2,.....,Sn} of n
positive integers whose SUM is equal to a given positive integer d. For example, if S ={1, 2, 5,
6, 8} and d= 9, there are two solutions {1,2,6}and {1,8}. Display a suitable message, if the
given problem instance doesn't have a solution.
 */
import java.util.Scanner;

public class Main 
{
	static int set[]=new int[10];
	static int solvector[]=new int [10];
	static int target;
	static int count=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int no_ele= sc.nextInt();
		System.out.println("Enter the numbers in ascending order");
		for(int i=0; i<no_ele;i++)
			set[i]=sc.nextInt();
		System.out.println("Enter the target sum");
	               target=sc.nextInt();
		int tot_sum=0;
		for(int i=0;i<no_ele;i++)
		{
			tot_sum=tot_sum+set[i];
		}
		
		

        if(target>tot_sum)
		{
			System.out.println("Solution doesnt Exist");
			System.exit(0);   
		}
     	System.out.println("The solutions are");
       	 Subset(0,0,tot_sum);
	}

	public static void Subset(int sumsofar, int  index,int remsum)
	{
		solvector[index]=1;
		if(sumsofar+set[index]==target)
		{
			System.out.println("Solution No: = "+ (++count));
			for(int i=0;i<=index;i++)
			{
			    if(solvector[i]==1)
				System.out.println(" "+set[i]);
			}
		}
		else if(sumsofar+set[index]+set[index+1]<=target)
			{
				Subset(sumsofar+set[index], index+1, remsum-set[index]);
			}
		if((sumsofar+remsum-set[index]>=target)&& (sumsofar+set[index+1]<=target))
		{
			solvector[index]=0;
			Subset(sumsofar,index+1,remsum-set[index]);
		}
	}
}

/*
  OUTPUT
Enter the number of items: 
6
Enter the numbers in ascending order
1
3
5
7
9
11
Enter the target sum
12
the solution vector is
Solution No: = 1
 1
 11
Solution No: = 2
 3
 9
Solution No: = 3
 5
 7
 */


