#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tues,wed,thu,fri,sat;
  int charge1,charge2,charge3,charge4,charge5,charge6,charge7;
  cin>>sun>>mon>>tues>>wed>>thu>>fri>>sat;
  if(sun>0)
      charge1=sun*100+(sun*100)/2;
      if(mon>8)
        charge2=800+(mon-8)*115;
  else
      charge2=mon*100;
      if(tues>8)
      charge3=800+(tues-8)*115;
      else
      charge3=tues*100;
      if(wed>8)
      charge4=800+(wed-8)*115;
      else
      charge4=wed*100;
      if(thu>8)
      charge5=800+(thu-8)*115;
      else
      charge5=thu*100;
      if(fri>8)
      charge6=800+(fri-8)*115;
      else
      charge6=fri*100;
      if(sat>0)
      charge7=sat*100+(sat*100)/4;
      if(mon+tues+wed+thu+fri>40 && sat==0 &&sun==0)
      cout<<charge2+charge3+charge4+charge5+charge6+(125*(40-mon+tues+wed+thu+fri));
      else
      cout<<charge1+charge2+charge3+charge4+charge5+charge6+charge7;
      
return 0;
}
