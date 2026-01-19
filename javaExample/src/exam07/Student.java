package exam07;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot; // 0
	private double avg; // 0.0


//	constructor
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
//		총점과 평균을 생성자에서 한꺼번에 구해도 되지만,
//		메서드를 이용하여 구현하는 것이 좋고,
//		두 값을 한꺼번에 구하는 메서드를 만드는 것 보다
//		한 메서드에 하나의 기능만을 넣는 것이 좋다.
//		total();
//		average();
	}

//	method
	public int total() {
		tot = kor + eng + mat;
		return tot;
	}
	
	public double average() {
		avg = tot / 3.0;
		return avg;
	}

	public void display() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", name, kor, eng, mat, total(), average());
	}

//	getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}
