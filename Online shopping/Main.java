#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,e,f,g,h,i;
cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
int u=(a-(a*b/100)+c);
int v=(d-(d*e/100)+f);
int w=(g-(g*h/100)+i);

cout<<"In Flipkart Rs."<<u<<"\n";
cout<<"In Snapdeal Rs."<<v<<"\n";
cout<<"In Amazon Rs."<<w<<"\n";

    if(u<=v && u<=w)
{
    cout<<"He will prefer Flipkart";
}
else if(v<u && v<w)
{
    cout<<"He will prefer Snapdeal";
}
else
{
    cout<<"He will prefer Amazon";
}
    
    return 0;
}
