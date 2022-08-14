//package pgm1;
import java.util.*;
 class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int A[]=new int[n];
		int i;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		sc.close();
		int low=0,high=(n-1);
		merge_sort(A,low,high);
		System.out.println("The sorted elements are:");
		for(i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	static void merge_sort(int A[],int low,int high) 
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			merge_sort(A,low,mid);
			merge_sort(A,mid+1,high);
			merge(A,low,mid,high);
		}
	}
	static void merge(int A[],int low, int mid,int high)
	{
		int B[]=new int[A.length];
		int h=low,i=low,j=(mid+1),k;
		while((h<=mid) && (j<=high))
		{
			if(A[h]<=A[j])
			{
				B[i++]=A[h++];
			}
			else
			{
				B[i++]=A[j++];
			}
		}
		if(h>mid)
		{
			for(k=j;k<=high;k++)
			{
				B[i]=A[k];
				i++;
			}
		}
		else
		{
			for(k=h;k<=mid;k++)
			{
				B[i]=A[k];
				i++;
			}
		}
		for(k=low;k<=high;k++)
		{
			A[k]=B[k];
		}
	}
}
	

