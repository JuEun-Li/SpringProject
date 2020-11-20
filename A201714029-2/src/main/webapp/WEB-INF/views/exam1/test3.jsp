<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
  div.container { width: 400px; margin: 20px auto; }
  form div { margin-bottom: 10px; }
  label { display: inline-block; width: 70px; text-align: right; }
  input { width: 150px; padding: 4px; }
  select { width: 50px; padding: 4px; }
  button { padding: 0.4em 2em; margin-top: 10px; }
</style>
</head>
<body>
  <div class="container">
    <form method="post">

      <span>
        <input type="text" name="number1" value="${0 + number1 }"/>
      </span>
      <span>
        <input type="text" name="number2" value="${0 + number2 }" />
      </span>
      
       <div>
        <button type="submit">더하기</button>
      </div>
      
      <div>
         <input type="text" name="number3" value="${0 + number3 }" />
      </div>      
     
    </form>
  </div>
</body>
</html>

