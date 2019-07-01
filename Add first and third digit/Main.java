#include<stdio.h>
int main()
{
  int digit,FirstDigit,ThirdDigit,Sum;
  scanf("%d",&digit);
  FirstDigit=(digit/100);
  ThirdDigit=(digit%10);
  Sum=(FirstDigit+ThirdDigit);
  printf("%d",Sum);
  return 0;
}