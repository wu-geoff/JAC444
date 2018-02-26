import java.util.ArrayList;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		System.out.println(list);
		shuffle(list);
		System.out.println(list);
	}

	public static <E> void shuffle(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			int location = (int) (Math.random() * list.size());
			E tmp = list.get(location);
			list.set(location, list.get(i));
			list.set(i, tmp);
		}
	}

}
