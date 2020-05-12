#include <iostream>
using namespace std;
int main()
{
  int n,i,sum;
  int s,e;
  cin>>s;
  cin>>e;
  for(n=s;n<=e;n++)
  {
    i=1;
    sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum==n)
     cout<<n<<" ";
  }
}