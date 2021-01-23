package StackExc03.G1;

public interface Stackable<T> {
	void push(T data);
	T peek();
	T pop();
	boolean isEmpty();
	int size();
	void print();
	void clear();
}

