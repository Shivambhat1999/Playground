 
#include <iostream>

using namespace std;

int main()
{
    int num,count=0;
    cin>>num;
    cout<<num;
        for(int i=1;num>1;i++)
        {
          count+=1;
        if(num%2==0)
        {
           num=num/2;
            cout<<endl<<num;
           
        }
        else
        {
            num=3*num+1;
            cout<<endl<<num;
        }
        }
        cout<<endl<<count;
        return 0;
        
    }