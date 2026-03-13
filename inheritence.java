package cse;
class Person
{
	String a;
	String r;
	Person()
	{
 a="aits";
	r="rajampet";
	}
	void displayPerson()
	{
		System.out.println("clg name:"+a);
		System.out.println("address:"+r);
	}
}
class Student extends Person
{
	int roll;
	double per;
	Student()
	{
		roll=2380;
		per=85.90;
	}
	void displayStudent()
	{
		displayPerson();
		System.out.println("roll:"+roll);
		System.out.println("percentage:"+per);
	}
}

public class inheritence {
public static void main(String[] args) {
	Student s=new Student();
	s.displayStudent();
}
}
