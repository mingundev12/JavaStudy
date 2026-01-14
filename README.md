## JavaStudy


https://github.com/masterJKR/hallabong_java


https://classroom.google.com/c/NzkyOTg5NDA2NTI5


## github 와 eclipse 연동하기 / project 업로드 다운로드하기

github와 eclipse연동하기
   
    java eclipse에서
    open perspective 클릭 -> git 선택
    clone a git repository 선택
    불러올 repository의 url입력, github 계정과 비밀번호(Token) 입력
    로컬 경로에 repository와 같은 이름의 folder 생성하고 경로설정
    
    eclipse 재실행하고 import하여 project 불러오기


project와 library 연결

    project를 import했을 때 library 설정이 되어있지 않아 오류가 발생하는 경우
    project를 우클릭하여 property - library에서 로컬 library를 연결하여 불러온다


project를 github에 업로드

    project를 업로드하기 위해서는 repository와 연동된 project를 최신화한 상태에서 수정해야 한다.
    *.java 우클릭 - team - Add to Index 를 하면 업로드 설정을 할 수 있다.
    *.java 우클릭 - team - commit을 하면 업로드 할 파일을 선택할 수 있다.
      파일을 선택한 후, Commit Message란에 내용(주로 수정사항에 대한 메모)을 반드시 작성하여야만 Commit and push로
      repository에 업로드할 수 있다.


## DB 연결

mySQL 다운로드

      google 에서 mysql 검색
      mysql - community - 8.0.39.0.msi 다운로드 및 설치
      mysql connector / j  - 8.4.0.zip 다운로드, 압축해제
      port 3306 : port는 기본값
      root / 123456 : pass는 임의저장

project와 DB를 연결하기

      project - properties 선택
      JAVA Build Path - Libraries - Classpath 선택
      Add External JARs - connector.jar 선택하고 Apply and Close

DB 만들기

      https://github.com/masterJKR/hallabong_java/blob/main/%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4%20%EC%82%AC%EC%9A%A9%EB%B2%951
      DB계정 ┬ 생성
             └ DB
                └ table
                   └ data
                
      MYSQL 8.0 Command Line Client 실행, 설치할 때 설정해둔 비밀번호 입력
         계정 생성
            - create user 계정명 identified by '비밀번호';
            - Query OK 가 나오면 제대로 입력된 것.
            - ';' 세미콜론 입력하지 않으면 명령어가 끝나지 않는다.
         DB 생성
            - create database DB명;
            - DB명 : 일반적으로 계정이름과 똑같이 설정한다.
         권한설정
            - grant all privileges on DB명.* to '계정명';
            - DB.* : DB 내에 있는 모든 table 이라는 뜻
         table 생성 
            - 사용하고자 하는 DB를 지정
            - use DB명;    ->   Database changed
            - create table table명( id int auto_increment primary key,
                           column명 type, column type, ...);
            - JAVA Class 의 인스턴스 변수 종류 = table 의 column 종류
            - 각각의 레코드를 구분할 수 있도록 기본키를 설정하여야 한다 : id int auto_increment primary key
                                                                     자동증가하는 정수형태의 기본 키
            - JAVA 에서 camel 표기법으로 만들었던 변수명을 DB 에서는 snake 표기법으로 바꾸어준다
            - String -> varchar(N) : N은 최대 255자까지, 문자열을 사용할 공간만큼 적절히 숫자를 설정하되,
                                     가급적이면 2의 배수이며 실사용할 자릿수보다는 넉넉하게 설정하면 된다
                                     영어와 숫자는 1의 공간을 차지, 한글 및 특수문자는 2의 공간을 차지
         data 입력
            - insert into table명 ( 저장할column명, ... , ... , ...)
              values( 값, 값, 값, 값)
            - 자동증가하는 기본 키는 별도로 저장할 필요가 없다.
            - '문자열' , 숫자 로 입력
         data 출력
            - select * from table명
         data 삭제
            - delete
         data 수정
            - update
            
DBeaver 와 같은 tool을 이용하여 직접 query 명령문을 작성하는 것보다 간편하게 DB를 관리할 수 있다.

      https://dbeaver.io/download/
      새 데이터베이스 연결 - mySQL - DB명, 사용자명, 비밀번호 입력 - test connect 해서 연결확인하고 확인누르기

스프레드시트를 이용하여 DB table 내 데이터를 만드는 방법

      table 의 column명 을 1열에 차례대로 적어넣기
      삽입할 데이터를 작성
      다른 이름으로 저장 - *.csv 확장자(쉼표로 구분된 값 이라는 뜻)를 선택하여 저장
      (데이터에 한글이 있는 경우) - notepad로 해당파일을 열기 - 다른 이름으로 저장 - 인코딩을 UTF-8로 변경하여 저장
      
