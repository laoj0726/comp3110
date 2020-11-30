import java.util.ArrayList;
import java.util.Random;

public class dice {
	Random rand = new Random();
	//who goes first?
	public int begin() {
		return rand.nextInt(2);
	}
	//toss to decide what cards player have
	public ArrayList<Integer> toss(int num) {
		ArrayList<Integer> results = new ArrayList<>();
		for(int i = 0; i < num; i++)
			results.add(rand.nextInt(5));
		return results;
	}
}
