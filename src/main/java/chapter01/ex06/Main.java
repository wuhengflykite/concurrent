package chapter01.ex06;

public class Main {

	public static void main(String[] args) {
		System.out.println("Testing EaterThread, hit CTRL+C to exit.");
		Tool spoon = new Tool("spoon");
		Tool fork = new Tool("fork");
		new EaterThread("Alice", spoon, fork).start();
		new EaterThread("Bobby", fork, spoon).start();
	}
}
