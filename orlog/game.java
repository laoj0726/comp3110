import java.util.ArrayList;
import java.util.Scanner;

public class game {
	public game(player p1, player p2) {
		dice dice = new dice();
		int pick = -1;
		Scanner in = new Scanner(System.in);
		//ArrayList<card> p1Field = new ArrayList<>();
		//ArrayList<card> p2Field = new ArrayList<>();
		battleField p1Field = new battleField(p1.getName());
		battleField p2Field = new battleField(p2.getName());
		//while(p1.getHp() > 0 && p2.getHp() > 0) {
			System.out.printf("It's now %s's turn!\n",p1.getName());
			System.out.printf("%s 's hp is now :%d\n", p1.getName(),p1.getHp());
			p1.resetCards(dice.toss(6));
			//p1.setCards(dice.toss(p1.cardNumber()));
			p1.printCards();
			while(pick != 2) {
			System.out.println("action !\n1)pick card into field\n2)skip the turn");
			pick = in.nextInt();
			if(pick == 1) {
				System.out.println("which card you want to move?");
				p1Field.move(p1.useCard(in.nextInt() + 1));
				p1.printCards();
				System.out.printf("%s\n",p1Field.toString());
				}
			}
			System.out.printf("It's now %s's turn!\n",p2.getName());
		//}
	}
}
