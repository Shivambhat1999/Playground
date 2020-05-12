#include<iostream>
#include<math.h>
using namespace std;
int bacteria(int,int,int);
int main()
{
	int n1,n2,n3,sum=0;
    cin>>n1>>n2>>n3;
  int s=bacteria(n1,n2,n3);
  
     if(s>=n3)
  {
  cout<<"Doctor, you can proceed with your experiment.";
  }
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  }
int bacteria(int a,int b,int c)
{
int sum=pow(a,b);
return sum;
}
  