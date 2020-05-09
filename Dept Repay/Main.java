#include<iostream>
using namespace std;
int main()
{
  int p,r,n;
  double intrest,amt,discount,nr,fin;
  cin>>p>>r>>n;
  float rate;
  rate=r/100;
  intrest=p*n*r/100;
  amt=p+intrest;
  discount=intrest*0.02;
  nr=intrest-discount;
  fin=p+nr;
cout<<intrest<<"\n"<<amt<<"\n"<<discount<<"\n"<<fin;
  //Type your code here.
}