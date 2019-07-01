// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int i;
  scanf("%d",&i);
  int arr[i];
  for( int j=0; j<i; j++)
  {
    scanf("%d",&arr[j]);
  }
 printf("%d",(i-1));
   return 0;
}