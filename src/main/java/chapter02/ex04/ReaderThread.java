package chapter02.ex04;

import java.util.Iterator;
import java.util.List;

public class ReaderThread extends Thread {

	private final List<Integer> list;

	public ReaderThread(List<Integer> list) {
		super("ReaderThread");
		this.list = list;
	}

	@Override
	public void run() {
		while (true) {
/*			for (int n : list) {
				System.out.println(n);
			}*/
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				int n = it.next();
				System.out.println(n);
			}
		}
	}

}