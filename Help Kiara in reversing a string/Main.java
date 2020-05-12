#include <iostream>
#include <cstring>
using namespace std;
int main()
{
char str[20];  
char temp;
int i;    
cin.getline(str,20);
int j=strlen(str)-1;
while(i<j)
{
    temp=str[i];
    str[i]=str[j];
    str[j]=temp;
    i++;
    j--;
}
cout<<str;
}