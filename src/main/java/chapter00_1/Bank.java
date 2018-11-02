package chapter00_1;

public class Bank {
	
	private int money;
	public String getName() {
		return name;
	}

	private String name;
	
	public Bank(int money, String name) {
		super();
		this.money = money;
		this.name = name;
	}
	
	public void deposit(int m) {
		money +=m;
	}
	
	public boolean withdraw(int m) {
		if(money>m){
			money-=m;
			check();
			return true;
		} else {
			return false;
		}
	}

	private void check() {
		if(money<0){
			System.out.println("�������Ϊ������money = " + money);
		}
	}
}
