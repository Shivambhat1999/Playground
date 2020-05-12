#include<iostream>
using namespace std;
//To check if the number is harshad(niven) or not 
int main() 
{ int n,m,a;                 //initializing the variables
 int sum=0; 
cin>>n;                      //enter the number
 m=n;                        // storing value of n
 while(n!=0) 
 { a=n%10;         //spliting in digits
 n=n/10; 
sum=sum+a; //getting sum of digits
 }
 if((m%sum)==0) //checking condition
{
 cout<<"Harshad Number"; 
} 
else
 { 
cout<<"Not Harshad Number"; 
} 
}