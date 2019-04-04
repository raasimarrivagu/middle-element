import java.util.*;

class Node {
      int data;
      Node next;
      Node(int d)
      {
               data = d;
               next = null;
      }
}
public class MiddleElement
{
    Node head;  // head of list


    public void addToTheLast(Node node) {
      if (head == null) {
        head = node;
      } else {
        Node temp = head;
        while (temp.next != null)
        temp = temp.next;
        temp.next = node;
      }
    }


    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);



			     int n = sc.nextInt();
			     MiddleElement llist = new MiddleElement();

			     int a1=sc.nextInt();
			     Node head= new Node(a1);
           llist.addToTheLast(head);
           for (int i = 1; i < n; i++) {
				       int a = sc.nextInt();
				       llist.addToTheLast(new Node(a));
			     }

        GetMiddle obj = new GetMiddle();

		System.out.println(obj.getMiddle(llist.head));




	}
}

class GetMiddle
{

    int getMiddle(Node head)
   {
         Node sptr,fptr;
         sptr=fptr=head;

         while(fptr.next!=null && fptr.next.next!=null){

             fptr=fptr.next.next;
             sptr=sptr.next;
         }
        
        return sptr.data;

   }
}
