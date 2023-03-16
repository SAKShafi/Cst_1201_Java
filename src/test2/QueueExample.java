package test2;
import java.util.LinkedList;
import java.util.Queue;


public class QueueExample {
	
	public static void main(String[] args)
	{ 

	   Queue<Integer> q = new LinkedList<>();
	// Adds elements {0, 1, 2, 3, 4} to queue
	    for (int i=10; i<50; i+=3 )
	    q.add(i * i );
	    for (int i= 0; i<10; i++)
	    q. remove();
	    //To view the head of queue
	    int head = q.peek();
	    int size = q.size();

	    int magicNumber = size + head;
	  
	    System.out.println(magicNumber);
	  }
}



