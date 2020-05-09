#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int no,fact;
  cin>>no;
  fact=1;
  for(int i=1;i<=no;i++)
  {
  fact=fact*i;
  }
  cout<<fact;
}