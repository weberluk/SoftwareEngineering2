package KissExercises;

import java.util.Random;

public class CalcualteScore {

	public static void main(String[] args) {

		final int NUMOFOBJECTES = 6;
		Random rand = new Random();

		int[] objects = new int[NUMOFOBJECTES];

		for (int i = 0; i < objects.length; i++) {
			objects[i] = rand.nextInt(3) + 1;
		}

		int score = calcScore(objects);

		System.out.print("Objects: ");
		for (int i = 0; i < NUMOFOBJECTES; i++)
			System.out.print(objects[i] + " ");
		System.out.println("     Score: " + score);

	}

	private static int calcScore(int[] objects) {
		final int COUNTERS = 3;

		int[] counters = new int[COUNTERS];
		
		int j = 0;
		for (int i = 1; i <= counters.length; i++) {
			counters[j] = countNums(objects, i);
			j++;
		}

		int score1 = 0;
		int score2 = 0;
		int score3 = 0;

			if (counters[0] >= 3) {
				score1 = counters[0] - 2;
			}
			if (counters[1] >= 3) {
				score2 = counters[1] - 1;
			}
			if (counters[2] >= 3) {
				score3 = counters[2];
			}

		return score1 + score2 + score3;
	}

	private static int countNums(int[] objects, int searchNum) {
		int counter = 0;
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == searchNum) {
				counter++;
			}
		}
		return counter;
	}

}
