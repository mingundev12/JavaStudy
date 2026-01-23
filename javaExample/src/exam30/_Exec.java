package exam30;

public class _Exec {

	public static void main(String[] args) {
		StudentProcess studentProcess;
		try {
			studentProcess = new StudentProcess();
		} catch (Exception e) {
			System.out.println("서버 접속에 실패하였습니다. 다시 시도해 주세요.");
			return;
		}
		
		while (!studentProcess.getProgramExit()) {
			try {
				studentProcess.selectMenu();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
