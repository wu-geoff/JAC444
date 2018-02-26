import java.util.ArrayList;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> list = new ArrayList<Number>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		shuffle(list);
		System.out.println(list);
	}

	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int location = (int) (Math.random() * list.size());
			Number temp = list.get(location);
			list.set(location, list.get(i));
			list.set(i, temp);
		}
	}
}
