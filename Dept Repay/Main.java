#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  std :: cin>>p>>r>>t;
  std :: cout<<float(p*r*t/100)<<"\n";
  std :: cout<<float(p+(p*r*t/100))<<"\n";
  std :: cout<<float((p*r*t/100)*0.02)<<"\n";
  std :: cout<<float(p+(p*r*t/100)-(p*r*t/100)*0.02);
  return 0;
}