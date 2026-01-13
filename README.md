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

project와 DB를 연결하기

      project - properties 선택
      JAVA Build Path - Libraries - Classpath 선택
      Add External JARs - connector.jar 선택하고 Apply and Close

DB 만들기

      DB계정 ┬ 생성
             └ DB
                └ table
