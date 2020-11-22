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
  select { width: 150px; padding: 4px; }
  button { padding: 0.4em 2em; margin-top: 10px; }
</style>
</head>
<body>
  <div class="container">
    <form method="post">
      
      <div>
          <select name="number">
              <option value="one" ${ number == "one" ? "selected" : "" }>one</option>
              <option value="two" ${ number == "two" ? "selected" : "" }>two</option>
              <option value="three" ${ number == "three" ? "selected" : "" }>three</option>
          </select>
      </div>        

      <div>
        <input type="text" name="number2" value="${ number2 }" />
      </div>
		
      <div>
        <button type="submit">Ok</button>
      </div>
    </form>
  </div>
</body>
</html>