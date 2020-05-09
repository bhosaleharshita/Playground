#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,temp=0;
  cin>>n;
  temp=n;
  while(n>0)
  {
  sum=sum+(n%10);
    n=n/10;
    
  }
  if(temp%sum==0)
  {
  cout<<"Harshad Number";
  }
  else
  {
  cout<<"Not Harshad Number";
  }
  //Type your code here.
}