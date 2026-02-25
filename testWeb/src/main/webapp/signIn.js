// signIn.js

// click -> 아이디 입력 안되어있을 때
// click -> 아이디 입력되었으나 비밀번호 입력 안되어있을 때
// 로그인 페이지 열렸을 때(로드) 처음에 무엇을 할 거?

window.onload = function(){
    // 아이디 입력하는 input태그에 커서를 두겠다.

    let id = document.getElementById("userId");
    id.focus(); // 커서 표시

    // 로그인 버튼 클릭시 아이디 또는 비밀번호가 비어있다면
    // 입력하라고 메세지 띄워라

    let bt = document.getElementById("loginBt");
    bt.addEventListener("click", loginProcess);

}

function loginProcess() {
    // 아이디 또는 비밀번호가 비어있는지 확인하고 처리
    // 아이디와 비밀번호 input 태그 가져오기
    
    let id = document.getElementById("userId");
    let pw = document.getElementById("userPw");

    // 아이디와 비밀번호가 비어있는가? if문

    if (id.value == '') { // 아이디 입력안함
        alert("아이디를 입력하세요");
        id.focus();
    }else if (pw.value == '') {
        alert("비밀번호를 입력하세요");
        id.focus();
    } else {
        
    }
}