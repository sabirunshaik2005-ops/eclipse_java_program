package cse;
interface coding
{
public void languages();
public void companies();
}
class course implements coding{
	public void languages()
	{
		System.out.println("c language");
		System.out.println("java");
	}
	public void companies()
	{
		System.out.println("wipro");
		System.out.println("TCS");
	}
}
public class abstraction {
public static void main(String[] args) {
	course c=new course();
	c.languages();
	c.companies();
}
}
