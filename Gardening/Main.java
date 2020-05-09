#include<iostream>
using namespace std;
int main()
{
  int rows,columns,no;
  cin>>rows>>columns>>no;
  int s,sl;
  s=rows*2;
  sl=rows*(columns-1);
  if((no>s-3&&no<=s)||(no>sl-3&&no<=sl))
    cout<<"It is a mango tree";
  else
     cout<<"It is not a mango tree";
  //Type your code here.
}