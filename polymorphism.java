package cse;
class Calculator
{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class polymorphism {
public static void main(String[] args) {
	Calculator cal=new Calculator();
	System.out.println("addition of 2 numbers:"+cal.add(4, 2));
	System.out.println("addition of 3 numbers:"+cal.add(4,7,3));

}
}
