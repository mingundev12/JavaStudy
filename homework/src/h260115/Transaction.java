package h260115;

public abstract class Transaction {
	
	private static int balance = 0;
	private int amount; // 금액
	private String date; // 날짜
	private String memo; // 메모
	
	public Transaction () {
		this.amount = 0;
		this.date = "";
		this.memo = "";
	}
	
	public Transaction (int amount, String date, String memo) {
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}
	
	public abstract void transact();
	
	public int getAmount() {
		return amount;
	}

	public String getDate() {
		return date;
	}

	public String getMemo() {
		return memo;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int amount) {
		balance = balance + amount;
	}

	public String printBalance() {
		return "잔액 [balance=" + getBalance() + "]";
	}
	
	
}
