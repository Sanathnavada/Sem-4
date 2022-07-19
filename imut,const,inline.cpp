#include<iostream>
using namespace std;

class d
{
 public:mutable int z;
int a;
float b;

public:
void increment()const
{
z++;
//a++; not possible
//b++; not possible
cout<<z<<endl;
}
};

void inline cube( int a)
{
int b =a*a*a;
cout<<"cube is "<<b;
}

int main()
{
 d var1;
 var1.z=10;
 var1.increment();
 cube(10);
 
 }
 
