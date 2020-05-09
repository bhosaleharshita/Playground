#include<iostream>
using namespace std;
int fact(int n)
{
  if(n==1)
    return 1;
  else
    return n*fact(n-1);

}
int main()
{
  int no;
  cin>>no;
  cout<<"The factorial of "<<no<<" is "<<fact(no);
  
  //Type your code here.
}