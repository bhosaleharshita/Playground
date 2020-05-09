#include<iostream>
using namespace std;
int main()
{
  int n,count,result;
  cin>>n;
   
  while(n>=1)
  {
    if(n==1)
    {
    cout<<n<<endl;
      n--;
      break;
    }
  else if(n%2==0)
  {
  	cout<<n<<endl;
     n=n/2;
  }
    else
    {
    cout<<n<<endl;
      n=(3*n)+1;
    }
  count++;
  }
  cout<<count;
  
  //Type your code here.
}