#include<iostream>
using namespace std;
int main()
{
  int n,a[50],loc,value;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>loc;
  if(loc>=n)
  {cout<<"Invalid Input";
  goto label;}
  cout<<"Enter the value to insert"<<endl;
  cin>>value;
  
  for(int i=n-1;i>=loc-1;i--)
  {
  a[i+1]=a[i];
  }
  a[loc-1]=value;
  
  
  cout<<"Array after insertion is "<<endl;
  for(int i=0;i<n+1;i++)
  {
  cout<<a[i]<<endl;
  }
  label:
  return 0;
  //Type your code here.
}