#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int n_marks[n];
  for(int i=0;i<n;i++)
  {
    cin>>n_marks[i];
  }
 
  int max=n_marks[0];
  
  
  for(int i=0;i<n;i++)
  {
     if(n_marks[i]>max)
     {
         max=n_marks[i];
     }     
      
  }
  cout<<max;
}