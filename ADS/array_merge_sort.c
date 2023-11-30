#include<stdio.h>
void main()
{
int m,n,i,j,k,temp;

printf("Enter the size of Array A\n");
scanf("%d",&m);
printf("Enter the size of Array B\n");
scanf("%d",&n);

int arr1[m],arr2[n],arr3[m+n];

printf("Enter the numbers in A\n");
for(i=0;i<m;i++)
{
scanf("%d",&arr1[i]);
arr3[i]=arr1[i];
}

printf("Enter the Numbers in B\n");
for(i=0;i<n;i++)
{
scanf("%d",&arr2[i]);
arr3[i]=arr2[i];
}

printf("\nThe First Array is:\n");
for(i=0;i<m;i++)
{
printf("%d",arr1[i]);
}

printf("\nThe Second Array is:\n");
for(i=0;i<n;i++)
{
printf("%d",arr2[i]);
}

printf("\nThe Joined Array is:\n");
for(i=0;i<m+n;i++)
{
printf("%d",arr3[i]);
}

printf("The Sorted Array is:");
for(i=0;i<m+n;i++)
{
for(j=0;j<m+n;j++)
{
if(arr3[i]>arr3[j])
