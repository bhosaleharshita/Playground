#include<iostream>
#include<math.h>
using namespace std;

int main()
{
int n,start=7;
  cin>>n;
  while(n>0)
  {
   start=start+4;
  cout<<pow(start,2)<<" ";
    n--;
  }
}