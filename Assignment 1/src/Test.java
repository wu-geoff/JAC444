
import java.util.*;

public class Test {

	public static void main(String[] args) {
		String[] members = {"", "Silver", "Gold", "Premium"};
		
		Visit[] testArr = new Visit[10];
		for(int i = 0; i < testArr.length; i++){
			testArr[i] = new Visit(Integer.toString(i), new Date());
			testArr[i].setMemberType(members[new Random().nextInt(members.length) + 0]);
			testArr[i].setServiceExpense(100 + (1000-100) * new Random().nextDouble());
			testArr[i].setProductExpense(100 + (1000-100) * new Random().nextDouble());
			System.out.println(testArr[i].toString()+"\n");
		}
	}
}
