package chapter02.ex01;

public class PrintPersonThread extends Thread {
	
	private Person person;

	public PrintPersonThread(Person person) {
		super();
		this.person = person;
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " prints " + person);
		}
	}
}