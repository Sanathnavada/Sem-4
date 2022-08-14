#include<stdio.h>
#include<stdlib.h>



void swap(int *a ,int *b)
{
int c;
c=*a;
*a=*b;
*b=c;
}

int partition(int low,int high,int a[])
{
	int pivot,i,j;
	pivot=a[low];
	 i=low;
	 j=high;
	while(i<=j)
	{
		while(a[i]<=pivot)
		{
			i=i+1;
		}
		while(a[j]>pivot)
		{
			j=j-1;
		}
		if(i<j)
		swap(&a[i],&a[j]);
	}
	a[low]=a[j];
	a[j]=pivot;
	return j;
	
}

void quicksort(int low,int high,int a[])
{
	int j;
	if(low<high)
	{     
		j=partition(low,high,a);
		quicksort(low,j-1,a);
		quicksort(j+1,high,a);
	}
}






void main()
{
	int i,j,n;
	printf("enter number of elements ");
	scanf("%d",&n);

	int a[n];

	/*
	printf("enter the elements \n");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);*/
		
	for(i=0;i<n;i++)
	a[i]=rand()%50000;
	
	printf("entered array is \n");
	for(i=0;i<n;i++)
		printf("%d\t",a[i]);

	quicksort(0,n-1,a);
	printf("\narray after sorting is \n");
	for(i=0;i<n;i++)
	printf("%d\t",a[i]);
	
}
