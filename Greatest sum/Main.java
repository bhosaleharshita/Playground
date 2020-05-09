#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  cin>>a[i][j];
  }
  }
  
  int sumr=0,sumc=0,maxr=0,maxc=0,maxi=0;
  int sumca[10],sumra[10];
  cout<<"Sum of rows is ";
  
  for(int i=0;i<r;i++)
  {
    sumr=0;
  for(int j=0;j<c;j++)
  {
 	sumr=sumr+a[i][j];
  }
    cout<<sumr<<" ";
    if(maxr<sumr)
    {
      maxr=sumr;
    maxi=i;
    }
      
  }
  cout<<endl<<"Row "<<maxi+1<<" has maximum sum"<<endl;
  
  
  cout<<"Sum of columns is ";
  
  for(int i=0;i<r;i++)
  {
    sumc=0;
  for(int j=0;j<c;j++)
  {
 	sumc=sumc+a[j][i];
  }
    cout<<sumc<<" ";
    if(maxc<sumc)
    {
      maxc=sumc;
    maxi=i;
    }
      
  }
  cout<<endl<<"Column "<<maxi+1<<" has maximum sum"<<endl;
  
  
  
  //Type your code here.
}