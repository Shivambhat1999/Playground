#include<iostream>
using namespace std;
int sum=0;
int digitroot(int i)
{
    if(i==0)
    return 0;
    else
     sum=i % 10 + digitroot(i / 10);
     return sum % 10 + digitroot(sum/10);
    
}

    int main()
{
    int n;
    cin>>n;
    cout<<digitroot(n);
    return 0;
}