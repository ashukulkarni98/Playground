#include<stdio.h>
int square(int n)
{
  int square_of_digit;
  square_of_digit=(n*n);
  return square_of_digit;
}
int main() {
int m;
  scanf("%d",&m);
  int square_of_digit=square(m);
  printf("%d",square_of_digit);
  
   return 0;
}