package StackExc03.G1;

public class Stack<T> implements Stackable<T> {

	private Node head = null;
	private int counter = 0;

	private class Node {
    	T data = null;
    	Node next = null;
    }

	@Override
	public void push(T data) {

/*
		Stackable<Student> stack = new Stack<Student>();
		Student s1 = new Student();
		stack.push(s1);

 */


		Node memorizedHead = head;
		head = new Node();
		head.data = data;
		head.next = memorizedHead;
		counter++;

		/*String vorname = " ";
		String nachname = " ";
		String matrikelnummer = " ";
		int coursenumber = 0;
		int matrikelnummer1 = 0;


		System.out.println("Please enter prename:");
		String vorname1 = Console.readStringFromStdIn(vorname);

		System.out.println("Please enter surname:");
		String nachname1 = Console.readStringFromStdIn(nachname);

		System.out.println("Please enter course number:");
		int coursenumber1 = Console.readIntegerFromStdIn(String.valueOf(coursenumber));


		System.out.println("Please enter matriculation number:");
		matrikelnummer1 = Integer.parseInt(Console.readStringFromStdIn(matrikelnummer));
		//String matrikelnummer2 = Integer.toString(matrikelnummer1);

		 */


		/*Student s1 = new Student("Ted", "Mosby", 1, 1);
		Student s2 = new Student("Donald", "Duck", 66, 55);
		Student s3 = new Student("Sheldon", "Cooper", 65, 43);


		stack.push(s1);
		stack.push(s2);
		stack.push(s3);

		Stack<T> student = new Stack<T>();
		student.push((T) vorname);
		student.push((T)nachname);
		student.push((T)coursenumber);
		student.push((T)matrikelnummer);

        Object student =(vorname1 + nachname1 + coursenumber1 + matrikelnummer2);

		Stack<T> stack = new Stack<>();
		stack.push((T) student);

		 */


	}

	@Override
	public T peek() { //returns first object on stack
		return ((head == null) ? null : head.data);
		//System.out.println((head == null) ? null : head.data);
		//return (T) head;
	}

	@Override
	public T pop() {
		if (head == null) {
			return null;
		}
		T retObj = head.data;
		head = head.next;
		counter--;
		return retObj;
	}

	@Override
	public boolean isEmpty() {
		anzeige();
		return head == null;
	}

	@Override
	public int size() {
		anzeige();
		//return counter;

		int counter = 0;
		Node temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}	
		return counter;

	}

	@Override
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		anzeige();


	}

	@Override
	public void clear() {
		head = null;
		System.out.println("Stack has been cleared");
	}

	public void anzeige() {
		if(counter == 0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("There are " + counter + "Elements on the stack.");
		}
	}

}
