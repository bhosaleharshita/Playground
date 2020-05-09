#include<iostream>
using namespace std;
int main()
{
  string dir;
  int rail;
  
  cin>>dir;
  cin>>rail;
  
  if(dir=="front")
  {
    if(rail==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(dir=="rear")
  {
    if(rail==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  
}