#include<iostream>
using namespace std;
int main()
{
  int n,fib=0;
  cin>>n;
 
  
  int x = 0, y = 1, z = 0;
   for (int i = 0; i < n; i++) {
      fib=x;
      z = x + y;
      x = y;
      y = z;
   }
  cout<<fib;
  //Type your code here.
}