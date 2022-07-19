#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void merge(int low,int mid,int high,int a[],int n)
{
int h=low,i=low,j=mid+1,b[n],k;
while(h<=mid && j<=high)
{
	if(a[h]<=a[j])
		b[i++]=a[h++];

	else
		b[i++]=a[j++];
}
if(h>mid)
{
	for(k=j;k<=high;k++)
	{
		b[i++]=a[k];
	}
}
if(j>high)
{
	for(k=h;k<=mid;k++)
	{
		b[i++]=a[k];
	}
}

for(k=low;k<=high;k++)
	a[k]=b[k];
}

void ms(int low,int high,int a[],int n)
{ 	int mid;
	if(low<high)
	{
		mid=(low+high)/2;
		ms(low,mid,a,n);
		ms(mid+1,high,a,n);
		merge(low,mid,high,a,n);
	}
}



void display(int n,int a[])
{
	for(int i=0;i<n;i++)
	printf("%d \n",a[i]);
	printf("\n");
	
}

void readarr(int n,int a[])
{
printf("\nenter the elements  ");
	for(int i=0;i<n;i++)
	scanf("%d",&a[i]);
}

void checkcase(int n,int a[])
{ int i,c=0;

				for(i=0;i<n-1;i++)
					{
						if(a[i]<=a[i+1])
						{
							c=1;
							
						}
						else
						{c=0;
						break;
						}
					}
					if(c!=1)
					{
    					for(i=0;i<n-1;i++)
    					{
    						if(a[i]>=a[i+1])
    						{
    							c=2;
    							
    						}	
    						else
    						{ c=0;
    						break;
    						}
					    }
					}
					
					if(c==1)
					printf("best case\n");
					else if(c==2)
					printf("worst case \n");
					else
					printf("average case \n");
					
}					


void main()
{

	int n,ch,i;
	printf("enter the size of array ");
	scanf("%d",&n);
		printf("\n");
	int a[n],high=n-1,low=0;
	for(;;)
	{
	clock_t t1,t2;
	double b=0.0,c=0.0,d=0.0;
		printf("\nEnter \n1 for best case \n2 for average case \n3 for worst case \n4 to exit \n5 to check case\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:for(i=0;i<n;i++)
					{a[i]=i+1;
					}
					t1=clock();
					ms(low,high,a,n);
					t2=clock();
					b =(double)(t2-t1)/60;
					printf("time taken is %f\n",b);
					display(n,a);	
					break;
				
			case 3:for(i=0;i<n;i++)
					{
						
						a[i]=n-i;
						
					}
					t1=clock();
					ms(low,high,a,n);
					t2=clock();
					c =(double)(t2-t1)/60;
					printf("time taken is %f\n",c);					
					display(n,a);
					break;
			case 2:	for(i=0;i<n;i++)
					a[i]= rand()%50000;
					t1=clock();
					ms(low,high,a,n);
					t2=clock();
					d =(double)(t2-t1)/60;
					printf("time taken is %f\n",d);		
					display(n,a);
					break;  
			
			case 4:exit(0);
			
			case 5: readarr(n,a);
					checkcase(n,a);
					break;		

			default:printf(" enter from 1 to 3");
		}
	}		      
			
	/*printf("\nenter the elements  ");
	for(int i=0;i<n;i++)
	scanf("%d",&a[i]);
	ms(low,high,a,n);
	display(n,a);*/
}
