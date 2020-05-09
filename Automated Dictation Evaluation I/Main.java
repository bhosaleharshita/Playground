#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50];
  char str2[50];
  cin>>str1>>str2;
  int result = strcmp(str1, str2);
   if (result==0)
      printf("It is correct");
   else
      printf("It is wrong");
  //Type your code here.
}