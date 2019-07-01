#include <stdio.h>
int main(){
  	int n;
  scanf("%d",&n);
  int row;
  for(row=1; row<=n; row++)
  {
    for(int count=1; count<=row; count++)
    {
      printf("%d",row);
    }
    printf("\n");
  }
	return 0;
}