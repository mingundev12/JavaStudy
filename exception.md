		
//		예외처리 : 에러가 발생하였을 때, 에러 메세지가 나오면서 프로그램이 강제적으로 멈추는 것을 방지한다.
//		문제가 생겼을 때, 프로그램이 정상적으로 종료될 수 있도록 하는 것이 예외처리.
//		에러 메세지가 직접적으로 출력되었을 때의 문제점 - 사용자가 불편함을 느낌, 해킹 공격에 취약점이 될 여지가 있음

		int a = 5;
		int b = 0;
		try {
			double c = a / b;
			System.out.println("c : " + c);
		} catch (Exception e) {
			e.printStackTrace();
//			printStackTrace() 메서드는 개발할 때는 사용하고, 실제 서비스할 때에는 주석처리한다.

			System.out.println(b + "으로 나누어서 종료");
		} finally {
			System.out.println("에러..");
		}
		System.out.println("---프로그램 종료---");
