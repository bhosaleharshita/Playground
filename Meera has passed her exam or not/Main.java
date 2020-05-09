#include<iostream>
using namespace std;
int main()
{
  int n,a[100],rno;
  cin>>n;
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  cin>>rno;
  int flag=0;
  for(int i=0;i<n;i++)
  {
  if(rno==a[i])
  {
    flag=1;
    break;
  }
  }
  if(flag==1)
  {
  cout<<"She passed her exam";
  }
  else
  {
  cout<<"She failed";
  }
  // Type your code here
}