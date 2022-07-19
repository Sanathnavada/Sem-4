#include<iostream>
using namespace std;
class A
{
public:static float pr;
public:static void setpr();
private:class B
        {
       private: int t,z;
        float r;

        public:
                 void settr(int a,float b)
                {
                 t=a;
                 r=b;
                }
                float calci(float p);
                
                void checkp2()
                {cout<<"trying to create obj of b in non member fn of a"<<endl;
                }
                
                void checkp3();

        };
B sil;
public: void si()
            {       int t;
                    float r;
                    cout<<" enter time and rate of interest ";
                    cin>>t>>r;
                    sil.settr(t,r);
                    cout<<"simple intrest is "<<sil.calci(pr)<<endl;
            }

public: void checkp1();

};
float A::pr=20.5;

void A::setpr()
{
cout<<pr;
}

void A::checkp1()
{ 
 B obj;
obj.checkp2();
obj.checkp3();
}
 float A::B::calci(float p)
{   
return (p*t*r)/100;
     z++;
 }
void A::B::checkp3()
{
    cout<<"accessing  member fn outside enclosing class"<<endl;
}



int main()
{

 A a,b;
//cout<<a.pr;
a.pr=4.5;

//a.setpr();
//b.setpr();
a.si();
a.checkp1();


}

