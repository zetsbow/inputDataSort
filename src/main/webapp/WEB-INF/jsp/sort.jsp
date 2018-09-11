<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입력값과 출력묶음단위에 대한 몫과 나머지 구하기</title>
</head>
<body>
    <form action="/" method="post">
        입력 : <textarea id="inputData" name="inputData">${inputData}</textarea> <br>
        출력묶음단위 : <input id="bindUnit" name="bindUnit" type="text"  value=${bindUnit}></input><br>
       <button type="submit">출력</button>
    </form>
	몫 : ${shareAndRest.share} <br>
	나머지 : ${shareAndRest.rest}
</body>
</html>