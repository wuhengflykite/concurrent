package chapter01.ex08;

public class Main {

	public static void main(String[] args) {
		System.out.println("Testing EaterThread, hit CTRL+C to exit.");
		Tool spoon = new Tool("spoon");
		Tool fork = new Tool("fork");
		Pair pair = new Pair(spoon, fork);
		new EaterThread("Alice", pair).start();
		new EaterThread("Bobby", pair).start();
	}
}
