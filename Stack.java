import java.util.*;
import java.util.Scanner;
import java.io.*;

class Link{
	int data;
	Link next;

	Link(int d)
	{
		data = d;
		next=null;
	}

}

class LinkList{
	Link head;
	LinkList(){
		head = null;
	}

	void Insert(int d)
	{
		Link link = new Link(d);
		link.next=head;
		head = link;
	}

	void Delete()
	{
		Link temp;
		temp = head;
		head = temp.next;
		temp=null;
	}
	void Print()
	{
		System.out.println("Your Stack is :");
		Link current = head;
		while(current != null)
		{
			System.out.println(current.data);
			current=current.next;

		}
	}
}


class Stack{
	public static void main(String args[])
	{
		LinkList list = new LinkList();
		list.Insert(2);
		list.Insert(3);
		list.Insert(4);
		list.Insert(4);
		list.Delete();
		list.Print();
	}
}