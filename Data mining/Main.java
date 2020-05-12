#include<iostream>
using namespace std;
int main()
{
int num,a,count=0;
     int sum1=0,sum2=0;
  cin>>num;
  while(num!=0)
  {
  if(num%2==0)
  {
  a=num%10;
    num=num/10;
    sum1=sum1+a;
  }
    else
    {
    a=num%10;
    num=num/10;
    sum2=sum2+a;
    }
    
  }
  if(sum1!=sum2)
  cout<<"No";
  else
  cout<<"Yes";
}