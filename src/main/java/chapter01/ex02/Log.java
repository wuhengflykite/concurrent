package chapter01.ex02;

class Log {
	
	public static void println(String s) {
		System.out.println(Thread.currentThread().getName() + ": " + s);
	} 
}

