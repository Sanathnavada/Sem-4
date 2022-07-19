import java.util.*;
public class Main
{
	static int get_next(int n,float ratio[])
	{
		float lar=-1;
		int i,index=-1;
		for(i=0;i<n;i++)
		{
			if(ratio[i]>lar)
			{
				lar=ratio[i];
				index=i;
			}
		}	
		if(index!=(-1))
			ratio[index]=-1;
		return index;		
	}	
		
	static void Fill_knapsack(int n,int c,float pro[],float wei[],float ratio[])
	{
		float cw=0,cp=0;
		while(cw<c)
		{
			int item=get_next(n,ratio);
			//System.out.println("index"+item);
			if(item==(-1))
				break;
			if((cw+wei[item])<=c)
			{
				cp=cp+pro[item];
				cw=cw+wei[item];
			}
			else
			{
				cp=cp+(((c-cw)/wei[item])*pro[item]);
				cw=cw+(c-cw)/wei[item];
				break;
			}
		}
		System.out.println("the total profit is "+cp);
	}				
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,c,i;
		float ratio[]=new float[20];
		float pro[]=new float[20];
		float wei[]=new float[20]; 
		System.out.println("Enter the no of objects");
		n=sc.nextInt();
		System.out.println("enter the profit and weights in pair");
		for(i=0;i<n;i++)
		{
			pro[i]=sc.nextFloat();
			wei[i]=sc.nextFloat();
			ratio[i]=pro[i]/wei[i];
		}
		System.out.println("the ratio is");
		for(i=0;i<n;i++)
			System.out.println(ratio[i]);
		System.out.println("Enter the capacity");
		c=sc.nextInt();
		Fill_knapsack(n,c,pro,wei,ratio);
		return ;
	}
}		
