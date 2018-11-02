package chapter01.ex07;

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
