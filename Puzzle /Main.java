#include<iostream>
using namespace std;
int main() {
   int transpose[10][10], r=3, c=2, i, j;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
  for(j=0;j<c;j++)
  {
  cin>>a[i][j];
  }
  }
   
  
  
   for(i=0; i<r; ++i)
      for(j=0; j<c; ++j) {
         transpose[j][i] = a[i][j];
      }
   
   for(i=0; i<c; ++i) {  
      for(j=0; j<r; ++j)
         cout<<transpose[i][j]<<" ";
      cout<<endl;
   }
   return 0;
}