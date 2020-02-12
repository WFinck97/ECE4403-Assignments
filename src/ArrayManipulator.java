import java.util.Random;

public class ArrayManipulator {
	private int[] integers;
	
	public ArrayManipulator() {
		integers = new int[10];
		
		Random randomGenerator = new Random();
		for(int i=0;i<integers.length;i++) {
			integers[i] = randomGenerator.nextInt(50);
		}
	}
	public int[] getEvenIndices() {
		int evenCount = 0;
		for(int i : integers) {
			if(i%2==0) {
				evenCount++;
			}
		}
		
		int index = 0;
		int[] evenIndeces = new int[evenCount];
		
		for (int i = 0; i<integers.length;i++) {
			if(integers[i]%2 == 0) {
				evenIndeces[index] = i;
				index++;
			}
		}
		
		return evenIndeces;
	}
	public int[] getEvenElements() {}
	public int getFirst() {}
	public int getLast() {}
	public void addFive() {}
	public void sort() {}
	public void reverse() {}
	
	public String toString() {
		return Array.toString(integers);
	}
}
