#include <iostream>
using namespace std;

char* strrev( char* s )
  {
  char  c;
  char* s0 = s - 1;
  char* s1 = s;

  /* Find the end of the string */
  while (*s1) ++s1;

  /* Reverse it */
  while (s1-- > ++s0)
    {
    c   = *s0;
    *s0 = *s1;
    *s1 =  c;
    }

  return s;
  }

int main()
  {
  char message[100];
cin.getline(message,100);
 // cout << "message = " << message << endl;
  cout << strrev( message );

  return 0;
  }