package h260115;

public class MainMethod {

	public static void main(String[] args) {
		
		Transaction[] transactions = {
				new Income(5000, "20260101", "수입"),
				new Expense(3000, "20260102", "지출"),
				new Transfer(-1000, "20260103", "이체"),
				new Transfer(5000, "20260104", "이체"),
		};

		for (Transaction transaction : transactions) {
			transaction.transact();
		}
		
//		System.out.println(transactions[0].printBalance());
	}

}
