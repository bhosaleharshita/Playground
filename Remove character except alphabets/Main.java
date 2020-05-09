#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100],str1[100];
  cin>>str;
  int j=0;
  for(int i=0;i<strlen(str);i++)
  {
  if(isalpha(str[i]))
  {
  str1[j]=str[i];
    j++;
    cout<<str[i];
  }
  }
  //cout<<endl<<str1;
  //Type your code here.
}