package cse;
class slinkedlist
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	void insert(int value)
	{
		Node newnode=new Node(value);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	void insertAtfront(int value)
	{
		Node newnode=new Node(value);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
}
public class linkedlist {
public static void main(String[] args) {
	slinkedlist sll=new slinkedlist();
	sll.insert(10);
	sll.insert(20);
	sll.insertAtfront(40);
	sll.insertAtfront(50);
	sll.display();
}
}