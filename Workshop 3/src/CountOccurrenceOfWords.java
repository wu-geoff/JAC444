import java.io.*;
import java.util.*;

public class CountOccurrenceOfWords {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		String line = "";
		try {
			line = br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally {
			br.close();
		}
		
		Map<String, Integer> map = new TreeMap<>();
		String[] words = line.split("[0-9 \n\t\r.,;:!?(){}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int count = map.get(key);
					count++;
					map.put(key, count);
				}
			}
		}
		// Get all entries into a set
		/*Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// Get key and value from each entry
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getValue() + "\t" + entry.getKey());
		}*/

		map.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
}
