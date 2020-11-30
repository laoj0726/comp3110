
public class dolls {
	private int cost;
	private int dmg;
	private String name;
	//currently we have one.
	//may
	public dolls() {
		setName("Thor");
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDmg(int damage) {
		this.dmg = damage;
	}
}
