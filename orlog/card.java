
public class card {
	//different card has different ability and counter
	//sword will be countered by armor
	//arrow will be countered by shield
	//steal will steal 1 token (used to charge to use doll)
	//id is use for melee attack&def, range attack&def calculation
	private int id;
	private String attribute;
	public card(int num) {
		setCard(num);
	}
	public void setCard(int num) {
		switch(num) {
		case 0:
			setId(num);
			setAttribute("Sword");
			break;
		case 1:
			setId(num);
			setAttribute("Armor");
			break;
		case 2:
			setId(num);
			setAttribute("Arrow");
			break;
		case 3:
			setId(num);
			setAttribute("Shield");
			break;
		case 4:
			setId(num);
			setAttribute("steal");
		}
	}
	public String getAttribute() {
		return attribute;
	}
	private void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
}
