#include<iostream>
#include <bits/stdc++.h>
using namespace std;
  struct College 
  { char name[100];
   char city[100];
   int establishmentYear;
   float passPercentage; 
  };
  

bool compare(College a, College b)
{
  College temp;
	//for descending order replace with a.roll >b.roll
	
          if(a.name > a.name)
          {
            //temp = a[i];
            //a[i] = a[j];
            //a[j] = temp;
            return 1;
          }
         else
           return 0;
}


int main()
{
 
  College c[100];
  int n;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  for(int i=0;i<n;i++)
  {
  cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name\n";
    cin>>c[i].name;
    cout<<"Enter city\n";
    cin>>c[i].city;
    cout<<"Enter year of establishment\n";
    cin>>c[i].establishmentYear;
    cout<<"Enter pass percentage\n";
    cin>>c[i].passPercentage;
  }
  sort(c,c+n,compare);
  cout<<"Details of colleges";
  for(int i=0;i<n;i++)
  {
  
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nCity:"<<c[i].city;
    cout<<"\nYear of establishment:"<<c[i].establishmentYear;
    cout<<"\nPass percentage:"<<c[i].passPercentage;
    
  }
  //Type your code here.
}
