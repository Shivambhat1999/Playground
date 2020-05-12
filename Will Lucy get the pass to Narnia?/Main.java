#include<iostream>
int main()
{
int x,y,z;
 std :: cin>>x>>y>>z;
  std :: cout<<"Enter first number : Enter second number : Menu"<<"\n"<<"1.Addition"
    <<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder\n";

  switch(z)
  {
     case 1: std :: cout<<x+y<<"\n";
     break;
     case 2: std :: cout<<x-y<<"\n";
     break;
     case 3: std :: cout<<x*y<<"\n";
     break;
     case 4: std :: cout<<x/y<<"\n";
     break;
     case 5: std :: cout<<x%y<<"\n";
     break;
     default :
     std :: cout<<"Invalid operation";
  }

}