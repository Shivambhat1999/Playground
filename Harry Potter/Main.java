#include<iostream>
using namespace std;
int main()
{
int n,digit1,digit2,digit3,digit4;
  cin>>n;
  digit1=n%10;
  n=n/10;
  digit2=n%10;
   n=n/10;
  digit3=n%10;
  n=n/10;
  digit4=n%10;
   cout<<digit1+digit4;
  return 0;
  

}
