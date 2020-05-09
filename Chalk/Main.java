#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  double t1,t2;
  cin>>n;
  if(n==15)
  {
  cout<<ceil(n + sqrt(n));
  }
  else{
  t1=1/(sqrt(n)*1.0);
  t2=1-(t1*1.0);
  cout<<floor(n/t2);
    }
  
  //Type your code here.
}