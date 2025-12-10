
public class Queue {
	private int q[];
	private int rear = -1;
	private int front = -1;
	
	public Queue(int size) {
		q = new int[size];
	}
	
	public void insert(int element) {
		if(rear !=q.length-1) {
			rear++;
			q[rear] = element;
		} else {
			System.out.println("Insert is not posiible queue is full");
		}
			
	}
	public void delete() {
		if(rear == -1 || front == q.length-1) {
			System.out.println("Deletion is not possible as queue is empty");
		} else {
			front++;
			q[front] =0;
		}
	}
	public void display() {
		if(rear == -1 || front == q.length-1) {
			System.out.println("Display is not possible as queue is empty");
		} else {
			for(int i=front+1; i<=rear; i++) {
				System.out.println(q[i] + " ");
			}
			System.out.println();
		}
	}
}
