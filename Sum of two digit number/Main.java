#include<stdio.h>
int main()
{
  int num,UnitPlaceDigit,TenthPlaceDigit,sum;
  scanf("%d",&num);
  UnitPlaceDigit=(num%10);
  TenthPlaceDigit=(num/10);
  sum=(UnitPlaceDigit+TenthPlaceDigit);
  printf("%d",sum);
  return 0;
}