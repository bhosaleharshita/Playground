#include<iostream>
using namespace std;
int arraytype(int n,int *a)
{
  int flag,t;
  if(a[1]%2==0)
  {
  t=0;
    for(int i=1;i<n;i++)
    {
      if(a[i]%2!=0)
      { flag=3;}
        else
      {flag=1;}
    }
    
  }
  else
  {
  t=1;
    for(int i=1;i<n;i++)
    {
      if(a[i]%2==0)
      {flag=3;}
       else
      {flag=2;}
    }
    
  }
return flag;
  
}
int main()
{
  int n,a[50],result;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  result=arraytype(n,a);
  if(result==1)
    cout<<"The array is Even";
  else if(result==2)
    cout<<"The array is Odd";
  else if(result==3)
    cout<<"The array is Mixed";
    
  //Type your code here.
}