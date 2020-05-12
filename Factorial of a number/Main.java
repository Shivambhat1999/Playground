#include<iostream>
using namespace std;
int main()
{
int num;
int fact=1;
 cin >> num;
  for(int i=num;i>0;i--)
  {
 
    fact =i*fact;
  }
    cout<<fact;

}
