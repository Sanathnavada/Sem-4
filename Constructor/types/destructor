#include <iostream>
#include<string.h>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

class student
{
private:
    char name[20];
    int age;
public:    static int n;
public:
    student()
    {
        strcpy(name,"sanath");
        age =20;
        
    }
    student(char n[],int a)
    {
          strcpy(name,n);
        age =a;
          

    }

void getdata()
{   
    cout<<"enter name and age ";
    cin>>name>>age;
    
    
}    
    void display()
{
    cout<<"name: "<<name<<endl<<"age: "<<age<<endl;
}

student convert(student s)
{
    cout<<"changing "<<name<<" and "<<age<<" to "<<endl;
    strcpy(s.name,"rishab");
    s.age=18;
    
    return s;
}

student(student &s)
{
    strcpy(name,s.name);
    age=s.age;
}

~student()
{ 
   cout<<"destroying an instance of a object that was created "<<endl;
   n++;
}
};

int student::n=0;


int main()
{
student s1,s2("john",19),s3;
s3.getdata();
cout<<"default constructor"<<endl;
s1.display();
cout<<"parameterized constructor"<<endl;
s2.display();
cout<<"user input "<<endl;
s3.display();
cout<<"user input converted to new data using copy constructor(2nd and 3rd instance) "<<endl;
s3=s3.convert(s3);
s3.display();
cout<<"direct copying of 1 cnstr to another( implict) (1st instance) "<<endl;
student s4(s1);
s4.display();
cout<<"1st instance of copy constructor using explict constructor"<<endl;
student s5(s1);
s5.display();


    return 0;
}
