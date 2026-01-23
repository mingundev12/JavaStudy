package h260115;

public class Income extends Transaction{

	public Income(int amount, String date, String memo) {
		super.setAmount(amount);
		super.setDate(date);
		super.setMemo(memo);
	}

	@Override
	public void transact() {
		System.out.println(this);
		
		super.setBalance(this.getAmount());
		
		System.out.println(printBalance());
	}

	@Override
	public String toString() {
		return "Income [amount()=" + getAmount() + ", date()=" + getDate() + ", memo()=" + getMemo() + "]";
	}
}
