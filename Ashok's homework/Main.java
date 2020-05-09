#include<iostream>
using namespace std;

int main()
{
  int n1[10][10],n2[10][10],result[10][10];
    // Type your code here
  int r,c;
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  cin>>n1[i][j];
  }
  }
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  cin>>n2[i][j];
  }
  }
  
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  result[i][j]=n1[i][j]+n2[i][j];
  }
  }
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  cout<<result[i][j]<<" ";
  }
    cout<<endl;
  }
  
}