#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  int sum=0;
  cin>>n;
  
  for(int i=1;i<=n;i++)
  {
      if(n>=0)
      {   
        if(i%2!=0)
        {
            sum=pow(i,2)-1;
        
            cout<<sum<<" ";
        }
        else if(i%2==0)
        {
            
            sum=(pow(i,2)-2);
            cout<<sum<<" ";
        }

          
      }
  }

    return 0;
}

