#include<iostream>
using namespace std;
int fib(int i)
{    
    if(i<=1)
    return i;
    
    else
    return fib(i-1)+fib(i-2);
}
    
int main()
{
    int n;
    cin>>n;
    cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-1);
    return 0;
}