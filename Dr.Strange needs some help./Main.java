#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int res;
  res=pow(m,n);
  if(res>=req)
  {
  cout<<"Doctor, you can proceed with your experiment.";
  }else
  {
  cout<<"Sorry Doctor! You need more bacteria.";
  }
return 0;
}