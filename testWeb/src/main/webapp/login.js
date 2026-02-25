// login.js

// id가 loginBt인 버튼태그를 클릭하면 signIn.html 이동

// 1. 태그에 이벤트 발생 시 동작할 함수 연결 : "이벤트 등록"
//      addEventListener

// id가 loginBt인 태그 가져오기 : document.getElementById()

// 페이지 로딩이 다 끝나면 실행하는 익명함수
// HTML문서의 head부분에 '표준방식' 그대로 css와 js를 불러들이는 경우에 사용한다.
window.onload = function(){
    let bt = document.getElementById("loginBt");
    //console.log(bt); // 개발자 도구의 consloe(결과화면)에 출력

    // 태그(객체)를 가져왔으면 어떤 이벤트에 대해 등록할 것인가
    // .addEventListener("이벤트명", 함수명 또는 익명함수);
    bt.addEventListener("click", 로그인페이지);
}

function 로그인페이지() {
    // signIn.html로 이동
    // console.log(location);
    location.href = "./signIn.html"
}

// 최근의 대체 형태, 그러나 HTML 구조를 완벽하게 파악하지 못할 수 있다.
// (function(){
// })
