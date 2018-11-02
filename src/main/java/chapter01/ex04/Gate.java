package chapter01.ex04;

public class Gate {

	private int counter = 0;
	private String name = "Nobody";
	private String address = "Nowhere";

	public void pass(String name, String address) {
		this.counter++;
		this.name = name;
		Thread.yield();
		this.address = address;
		check();
	}

	public String toString() {
		return "No." + counter + ":" + name + "," + address;
	}

	private void check() {
		if (name.charAt(0) != address.charAt(0)) {
			System.out.println("***** BROKEN ***** " + toString());
		} else {
			System.out.println("***** PASS ***** " + toString());
		}
	}
}
