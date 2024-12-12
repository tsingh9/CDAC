#include <iostream>
using namespace std;
class Employee{


	char name[40];
	int id;
	int salary;
public:

	void setData(){
		cout<<"Enter name:"<<endl;
		cin>>name;
		cout<<"Enter id:";
		cin>>id;
		cout<<"Enter salary:";
		cin>>salary;

}
	void getData()	{
		             cout<<name;
		             cout<<id;
		             cout<<salary;

		}


};



int main(){
	Employee s;
	s.setData();
	s.getData();


	return 0;
}






