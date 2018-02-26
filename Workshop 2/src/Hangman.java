import java.io.*;
import java.util.Scanner;

public class Hangman {

	private static boolean isCorrect;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("hangman.txt"));
		String line = "";
		try {
			line = br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally {
			br.close();
		}
		String[] words = line.split(" ");

		main: for (int i = 0; i < words.length; i++) {
			Scanner sc = new Scanner(System.in);
			char choice = 'y';
			do {
				String word = words[i], hidden = createHiddenWord(words[i]);
				int miss = 0;
				while (!word.equals(hidden)) {
					System.out.print("(Guess) Enter a letter in word " + hidden + " > ");
					char ch = sc.next().charAt(0);
					if (!hidden.contains(Character.toString(ch))) {
						hidden = guess(word, hidden, ch);
						if (!isCorrect) {
							System.out.println("\t" + ch + " is not in the word");
							miss++;
						}
					} else {
						System.out.println("\t" + ch + " is already in the word");
					}
				}
				System.out.println("The word is program. You missed " + miss + " time");
				System.out.print("Do you want to guess another word? Enter y or n >");
				choice = sc.next().charAt(0);
				if (choice == 'y') {
					continue main;
				} else if (choice == 'n') {
					break main;
				}
			}while (choice == 'y');
			sc.close();
		}
	}

	public static String createHiddenWord(String word) {
		String hidden = "";
		for (int i = 0; i < word.length(); i++) {
			hidden += "*";
		}
		return hidden;
	}

	public static String guess(String word, String hidden, char ch) {
		isCorrect = false;
		StringBuilder sb = new StringBuilder(hidden);
		for (int i = 0; i < word.length(); i++) {
			if (ch == word.charAt(i) && sb.charAt(i) == '*') {
				isCorrect = true;
				sb = sb.deleteCharAt(i);
				sb = sb.insert(i, ch);
			}
		}
		return sb.toString();
	}
}