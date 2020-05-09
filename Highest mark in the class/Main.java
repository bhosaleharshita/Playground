#include<iostream>
using namespace std;
int main()
{
  int n,a[50];
  cin>>n;
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  int max=0;
  for(int i=0;i<n;i++)
  {
  if(max<a[i])
  {
  max=a[i];
  }
  }
  cout<<max;
  // Type your code here
}