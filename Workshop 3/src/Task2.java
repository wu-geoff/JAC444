import java.io.*;
import java.util.*;

public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> hiddenList = new ArrayList<>(),
					  guessList = new ArrayList<>();

		for(int i = 0; i < 3; i++) {
			hiddenList.add((int) (Math.random() * 10));
		}
		
//		for (Integer h : hiddenList) {
//			System.out.print(h);
//		}
//		System.out.println();
		System.out.print("Enter a three-digit number: ");
		int guess = Integer.parseInt(br.readLine());

		String temp = Integer.toString(guess);
		for (int i = 0; i < temp.length(); i++) {
			guessList.add(Character.getNumericValue(temp.charAt(i)));
		}

		System.out.print("The lottery number is ");
		for (Integer h : hiddenList) {
			System.out.print(h);
		}
		System.out.println();

		if (hiddenList.equals(guessList)) {
			System.out.println("Exact match: you win $10,000");
			System.exit(0);
		}
		if (hiddenList.containsAll(guessList)) {
			System.out.println("All digits match: you win $3,000");
			System.exit(0);
		}

		Collections.sort(hiddenList);
		Collections.sort(guessList);
		List<Integer> list1 = Arrays.asList(hiddenList.get(0), hiddenList.get(1)),
					  list2 = Arrays.asList(hiddenList.get(0), hiddenList.get(2)),
					  list3 = Arrays.asList(hiddenList.get(1), hiddenList.get(2));
		if (guessList.containsAll(list1) ||
			guessList.containsAll(list2) ||
			guessList.containsAll(list3)) {
			System.out.println("Two digits match: you win $2,000");
		}

	}
}