package chapter01.ex08;

public class Pair {

	private final Tool lefthand;
	private final Tool righthand;

	public Pair(Tool lefthand, Tool righthand) {
		super();
		this.lefthand = lefthand;
		this.righthand = righthand;
	}

	@Override
	public String toString() {
		return "[ " + lefthand + " and " + righthand + " ]";
	}

}
