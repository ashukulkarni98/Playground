#include<stdio.h>
int power(int i, int j)
{
  int k=pow(i,j);
  return k;
}
    
int main(){
    int n;
  scanf("%d",&n);
    int m;
  scanf("%d",&m);
  int l=power(n,m);
  printf("%d",l);
  	return 0;
}