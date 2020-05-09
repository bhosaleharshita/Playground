#include<iostream>
using namespace std;
int main()
{
  int r,c,max;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  cin>>a[i][j];
  }
  }
  
  for(int i=0;i<c;i++)
  {
    max=a[0][i];
  for(int j=1;j<r;j++)
  {
 	if(a[j][i]>max)
      max=a[j][i];
   // cout<<"df";
  }
    cout<<max<<endl;
   // cout<<"fdfv"<<endl;
  }
  //Type your code here.
}