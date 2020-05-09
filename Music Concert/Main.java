#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  int odd=0,even=0;
  for(int i=0;i<n;i++)
  {
  if(a[i]%2==0)
  {
  even++;
  }
    else
    {
    odd++;
    }
  }
  cout<<odd<<endl<<even;
  return 0;
}