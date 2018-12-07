package seamammals;

import java.util.ArrayList;
import java.util.Collections;

public class WhaleWatcher {
	
	 public static void whaleDetails(ArrayList<Whale> whale) {
			System.out.println("Name, Main Ocean, Weight, Max Speed, Length");
			for(int i = 0 ; i < whale.size() ; i++) {
				System.out.println(whale.get(i).getName() + " " + 
			                       whale.get(i).getMainOcean() + " " + 
						           whale.get(i).getWeight() + " " +
			                       whale.get(i).getMaxSpeed() + " " +
						           whale.get(i).getLength());
			}
	
		}
	
    public static String whalesThatSwimsInAtlantic(ArrayList<Whale> whale) {
		String names = "";
		for(int i = 0 ; i < whale.size() ; i++) {
			if(whale.get(i).getMainOcean() == "Atlantic") {
				names += whale.get(i).getName();
				names += " ";
			}
			else {}
		}
		return names;
	}
	
	public static String fastestSwimmer(ArrayList<Whale> whale) {
		
		ArrayList<Integer> speeds = new ArrayList<Integer>();
		
		for(int i = 0 ; i < whale.size() ; i++) {
		speeds.add(whale.get(i).getMaxSpeed());
		}
		
		Collections.sort(speeds);
		
		String fastestWhale = "";
		
		for(int i = 0 ; i < whale.size() ; i++) {
			if(whale.get(i).getMaxSpeed() == speeds.get(whale.size() - 1)) {
				fastestWhale += whale.get(i).getName();
			}
			else {}
		}
		
		return fastestWhale;
	}
	
	public static Double averageLength(ArrayList<Whale> whale) {
		
		Double sum = 0.0;
		Double avg = 0.0;
		
		for(int i = 0 ; i < whale.size() ; i++) {
			sum += whale.get(i).getLength();
		}
		
		return avg = sum / whale.size();
	}
	
	public static String heaviestWhales(ArrayList<Whale> whale) {
			
			ArrayList<Integer> weights = new ArrayList<Integer>();
			
			for(int i = 0 ; i < whale.size() ; i++) {
			weights.add(whale.get(i).getWeight());
			}
			
			Collections.sort(weights);
			
			String heaviestWhale = "";
			
			for(int i = 0 ; i < whale.size() ; i++) {
				if(whale.get(i).getWeight() == weights.get(whale.size() - 1)) {
					heaviestWhale += whale.get(i).getName();
					heaviestWhale += " ";
				}
				else {}
			}
			
			return heaviestWhale;
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
		
		whaleDetails(whaleArray);
		
		System.out.println(whalesThatSwimsInAtlantic(whaleArray));
		
		System.out.println(fastestSwimmer(whaleArray));
		
		System.out.println(averageLength(whaleArray));
		
		System.out.println(heaviestWhales(whaleArray));
		
		
	}

}
