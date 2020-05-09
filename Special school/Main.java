#include<iostream>
#include<string.h>
using namespace std;
void reverseStr(char* str) 
{ 
    int n = strlen(str); 
  
    // Swap character starting from two 
    // corners 
    for (int i = 0; i < n / 2; i++) 
        swap(str[i], str[n - i - 1]); 
} 
int main()
{
  char str1[50],str2[50];
  cin>>str1>>str2;
  reverseStr(str1);
  //cout<<str1;
  if(strcmp(str1,str2)==0)
  {
  cout<<"It is correct";
  }
  else
  {
  cout<<"It is wrong";
  }
  //Type your code here.
}