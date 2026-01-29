package main;

import java.util.Scanner;

import loans.LoanDAO;
import members.MemberDTO;

public class MainMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberDTO member = new MemberDTO();
		LoanDAO dao = new LoanDAO(sc, member);
		
		dao.selectMenu();

	}

}
