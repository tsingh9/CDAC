#include <iostream>
using namespace std;
class Student{

protected:
	int age;
public:
	int rollNo;
	char name[40];
private:
     int marks;

public:
     void getData();




public:
	void setData(){
		cout<<"Enter name:";
		cin>>name;
		cout<<"Enter age:";
		cin>>age;
		cout<<"Enter rollno:";
		cin>>rollNo;
		cout<<"Enter marks:";
		cin>>marks;
}


};

void Student::getData()
		{
             cout<<name;
             cout<<marks;
             cout<<rollNo;
             cout<<age;
}

int main(){
	Student s;
	s.setData();
	s.getData();


	return 0;
}




