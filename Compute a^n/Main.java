#include<iostream>
using namespace std;
int power(int no,int p)
{
  int r=1;
while(p>0)
{
  r=r*no;
  p--;
}
  return r;
}
int main()
{
  int a,n,result;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  result=power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<result;
  //Type your code here.
}