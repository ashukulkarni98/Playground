#include <stdio.h>
int main() {
	int num;
  scanf("%d",&num);
  int ld=num%10;
  int sum=0;
  while(num>=100)
  {
    num=num/10;
  }
  int sd;
  sd=num/10;
  sum=sd+ld;
  printf("%d",sum);
	return 0;
}