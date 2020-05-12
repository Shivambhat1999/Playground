#include<iostream>
using namespace std;
int factorial(int);
int main()
{
    int n;
    cin>>n;
    factorial(n);
    cout<<"The factorial of "<<n<<" is "<<factorial(n);
    return 0;
}

int factorial(int i)
{        int fact=1;

        for(int a=1;a<=i;a++)
        {
        fact=fact*a;
}
    return fact;
}