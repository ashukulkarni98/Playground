#include <stdio.h>
int main() {
int n;
  scanf("%d",&n);
  for( int count=1; count<=n; ++count)
  {
    if((count%3)==0)
    {
printf("%d,",count);
    }
    else
      printf("%d",count);
  }
	return 0;
}