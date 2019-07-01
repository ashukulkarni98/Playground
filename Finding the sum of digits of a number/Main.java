#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int sum=0;
  int d;
  while(n!=0)
  {
    d=n%10;
    sum=sum+d;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}