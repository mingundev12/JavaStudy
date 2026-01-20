table에서,
행 - record row tuple
열 - column field attribute

Database = 표

    create table jusorok (
    no int not null auto_increment primary key,
    name varchar(50) not null,
    phone varchar(15) not null,
    createdDate DATETIME DEFAULT CURRENT_TIMESTAMP
    );


name varchar(50) - 가변형
name char(50) - 고정형

속도 : 고정형 > 가변형
공간절약 : 고정형 << 가변형

    TINYTEXT      255 Bytes  아주 짧은 문장(약 255자)
    TEXT             65 KB      일반적인 게시글 본문 (약 65,535자)
    MEDIUMTEXT  16 MB     긴 원고, 백과사전 내용 등
    LONGTEXT       4 GB      매우 큰 텍스트 파일, 로그 데이터 등

기본키 (primary key) : 주민번호, 학번, 사번, 군번, ...
  - 중복 X
  - null 허용 X ( = not null)
  - 하나의 테이블에 하나만 가능

unique
  - 중복 X
  - null 허용 O
  - 하나의 테이블에 여러개 가능

**

    desc/describe (table name) - table의 정보를 확인
    
    insert into tableName (fieldName, fieldName, fieldName) values (value, value, value);
    insert into values (value, value, value);
    select * from tableName
    select columnName, columnName from tableName
    select * from tableName order by columnName asc/desc;  -> 특정 column 기준으로 오름차순, 내림차순 정렬
    
    select : 조회, 검색
    insert : 삽입, 추가, 등록
    update : 수정
    delete : 삭제

    delete from tableName; = 테이블에 있는 모든 데이터를 삭제
    delete from tableName where (조건);

    DDL :   데이터 정의어 - create, alter, drop, truncate
    DML :   데이터 조작어 - select, insert, update, delete => record
    DCL :   데이터 제어어 - grant(권한 부여), revoke(권한 회수), 
    TCL : 트랜잭션 제어어 - commit, rollback, savepoint
          (물리적으로 두개의 동작을 논리적으로 하나로 묶는다.) (예시 : 송금 - 내 통장에서 인출 -> 상대 통장에 입금, 중간에 서버가 다운되면?)


## DB 설계(모델링)

* (쇼핑몰 등) 회원테이블 : member
    회원번호 no int not null auto_increment unique,
    아이디 id varchar(50) not null primary key,
    비밀번호 password varchar(50) not null,
    이름 name varchar(50) not null,
    전화번호 phone varchar(50) not null,
    등록일 createdDate datetime default current_timestamp
  
      create table member (
      no int not null auto_increment unique,
      id varchar(50) not null primary key,
      password varchar(50) not null,
      name varchar(50) not null,
      phone varchar(50) not null,
      createdDate datetime default current_timestamp
      );

      insert into member (no,       id, password,    name,           phone, createdDate)
      values             (null, 'hong',   '1234', '홍길동', '010-1111-1111', now());

      insert into member (no,       id, password,    name,           phone, createdDate)
      values             (null,  'lee',   '1234', '이성순', '010-2222-2222', now());

      insert into member (no,       id, password,    name,           phone, createdDate)
      values             (null, 'jang',   '1234', '장천용', '010-3333-3333', now());

 
## 제약조건 >> 무결성

** 데이터는 결점이 생기면 데이터로써의 가치가 훼손된다.

  1. primary key (기본키)
    2. foriegn key (참조키, 외래키)
  3. unique
  4. not null
  5. default
  6. enum ("남자", "여자")
  7. check (price >= 0)

