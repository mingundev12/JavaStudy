package dao;

import java.sql.Connection;
import java.util.Scanner;

public class BookDAO {

	public static void bookMain(Connection conn, Scanner sc) {

        while (true) {
            System.out.print("선택(1.등록 2.수정 3.삭제 4.목록 5.종료)");
            String menu =sc.nextLine();
            
            if(menu.equals("1"))
        		ProjectInsert.insert(conn, sc);
            else if(menu.equals("2"))
            	ProjectUpdate.update(conn, sc);
            else if(menu.equals("3"))
            	ProjectDelete.delete(conn, sc);
            else if (menu.equals("4"))
            	BookList.list(conn);
            else if(menu.equals("5"))
            	break;
            	
		}
        
        System.out.println("도서관리 종료");
	}
}