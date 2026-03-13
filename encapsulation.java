package cse;
class bank
{
	private int bal=100;
	public int ac_no=2386494;
	public void setBal(int ba)
	{
		this.bal=ba;
	}
	public int getBal()
	{
		return bal;
	}
}
public class encapsulation {
public static void main(String[] args) {
	bank b=new bank();
	System.out.println("bal:"+b.getBal());
	System.out.println("account no:"+b.ac_no);
}
}
