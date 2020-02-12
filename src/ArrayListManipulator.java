import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class ArrayListManipulator {
	private ArrayList<Integer> integers;
	
	Random randomGenerator = new Random();
	
	public ArrayListManipulator() {
		integers = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			integers.add(randomGenerator.nextInt(50));
		}
	}
	public ArrayList<Integer> getEvenIndeces(){
		ArrayList<Integer> evenIndices = new ArrayList<Integer>();
		for(int i=0;i<integers.size();i++) {
			if(integers.get(i) % 2 == 0) {
				evenIndices.add(i);
			}
		}
		return evenIndices;
	}
	public ArrayList<Integer> getEvenElements(){
		ArrayList<Integer> evenElements = new ArrayList<Integer>();
		for(int i : integers) {
			if(i % 2 == 0) {
				evenElements.add(i);
			}
		}
		return evenElements;
	}
	public int getFirst() {}
	public int getLast() {}
	public void addFive() {
		for(int i = 0; i < integers.size();i++) {
			integers.set(i, integers.get(i)+5);
		}
	}
	public void sort() {
		Collections.sort(integers);
	}
	public void reverse() {
		Collections.reverse(integers);
	}
	public String toStrinf() {
		return integers.toString();
	}
}
