#include<stdio.h>
int main()
{
  int digit,LastTwoDigits,SecondLastDigit;
  scanf("%d",&digit);
  LastTwoDigits=(digit%100);
  SecondLastDigit=(LastTwoDigits/10);
  printf("%d",SecondLastDigit);
  return 0;
}