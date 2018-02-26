import java.io.*;
import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] nums;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 10 Integers: ");
		nums = br.readLine().split("\\s");
		for (String n : nums) {
			list.add(Integer.parseInt(n));
		}

		removeDuplicate(list);
		System.out.print("The district integers are: ");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if (!temp.contains(list.get(i))) {
				temp.add(list.get(i));
			}
		}
		list.clear();
		list.addAll(temp);
	}
}
