#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int n1,n2,n3,result,pro,r;
  cin>>n1>>n2>>n3>>r;
 pro=n1*n2*n3;
  
int d=1;
int i=1;
while(i<=n1&&i<=n2&&i<=n3){
if(n1%i==0&&n2%i==0&&n1%i==0)
d=i;
i++;
}
  
  if(d==r)
    cout<<"Answer is correct.";
   else
     cout<<"Answer is wrong.";
     
     
return 0;
}
