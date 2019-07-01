#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int product=1;
  for(int count=1; count<=n; ++count)
  {
    product=product*count;
  }
  printf("%d",product);
    
	return 0;
}