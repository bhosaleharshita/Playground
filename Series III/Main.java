#include<iostream>
using namespace std;
int main()
{
int n,start=6,factor=5;
  cin>>n;
  int i=1;
  cout<<start<<" ";
  for(i=1;n>1;i++,n--)
  {
    start=start+factor*i;
    cout<<start<<" ";
  }
}