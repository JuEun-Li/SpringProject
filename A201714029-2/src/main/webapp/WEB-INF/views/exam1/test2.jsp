<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
  div.container { width: 400px; margin: 20px auto; }
  div.radio label { margin-right: 20px; }
  input {  }
  select { width: 50px; padding: 4px; }
  button { padding: 0.4em 2em; margin-top: 10px; }
  table { width: 300px; border-collapse: collapse; }
  thead tr { background-color: #eee; }
  td, th { border: 1px solid #aaa; padding: 5px; }
</style>
</head>
<body>
<div class="container">

  <form method="post">

    <div class="radio">
      <label><input type="radio" name="color" value="yellow" ${ radio2 == "yellow" ? "checked" : "" } /> yellow</label>
      <label><input type="radio" name="color" value="green" ${ radio2 == "green" ? "checked" : "" } /> green</label>
      <label><input type="radio" name="color" value="red" ${ radio2 == "red" ? "checked" : "" } /> red</label>
    </div>
    <div>
      <button type="submit">확인</button>
    </div>
    <br>
    <div>
    color: ${ color }
    </div>
    
  </form>
</div>
</body>
</html>

