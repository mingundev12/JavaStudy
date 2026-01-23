## 학사관리 - 학생관리, 출결관리, 성적관리, 시험관리, 생활기록관리

1. 학생관리
		
	table / class : student / Student
		학번 : id_number / idNumber
		이름 : name / name
		주민번호 : ssn / ssn
		전화번호 : phone / phone
		주소 : address / address
		등록일 : created_date / createdDate
	-> create table student (
		id_number int not null auto_increment primary key,
		name varchar(50) not null,
		ssn varchar(15) not null unique,
		phone varchar(15) not null,
		address varchar(250) not null,
		created_date DATETIME DEFAULT CURRENT_TIMESTAMP
		);
	-> desc student;
	-> select * from student;












## 기본키(primary key)관련

		기본키 - 기본키
		후보키 - 기본키로 사용이 가능한 후보들
		대체키 - 후보키중 기본키를 대체하는 키
		수퍼키 - 두 개의 필드를 묶어서 하나로 썼을 때 기본키의 역할을 수행할 수 있는 것
		
