package CipherSchool;

public class Answer21 {

    static node head; 

    static class node { 

        int data; 
        node next; 

        node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    /* Function to reverse the linked list */
    void reverse(node n) 
    { 
        node prev = null; 
        node current = n; 
        node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        n = prev; 
        node temp=n;
        while(temp.next!=null)
        {
        	System.out.println(temp.data);
        	temp=temp.next;
        }

    } 
    public void push(int new_data) 
    { 
    	if(head==null)
    	{
    		head=new node(new_data);
    	}
        node temp=head;
        while(temp.next!=null)
        	temp=temp.next;
        temp.next=new node(new_data);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Answer21 llist = new Answer21(); 
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);
		llist.reverse(llist.head);

	}

}