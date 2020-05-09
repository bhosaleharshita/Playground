#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,t;
  cin>>n;

  for (int i=1;i<=n;i++)
  {
  if(i%2!=0)
  {
  cout<<pow(i,2)-1<<" ";
  }
  else
  {
  	cout<<pow(i,2)-2<<" ";
  }
   
  }
  //Type your code here.
}