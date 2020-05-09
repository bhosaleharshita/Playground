#include<iostream>
using namespace std;
int main()
{
int c,n1,n2;
 cout<<"Enter first number : ";
  cin>>n1;
  cout<<"Enter second number : ";
  cin>>n2;
  cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
    cin>>c;
  switch(c)
  {
    case 1:
      cout<<"\n"<<n1+n2;
      break;
    case 2:
      cout<<"\n"<<n1-n2;
      break;
     case 3:
      cout<<"\n"<<n1*n2;
      break;
     case 4:
      cout<<"\n"<<n1/n2;
      break;
     case 5:
      cout<<"\n"<<n1%n2;
      break;
    default:
      cout<<"\nInvalid operation";
      break;
      
  }
}