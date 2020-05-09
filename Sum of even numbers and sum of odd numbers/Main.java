#include <iostream>
using namespace std;
int main()

{

int i, num, odd_sum = 0, even_sum = 0;

int a[50];

cin>>num;
  for(i=0;i<num;i++)
  {
  cin>>a[i];
  }
  

for (i = 0; i < num; i++)

{

if (a[i] % 2 == 0)

even_sum = even_sum + a[i];

else

odd_sum = odd_sum + a[i];

}

cout<<"The sum of the even numbers in the array is "<<even_sum;

cout<<"\nThe sum of the odd numbers in the array is "<<odd_sum;

}

