#include <stdio.h>

int main() {
   const int a=5;

	const int *p=&a;

	int b=5;
	int* const p1=&b;
	printf("%p ",p);
	printf("%p ",p1);
   const int* const p2=&a;
    printf("%p",p2);

	return 0;
}

