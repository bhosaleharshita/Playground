#include<iostream>
using namespace std;
int main()
{
  int n,sumf=0,sumb=0;
  cin>>n;
  int a[n][n],t[n][n];
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  {
  cin>>a[i][j];
  }
  }
  
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  {
    if(i==j)
    {
  sumf=sumf+a[i][j];
    }
  }
  }
  
  for(int i=0; i< n; i++)
                {
                         
                         sumb=sumb+a[i][n - i - 1];
                } 
 // cout<<sumf<<" "<<sumb<<endl;
    if(sumf==sumb)
    cout<<"Yes";
  else
    cout<<"No";
    //ype your code here.
}