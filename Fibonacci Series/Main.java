#include<iostream>
using namespace std;

int fibo(int num)
{
    if (num == 0)
    {
        return 0;
    }
    else if (num == 1)
    {
        return 1;
    }
    else
    {
        return(fibo(num - 1) + fibo(num - 2));
    }
}

int main()
{
  int n;
  cin>>n;
  int result=fibo(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<result;
  //Type your code here.
}