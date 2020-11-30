
import java.util.Formatter;
import java.util.Scanner;

public class board {

	Scanner input = new Scanner(System.in);
	private static Formatter file;
	String nameList[];
	int scoreList[];
	String prefixName;
	int score, count;
	
	public boolean isGameEnd(boolean lostLastLife) {
		if(lostLastLife == true) 
			return true;		
		else 
			return lostLastLife;
	}
	
	public boolean openFile() {
		try {
			file = new Formatter("Leaderboard.txt");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		return true;
	}
	
	public String setUserRecord(int score) {
		
		System.out.println("Enter Three Character: ");
		prefixName = input.nextLine();
		return prefixName + " scored: " + score +"!";
	}
	
	public int getScore() {
		return score;	
	}
	
	public boolean sortList(int scoreList[]) {
		int temp, a, b;
		int size = scoreList.length;
		for(a=1; a < size; a++)
		    for(b=size-1; b >= a; b--){
		        if(scoreList[b-1] > scoreList[b]){ 
		           temp = scoreList[b-1];
		           scoreList[b-1] = scoreList[b];
		           scoreList[b] = temp;
		          }
		   }
		return true;
		
	}
	
	public boolean wirteRecord() {
		
		file.format("%s%s%s", prefixName, score);
		
		return true;
	}
	

	
	public void closeFill() {
		file.close(); 
	}
	
	public static void main(String[] args) {


		
	}

}
