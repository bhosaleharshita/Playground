#include<iostream>
using namespace std;
int main()
{
    int n,i,j,k,s;
    cin>>s;
  	n=4;
    for(i=1;i<=n;i++)
    {
        for(k=1;k<=i;k++)
        {
            cout<<s;
        }
        s++;
        cout<<endl;
    }
    s--;
    for(i=n;i>=1;i--)
    {
        for(k=1;k<=i;k++)
        {
            cout<<s;
        }
        s--;
        cout<<endl;
    }
    return 0;
}