package Recursion;

import java.util.ArrayList;

public class GenericsStack2<E> extends ArrayList<E> {
	//private java.util.ArrayList <E> list = new java.util.ArrayList<>();
     E[] list = (E[])new Object[3];
    int broqch = 0;
	public GenericsStack2() {
		
	}
	
	public int getSize() {
		return broqch;
	}

	public E peek() {
		return list[broqch-1];
	}

	public void push(E o) {
		if(broqch>=list.length) {newArray();}
		list[broqch] = o;
		broqch ++;
	}
	
    void newArray() {
	   E[] doubleList = (E[])new Object[list.length*2]; 
	   System.arraycopy(list, 0, doubleList, 0, list.length);
	   list = doubleList;
   }
   
   
	public E pop() {
		E o = list[broqch-1];
		broqch--;
		return o;
	}

	public boolean isEmpty() {
		return broqch ==0;
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
