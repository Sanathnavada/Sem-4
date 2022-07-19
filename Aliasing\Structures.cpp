#include<iostream>
using namespace std;

struct date
{
 int d;
 int m;
 int y;
 };
 

 void nextdate(struct date *d1);
 void getdate(struct date *d1);

void myfunc(string country ="norway")
{
cout<<country<<endl;;
}

int main()
{
string food ="pizza is good";

string &meal =food;
cout<<food<<endl<<"accessing food using alias: "<<meal<<endl;

string*str=&food;
cout<<"address of food "<<str<<endl<<"accessing food using pointer: "<<*str<<endl<<"address of str "<<&str<<endl;

myfunc("sweden");
myfunc();

 struct date d1;
 d1.d=15;
 d1.m=4;
 d1.y=2022;
 nextdate(&d1);
 getdate(&d1);


}

 void nextdate(struct date *d1)
  {
  d1->d++;
  }
   void getdate(struct date *d1)
   {
 	cout<<"showing usage of structures in cpp by incrementing date\n date "<<d1->d<<" month "<<d1->m<<" year "<<d1->y<<endl;
   }
 	
   
 
