#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c],b[r][c],t[c][r],result[50][50];
  for( int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  { cin>>a[i][j];}
  }
  for( int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  { cin>>b[i][j];}
  }
  for( int i=0;i<c;i++)
  {
  for(int j=0;j<r;j++)
  { t[j][i]=a[i][j];}
  }
  
  for( int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  { 
    
    result[i][j]=a[i][j]+b[i][j];
  
  }
  }
  
  for( int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  { 
    cout<<result[i][j]<<" ";
  
  }
    cout<<endl;
  }
  
  
   
  //Type your code here.
}