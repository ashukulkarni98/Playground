#include <stdio.h>
int main() {
	int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int min;
 if(a<b && b<c)
   min=a;
  if(a>b && b<c)
    min=b;
  if( (a%min)==0 && (b%min)==0 && (c%min)==0)
    printf("%d",min);
 
	return 0;
}