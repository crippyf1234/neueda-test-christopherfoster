package seamammals;

import java.util.ArrayList;

public class WhaleWatcher {
	
	public static String whalesThatSwimsInAtlantic(ArrayList<Whale> variable) {
		String names = "";
		for(int i = 0 ; i < variable.size() ; i++) {
			if(variable.get(i).getMainOcean() == "Atlantic") {
				names += variable.get(i).getName();
				names += " ";
			}
			else {}
		}
		return names;
	}

	public static void main(String[] args) {
		
		Whale whale1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale whale2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale whale3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale whale4 = new Whale("Humpback", "Antarctic", 919, 13, 13);
		
		ArrayList<Whale> whaleArray = new ArrayList<Whale>();
		
		whaleArray.add(whale1);
		whaleArray.add(whale2);
		whaleArray.add(whale3);
		whaleArray.add(whale4);
		
		System.out.println(whalesThatSwimsInAtlantic(whaleArray));
	
	}

}
