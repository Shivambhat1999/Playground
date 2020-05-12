#include <iostream>
#include <cmath>  
using namespace std;  
int main()  
{  
int n,r,s,m,sum=0,temp;    
cin>>n;    
temp=n;
  s=r;
  m=n;
  int count=0;
  while(m>0)
{    
     count++;
     s=m%10;        
	 m=m/10;    
}
while(n>0)    
{ 
r=n%10;    
sum=sum+(pow(r,count));    
n=n/10;    
}    
if(temp==sum)    
cout<<"Kindly proceed with encrypting"<<endl;    
else    
cout<<"It is not an Armstrong number"<<endl;   
return 0;  
}