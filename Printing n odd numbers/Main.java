#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int num=1;
  for(int count=1; count<=n;)
  {
    if((num%2)!=0)
    {
      printf("%d\n",num);
      count=count+1;
    }
    num=num+1;
  }
    
	return 0;
}