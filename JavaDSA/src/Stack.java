
public class Stack {
	private int stack[];
	private int size;
	private int top = -1;
	
	public Stack(int size) {
		stack = new int[size];
		this.size = size;
	}
	
	public void push(int element) {
		if(top != size-1) {
			top++;
			stack[top] = element;
		}
			
		else
			System.out.println("Stack is \"full\"..... insertion is not possible");
			
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is \"empty\"....POP is not possible");
		} else {
			stack[top] =0;
			top--;
		}
	}
	public void display() {
		for(int i =top; i>=0; i--) {
			System.out.println(stack[i] + " ");
		}
	}
	
	public void reverseDisplay() {
		System.out.println("Reverse Order");
		for(int i=0; i<=top; i++) {
			System.out.println(stack[i] + " ");
		}
	}
	public int sum() {
		int sum =0;
		for(int i=top; i>=0; i--) {
			sum += stack[i];
			top--;
		}
		return sum;
	}
	
	
}	
