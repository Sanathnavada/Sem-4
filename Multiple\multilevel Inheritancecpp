#include<iostream>
using namespace std;

class rectangle
{
protected:
int l,b,a,c,d;


 protected:void getinput()
 {
 cout<<"enter length and breadth "<<endl;
 cin>>l>>b;

 }
 
 protected:int area(int h);
 };
 
 int rectangle:: area(int h)
 { 
 getinput();
 a=l*b;
 c=l*h;
 d=b*h;
 return a;
 }
 
 class circle
 {
 protected :int r;
 protected:float ca;
 
 protected:void areac()
 {
 
 ca = 3.14*r*r;
 
 }
 };
 
 
 
class cuboid : protected rectangle 
{
protected: int h;

void setinput( int height=10)
{
h = height;

}
 public:void arear()
 {
 int height;
 cout<< "enter height "<<endl;
 cin>>height;
 setinput(height);
 a = area(h);
 cout<<"surface area of cuboid is "<<2*a+2*c+2*d<<endl;
 
 
 cout<<"volume of cuboid is "<<l*b*h<<endl;;
 }
 };
 
 class cylinder : protected cuboid,circle
 {
 float cind;
 public: void cyarea()
 {
 arear();
  cout<<"enter radius ";
 cin>>r;
 areac();
 cout<<"total surface area of cylinder is "<<2*3.14*r*h+2*ca<<endl;
 }
 };
 
 
 
 int main()
 {
 cylinder c1;
 c1.cyarea();
 return 0;
 }
 
 
