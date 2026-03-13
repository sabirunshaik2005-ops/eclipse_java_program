package cse;
class Box<T>{
	private T value; 
	public void setValue(T value)
	
	{
		this.value=value;
	}
	public T getValue()
	{
		return value;
	}
}
public class generics {
	public static void main(String[] args) {
		Box<Integer> intBox=new Box<>();
		intBox.setValue(1000);
		 System.out.println("Integer value: " + intBox.getValue());
	     Box<String> strBox = new Box<>();
	     strBox.setValue("Hello Generics");
	     System.out.println("String value: " + strBox.getValue());
	     Box<Double> doubleBox = new Box<>();
	     doubleBox.setValue(99.99);
	     System.out.println("Double value: " + doubleBox.getValue());
	}
}
