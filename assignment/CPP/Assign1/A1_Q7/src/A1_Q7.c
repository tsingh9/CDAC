#include <stdio.h>


struct Student{
	char name[30];
	int rollno;
	int age;


};

int main(){
struct Student s;
s.age=6;
s.rollno=15;

scanf("%s",s.name);
printf("name: %s",s.name);

printf("roll no: %d",s.rollno);

printf("age: %d",s.age);



	return 0;
}



