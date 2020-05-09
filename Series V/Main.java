#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,start=11;
  cin>>n;
  cout<<pow(start,2)<<" ";
  while(n>1)
  {
    start=start+4;
    cout<<pow(start,2)<<" ";
  n--;
  }
  //Type your code here.
}