#include<iostream>
using namespace std;
int main()
{
  struct employee
  {
  char name[100];
    int id;
    int age;
    char des[200];
    int salary;
  };
  
  employee e;
  cout<<"Enter name:";
  cin>>e.name;
  cout<<"\nEnter ID:";
  cin>>e.id;
  cout<<"\nEnter age:";
  cin>>e.age;
  cout<<"\nEnter designation:";
  cin>>e.des;
  cout<<"\nEnter Salary:";
  cin>>e.salary;
  
  cout<<"\nEmployee Details\n";
  cout<<"Name of the Employee : "<<e.name<<endl;
   cout<<"ID of the Employee : "<<e.id<<endl;
   cout<<"Age of the Employee : "<<e.age<<endl;
   cout<<"Designation of the Employee : "<<e.des<<endl;
   cout<<"Salary of the Employee : "<<e.salary<<endl;
  //Type your code here.
}