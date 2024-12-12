#include<stdio.h>

int main(){


	const int a=5;
	const int*  p=&a;
int* p1=(int*)(p);
*p1= 6;
printf("%d",*p);
}



