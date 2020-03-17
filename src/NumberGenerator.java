import java.util.ArrayList;
import java.util.Random;

public class NumberGenerator {
	
	public static ArrayList<Integer> generateUniqueNumbers(int countNum, int maxVal){
		ArrayList<Integer> numberSet = new ArrayList<Integer>(countNum);
		Random randNum = new Random();
		int i = 0, uniqueNum;
		while(i < countNum) {
			
			uniqueNum = randNum.nextInt(maxVal) + 1;
			
			if(!numberSet.contains(uniqueNum)) {
				i++;
				numberSet.add(uniqueNum);
			}
		}
		
		return numberSet;
	}
}
