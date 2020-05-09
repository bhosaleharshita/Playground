#include<iostream>
using namespace std;
int main()
{
int i,j,n;
  cin>>n;
for(i=1;i<=n;i++)
{
    int special=i+1;
    if(i%2==1)
    {
        for(j=1;j<=n-1;j++)
        {
            cout<<i;
        }
       cout<<special<<endl;
    }
    else if(i%2==0)
    {
        cout<<special;
        for(j=1;j<=n-1;j++)
        {
            cout<<i;
        }
       cout<<endl;
    }
}
}