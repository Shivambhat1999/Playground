#include<iostream>
using namespace std;
int main()
{
  int w,a,c;
  std :: cin>>w>>a>>c;
  if(w>(75*a+30*c))
  {
  std :: cout<<"Boat is stable";
  }
  else if(w<(75*a+30*c))
  {
  std :: cout<<"Boat will drow";
  }
  else
  {
  std :: cout<<"Invalid input";
  }
  return 0;
  //Type your code here.
}