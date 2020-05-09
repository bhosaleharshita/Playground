#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
  int tb,tr,rs,bb,no;
  float of,crr,trr;
  cin>>tb>>tr>>rs>>bb;
  no=tb/6;
  of=(bb/6)+((bb%6)/10.0);
  crr=(rs/of);
  trr=tr/(no*1.0);
  cout<<no<<"\n"<<of<<"\n";
  cout<<fixed<<setprecision(1)<<crr;
  cout<<"\n"<<fixed<<setprecision(1)<<trr<<"\n";
  trr<crr?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
  //Type your code here.
}