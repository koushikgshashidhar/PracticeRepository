import java.util.*;
class Node
{
	protected int num;
	Node next;

	Node()
	{
		num=0;
		next=null;
	}
	Node(int g)
	{
		num=g;
	}
	
}
public class ListHalve {
	
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the list:");
		int len=s.nextInt();
		System.out.println("Enter the Values:");
	     Node head=new Node();
	     Node n,r;
	
		for(int i=0;i<len;i++)
		{
			     
			n=new Node(s.nextInt());  
			  
			   	 
			     if(head==null)head=n;
			     else {
			     r=head;
			     System.out.println(r.num);
			     if(r.next!=null)r=r.next;
			     r.next=n;
			     }
			     
			     
			
			     
		}
		/*int h=len/2;
		for(int i=0;i<=h;i++)
		{
			System.out.println(head.num);
			head=head.next;
		}

		System.out.println(head.num);
		
		*/
        s.close();
		
		
	}
}
