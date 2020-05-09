#include<iostream>
using namespace std;
int main()
{
  
  int w,a,c,weight;
  cin>>w>>a>>c;
  weight=(a*75)+(c*30);
  if(weight<=w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  //Type your code here.
}