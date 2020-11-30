import java.util.ArrayList;

public class battleField {
	private ArrayList<card> fields = new ArrayList<>();
	private int meleeAtk, meleeDef, rangeAtk,rangeDef,thief = 0;
	private String name;
	public battleField(String name) {
		this.name = name;
	}
	public void move(card c) {
		fields.add(c);
		switch(c.getId()) {
		case 0:
			meleeAtk++;
			break;
		case 1:
			meleeDef++;
			break;
		case 2:
			rangeAtk++;
			break;
		case 3:
			rangeDef++;
			break;
		case 4:
			thief++;
			break;
		}
	}
	public String toString() {
		String str = name + "\n";
		for(int i = 0; i < fields.size(); i++)
			str += fields.get(i).getAttribute();
		return str;
	}
}
