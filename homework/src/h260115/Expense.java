package h260115;

public class Expense extends Transaction{

	public Expense(int amount, String date, String memo) {
		super.setAmount(amount);
		super.setDate(date);
		super.setMemo(memo);
	}

	@Override
	public void transact() {
		System.out.println(this);
		
		super.setBalance(this.getAmount() * -1);

		System.out.println(printBalance());
	}

	@Override
	public String toString() {
		return "Expense [amount()=" + getAmount() + ", date()=" + getDate() + ", memo()=" + getMemo() + "]";
	}

}
