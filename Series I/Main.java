#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  float sum=0.5;
  cin>>n;
  
      if(n>=1)
      {
          cout<<sum<<" ";
      }
  
  for(int i=1;i<n;i++)
  {
      if(n!=1)
      {
          sum=sum+pow(3,i-1);
          cout<<sum<<" ";
      }
  }

    return 0;
}

