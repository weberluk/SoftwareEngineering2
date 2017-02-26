package KissExercises;

import java.util.ArrayList;
import java.util.Random;

public class ReplaceOneValue {

	public static void main(String[] args) {
		
		final int MAX = 3;
		
        // Create initial array holding three integer values from 1 to 10 inclusive.
        ArrayList<Integer> oldArray = new ArrayList<>();
        for (int i = 0; i < MAX; i++)
            oldArray.add((int) (Math.random() * 10 + 1));

        // Print the initial array, pick a random value from 0 to 2, and call the method
        printArray("                    Initial values: ", oldArray);
        int randomIndex = (int) (Math.random() * MAX);
        ArrayList<Integer> newArray = replaceOneValue(oldArray, randomIndex);

        // Print the initial array and the new array
        printArray("Initial values should be unchanged: ", oldArray);
        printArray("                        New values: ", newArray);

    }

	private static ArrayList<Integer> replaceOneValue(ArrayList<Integer> oldArray, int index) {
		
		final int MAX = 3;
		
		//get the old array
		ArrayList<Integer> newArray = new ArrayList<Integer>(MAX);
		ArrayList<Integer> finalArray = new ArrayList<Integer>(MAX);
		
		for (int i = 0; i < oldArray.size(); i++){
			newArray.add(i,oldArray.get(i));
		}
		//get a new Random Integer
		Random rand = new Random();
		int randomInt = rand.nextInt(10) +1;
		
		//Replace the old Integer, set the new one
		newArray.remove(index);
		newArray.add(index,randomInt);
		
		//check is equal, when the Integer aren't equal replace them, if they are equal replay
		if(!oldArray.equals(newArray)){
			finalArray.addAll(newArray);
		} else {
			finalArray = replaceOneValue(oldArray,index);
		}
		
		return finalArray;
	}

	private static void printArray(String msg, ArrayList<Integer> array) {
        System.out.print(msg);
        for (int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + ", ");
        System.out.println();
    }
}
		

