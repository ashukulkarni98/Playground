#include<stdio.h>
int sum_natural_numbers(int m)
{
  int sum;
  sum=(m*(m+1))/2;
  return sum;
}
int main() {
  int n;
  scanf("%d",&n);
  int sum=sum_natural_numbers(n);
  printf("%d",sum);
    
  	return 0;
}