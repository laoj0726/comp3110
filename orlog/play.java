import java.util.Scanner;

public class play {

	public static void main(String[] args) {
		System.out.println("welcome to the Orlog game !(no copyright from ubisoft)");
		System.out.println("player 1, please input your name!");
		Scanner in = new Scanner(System.in);
		player p1 = new player(in.nextLine());
		System.out.println("player 2, please input your name!");
		player p2 = new player(in.nextLine());
		dice roll = new dice();
		if(roll.begin() == 1) 
		    new game(p1,p2);
		else
			new game(p2,p1);
	}
}
