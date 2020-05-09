#include<iostream>

#include<math.h>
using namespace std;
struct complex
{
float rel;
float img;
}s1,s2;

int main()
{

float a,b;
  int ch;
  cin>>ch;

cin>>s1.rel>>s1.img;

cin>>s2.rel>>s2.img;

//Addition
  switch(ch)
  {
    case 1:
      {
a=(s1.rel)+(s2.rel);
b=(s1.img)+(s2.img);
cout<<a<<"+"<<b<<"i";
      break;
      }

    case 2:
      {
//Subtraction
a=(s1.rel)-(s2.rel);
b=(s1.img)-(s2.img);
       if(b>0)
		cout<<a<<"+"<<b<<"i";
        else
         cout<<a<<"-"<<b<<"i";
      break;
      }

//Multiplication
    case 3:
      {
a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
b=((s1.rel)*(s2.img))+((s2.rel)*(s1.img));
        if(b>0)
cout<<a<<"+"<<b<<"i";
         else
         cout<<a<<b<<"i";
      break;
      }

    default:
      {
      cout<<"Invalid choice";
        break;
      }
  }
return 0;
}