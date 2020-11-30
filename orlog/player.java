import java.util.ArrayList;

public class player {
	private String name;
	private int hp;
	//private card[] cards = new card[5];
	private ArrayList<card> cards = new ArrayList<>();
	private dolls doll;
	private int token;
	public player(String name) {
		setName(name);
		setHp(15);
		setToken(0);
	}
	public card useCard(int i) {
		return cards.remove(i);
	}
	public int cardNumber() {
		return cards.size();
	}
	public void printCards() {
		for(int i = 0; i < cards.size(); i++)
			System.out.printf("%s ",cards.get(i).getAttribute());
		System.out.println();
	}
	public void resetCards(ArrayList<Integer> result) {
		for(int i = 0; i < 6; i++)
			cards.add(new card(result.get(i)));
	}
	public void setCards(ArrayList<Integer> value) {
		for(int i = 0; i < cards.size(); i++)
			cards.get(i).setCard(value.get(i));;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setToken(int tok) {
		this.token = tok;
	}
	public String getName() {
		return this.name;
	}
	private void setName(String name) {
		this.name = name;
	}
}
