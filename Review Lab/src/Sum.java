
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numer = 0, denom = 0;
		for(int i = 1;i <= 97; i += 2){
			numer += i;
			denom += (i+2);
		}
		System.out.println("The result is: " + (double)numer/denom);
	}

}
