#include <iostream>
using namespace std;
int main() 
{
  int no,rev;
  int rev_num = 0; 
  cin>>no;
    while(no > 0) 
    { 
        rev_num = rev_num*10 + no%10; 
        no = no/10; 
    } 
  cout<<rev_num;
	// Type your code here
	return 0;
}