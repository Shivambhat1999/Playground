#include<iostream>
using namespace std;
struct employee
{
  char name[30];
  char designation[30];
  int id;
  int age;
  float salary;
 };

int main()
{
  employee s;
  cout<<"Enter name:"<<"\n";
  cin>>s.name;
  cout<<"Enter ID:"<<"\n";
  cin>>s.id;
  cout<<"Enter age:"<<"\n";
  cin>>s.age;
  cout<<"Enter designation:"<<"\n";
  cin>>s.designation;
  cout<<"Enter Salary:"<<"\n";
  cin>>s.salary;
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : "<<s.name<<"\n";
  cout<<"ID of the Employee : "<<s.id<<"\n";
  cout<<"Age of the Employee : "<<s.age<<"\n";
  cout<<"Designation of the Employee : "<<s.designation<<"\n";
  cout<<"Salary of the Employee : "<<s.salary;
  return 0;
}
