#include<iostream>
#include<string.h>
using namespace std;
class clgstudent;
class csstudent;
class schlstudent
{
int age,rollno,percent;
string name;

public: schlstudent():age(5){}

private: friend void age(schlstudent,clgstudent);


public:
	void get()
	{
	cout<<"enter name :rollnumber : percentage ";
	cin>>name>>rollno>>percent;
		
	}
	
	void display()
	{
	cout<<"name "<<name<<endl<<"rollnumber "<<rollno<<endl<<"percentage "<<percent<<endl;
	}
	 
	schlstudent max(schlstudent s1,schlstudent s2)
	{
		if(percent>s1.percent && percent>s2.percent)
		{
			return *this; 
		}
		else if(s1.percent>percent && s1.percent>s2.percent)
		{
			return s1; 
		}	
		else
		return s2;
	}
};
		
	
	
class clgstudent
{
int age;
public:int usn;
public: clgstudent():age(18){}	
private: friend void age(schlstudent,clgstudent);
friend class csstudent;

};	

class csstudent
{
private:
string cc;

public:csstudent():cc("1RN20CS"){}
public:void clgcode(clgstudent c)
	{

	cout<<"USN of student is "<<cc;
	cout<<c.usn;
	}
};

void age(schlstudent s1,clgstudent s2)
{
cout<<"minimun age to join school = "<<s1.age<<endl<<"minimum age to join college = "<<s2.age;
}



	
int main()
	{
	schlstudent s,s1,s2,s3;
	clgstudent c;
	csstudent cs;
	s1.get();
	s2.get();
	s3.get();
	s=s3.max(s1,s2);
	cout<<"student with highest score is "<<endl;
	s.display();
	age(s,c);
	cout<<"enter last 3 digits of USN ";
	cin>>c.usn;
	cs.clgcode(c);
	return 0;
	}
	
