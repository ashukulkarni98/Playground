#include <stdio.h>
int main() 
{
int i;
scanf("%d",&i);
  int arr[i];
  for( int j=0; j<5; j++)
  {
    scanf("%d",&arr[j]);
  }
  for( int j=0; j<5; j++)
  {
    if( arr[j+1] != arr[j])
      printf("%d ",arr[j]);
  }
  
  
	return 0;
}