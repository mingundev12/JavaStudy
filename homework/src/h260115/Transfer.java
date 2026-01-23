package h260115;

public class Transfer extends Transaction{

	public Transfer(int amount, String date, String memo) {
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
		return "Transfer [amount()=" + getAmount() + ", date()=" + getDate() + ", memo()=" + getMemo() + "]";
	}

}
