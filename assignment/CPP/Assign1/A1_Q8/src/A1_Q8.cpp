
#include <iostream>
using namespace std;

struct Student{
	int rollno;
	char name[30];
	int age;

	void setData(){
      cout<<"Enter name:";
      cin>>name;
       cout<<"Enter age:";
       cin>>age;
      cout<<"Enter rollno:";
       cin>>rollno;


	}
	void getData(){

		cout<<name;
		cout<<age;
		cout<<rollno;


	}

};


int main() {
	Student s;
	s.setData();
	s.getData();

}
