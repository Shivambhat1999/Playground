#include<iostream>
using namespace std;
struct College
{
   char name[100];
   char city[100];
   int establishmentYear;
  float passPercentage;
};
int main()
{
  
  int n;
  cout<<"Enter the number of colleges"<<"\n";
  cin>>n;
  College s[n];
  for(int i=1;i<=n;i++)
  {
  cout<<"Enter the details of college "<<i<<"\n";
  cout<<"Enter name"<<"\n";
  cin>>s[i].name;
  cout<<"Enter city"<<"\n";
  cin>>s[i].city;
  cout<<"Enter year of establishment"<<"\n";
  cin>>s[i].establishmentYear;
  cout<<"Enter pass percentage"<<"\n";
  cin>>s[i].passPercentage;
  }
  cout<<"Details of colleges"<<"\n";
  for(int w=1;w<=n;w++)
  {
  
  cout<<"College:"<<w<<"\n";
  cout<<"Name:"<<s[w].name<<"\n";
  cout<<"City:"<<s[w].city<<"\n";
  cout<<"Year of establishment:"<<s[w].establishmentYear<<"\n";
  cout<<"Pass percentage:"<<s[w].passPercentage<<"\n";
  }
}