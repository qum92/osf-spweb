<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>로그인 화면</title>
    <!-- Bootstrap core CSS -->
    <link href="/resources/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/signin.css" rel="stylesheet">
  </head>
 
<script> 
		window.addEventListener('load',function(){
		document.querySelector('#signinBtn').onclick = function(){
			var idObj = document.querySelector('#id');
			var pwdObj = document.querySelector('#pwd');
			if(idObj.value.trim().length<4){
				alert('ID는 4글자 이상입니다.');
				return;
			}
			if(pwdObj.value.trim().length<6){
				alert('비밀번호는 6글자 이상입니다.');
				return;
			}
			var xhr = new XMLHttpRequest();
			xhr.open('POST','/emp/login');
			xhr.setRequestHeader('content-type','application/x-www-form-urlencoded');
			xhr.onreadystatechange = function(){
				if(xhr.readyState==4){
					var obj = JSON.parse(xhr.response);
					if(obj.result==='false'){
						alert('아이디나 비밀번호가 잘못되었습니다.');
						idObj.value='';
						pwdObj.value='';
						idObj.focus();
					}else{
						location.href="/uri/index";
					}
				}
			}
			var param = 'id=' + idObj.value + '&pwd=' + pwdObj.value;
			xhr.send(param);
		}
	})
</script>
  <body class="text-center">
    <form class="form-signin" action="/emp/login" method="POST">
      <img class="mb-4" src="/resources/bootstrap-solid.svg" alt="" width="72" height="72">
      <input type="text" id="id" class="form-control" placeholder="아이디" name="id">
      <input type="password" id="password" class="form-control" placeholder="비밀번호" name="pwd">
      <input type="text" id="name" class="form-control" placeholder="이름" name="name">
      <input type="text" id="job" class="form-control" placeholder="직책" name="job">
      <input type="text" id="mgr" class="form-control" placeholder="사원번호" name="mgr">
      <input type="date" id="hireddate" class="form-control" placeholder="입사날짜" name="hireddate">
      <input type="text" id="sal" class="form-control" placeholder="급여" name="sal">
      <input type="text" id="comm" class="form-control" placeholder="보너스" name="comm">
      <input type="text" id="lvl" class="form-control" placeholder="권한" name="level">
      <input type="text" id="deptno" class="form-control" placeholder="부서" name="deptno">
      <select name="DeptNo">
      <option value="null" selected>선택해주세요</option>
      <c:forEach items="${deptList}" var="d">
      <option value="${d.DEPTNO}">${d.DNAME}</option>
      </c:forEach>
      </select>
      <br>
      <button>사원등록</button>
    </form>
  </body>
</html>