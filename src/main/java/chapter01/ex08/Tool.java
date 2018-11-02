package chapter01.ex08;

public class Tool {

	private final String name;

	public Tool(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}

}
