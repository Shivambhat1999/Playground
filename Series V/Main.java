#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  int sum=121;
  int a=11;
  cin>>n;
  
  
      if(n>=0)
      {
          cout<<sum<<" ";
      }
  
  for(int i=1;i<n;i++)
  {
      if(n!=0)
      {   
        {   a=a+4;
            sum=pow(a,2);
        }
          cout<<sum<<" ";
        
          
      }
  }

    return 0;
}