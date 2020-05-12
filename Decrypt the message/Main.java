#include<iostream>
using namespace std;
int main()
{
int num1,num2,num,i=1,sum=0;
cin>>num1>>num2;
num=num1+num2;
while(i<num)
  {
  
   if(num%i==0) 
      sum=sum+i;

  i++;
 
}
  
if(sum==num)
    cout<<"They can read the message";
  else
    
cout<<"They can't read the message";
}