#include<iostream>
using namespace std;
int main()
{
    
      int n,count,turn;
      cin>>n;
  while(!(n<=0))
        {
        cin>>turn;
        count+=1;
        n=n-turn;
        }
        cout<<"The number of turns is "<<count;
        return 0;
    }
        