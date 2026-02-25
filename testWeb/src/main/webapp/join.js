
// script 위치가 body tag 위에 있는 경우에
// tag 를 가져와서 사용해야 한다면
// 반드시 window가 load 한다음에
// tag 가져오기를 해야한다

window.onload = function() {
    // 가입버튼 클릭시
    // 필수 정보가 모두 입력되었는지 확인
    // userPw와 userPwRe가 일치하는가 확인
    // let id = document.getElementById("userId");
    // let pw = document.getElementById("userPw");
    // let pw2 = document.getElementById("userPwRe");
    // let name = document.getElementById("name");
    // let tel = document.getElementById("tel");

    // id.addEventListener("keyup", joinCheck);
    // pw.addEventListener("keyup", joinCheck);
    // pw2.addEventListener("keyup", joinCheck);
    // name.addEventListener("keyup", joinCheck);
    // tel.addEventListener("keyup", joinCheck);
    const essential = document.getElementsByClassName("essential");

    for(var input of essential) {
        input.addEventListener("keyup", joinCheck);
    }

    // querySelector - javaScript로 tag를 가져오는 방법(동적)
//    let id = document.querySelector("input");
    // 여러 태그를 가져오려면
//    const input = this.document.querySelectorAll(".essential");
}

// for(var i in arr) 배열의 인덱스 값이 i에 들어감
// for(var data of arr) 배열의 데이터 값이 data에 들어감

// 만약에 이름을 입력하지 않았을 경우에
// 사용자에게 알려주고 싶다면
// 지금과 같은 방식은 어렵다(불가능은 아님)
// 지금의 방식은 누구를 입력안했다고 표현하는 게 아니고
// 모두 입력했냐 안했냐만 확인하기
function joinCheck() {
    let id = document.getElementById("userId");
    let pw = document.getElementById("userPw");
    let pw2 = document.getElementById("userPwRe");
    let name = document.getElementById("name");
    let tel = document.getElementById("tel");

    var count = 0;
    if(id.value != '') count++;
    if(pw.value != '') count++;
    if(pw2.value != '') count++;
    if(name.value != '') count++;
    if(tel.value != '') count++;

    if (count == 5) {
        // if(pw.value === pw2.value)
        if(pw.value != pw2.value) {
            alert("비밀번호를 다시 확인해주세요");
            pw.value = '';
            pw2.value = '';
            return;
        }
        document.getElementById("joinBt").disabled = false;
    } else {
        document.getElementById("joinBt").disabled = true;
    }
}

// js 비교연산자
// == 값만 비교를 함 ex) 10 == "10" : true
// === 값과 type까지 같은지 확인함