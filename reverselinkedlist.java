package Binary_tree;

public class reverselinkedlist {
	static Node head;
    static class Node
     {
    	 int data;
    	 Node next;
    	 Node(int d)
    	 {
    		 data=d;
    		 next=null;
    	 }
     }
     public static void insert(reverselinkedlist li,int data)
     {
    	 Node newnode=new Node(data);
    	 if(li.head==null)
    	 {
    		 li.head=newnode;
    	 }
    	 else
    	 {
    		 Node ptr=li.head;
    		 while(ptr.next!=null)
    		 {
    			 ptr=ptr.next;
    		 }
    		 ptr.next=newnode;
    	 }
    	 
     }
     public static void reverse(reverselinkedlist li)
     {
    	 Node ptr=li.head;
    	 Node prev=null;
    	 Node nextNode=null;
    	 while(ptr!=null)
    	 {
    		 nextNode=ptr.next;
    		 ptr.next=prev;
    		 prev=ptr;
    		 ptr=nextNode;
    	}
    	 li.head=prev;
     }
     public static void display(reverselinkedlist li)
     {
    	 Node current=li.head;
    	 while(current!=null)
    	 {
    		 System.out.println(current.data);
    		 current=current.next;
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         reverselinkedlist li1=new reverselinkedlist();
         li1.insert(li1,30);
         li1.insert(li1,20);
         li1.insert(li1,10);
         li1.reverse(li1);
         li1.display(li1);
	}

}
