<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
  body { font-family: 굴림체; }
  div.container { width: 600px; margin: 20px auto; }
  form div { margin-bottom: 10px; }
  input { width: 200px; padding: 4px; }
  button { padding: 0.4em 3em; margin-top: 10px; }
</style>
</head>
<body>
  <div class="container">
    <form method="post">
 
      <span>
        <label>number1:</label> 
        <input type="text" name="number1" value="${ number1 }" />
      </span>

      <span>
        <button type="submit">++</button>
      </span>
    </form>
    </div>   
</body>
</html>

