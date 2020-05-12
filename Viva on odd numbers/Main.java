
#include<iostream>
using namespace std;
int main()
{
    
    int a,count=0;
    float score=0.0;
    while(count!=3)
    {
        cin>>a;
    if(a%2!=0 && a>0)
    {
        score=score+1.0;
      count++;
    }
    else if(a%2==0 && a>0)
    {
        score=score-0.5;
    }
    
    else if(a<0)
    {
        score=score - 1.0;
    break;
        
    }
    
    
    }
    cout<<float(score);
    return 0;
    
}