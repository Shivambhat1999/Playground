#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  int sum=6;
  int a=5;
  cin>>n;
  
      if(n>=1)
      {
          cout<<sum<<" ";
      }
  
  for(int i=1;i<n;i++)
  {
      if(n!=1)
      {   
          sum=sum+a;
          cout<<sum<<" ";
      a=a+5;
          
      }
  }

    return 0;
}

