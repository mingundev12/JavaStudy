package dto;

import java.sql.Date;

public class LoanDTO {
	private int id;
	private int bookId;
	private int memberId;
	private int isLoan;
	private Date loanDate;
	
	public LoanDTO() {
	}

	public LoanDTO(int id, int bookId, int memberId, int isLoan, Date loanDate) {
		this.id = id;
		this.bookId = bookId;
		this.memberId = memberId;
		this.isLoan = isLoan;
		this.loanDate = loanDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getIsLoan() {
		return isLoan;
	}

	public void setIsLoan(int isLoan) {
		this.isLoan = isLoan;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	@Override
	public String toString() {
		return "LoanDTO [id=" + id + ", bookId=" + bookId + ", memberId=" + memberId + ", isLoan=" + isLoan
				+ ", loanDate=" + loanDate + "]";
	}

}
