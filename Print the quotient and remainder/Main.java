#include<stdio.h>
int main()
{
  int i=365;
  int quotient,remainder;
  quotient=(i/4);
  remainder=(i%4);
  printf("Quotient: %d\n",quotient);
  printf("Remainder: %d\n",remainder);
  return 0;
}