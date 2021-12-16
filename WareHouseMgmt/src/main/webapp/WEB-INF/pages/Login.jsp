<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.0/font/bootstrap-icons.css">
        
</head>
<body onload="init()">

<!-- Button trigger modal -->


<!-- Modal -->
<div class="modal" id="loginModal" tabindex="-1"  aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="loginModalLabel">Login</h5>
        <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        
        <form onsubmit="validateLogin()">
          <div class="form-group">
            <label for="userName" class="col-form-label">Username:</label>
            <input type="text" class="form-control" id="userName">
          </div>
          <div class="userPassword">
            <label for="userPassword" class="col-form-label">Password:</label>
            <input type="password" class="form-control" id="userPassword">
          </div>
           <button type="submit" class="btn btn-primary">Login</button>
           <button type="button" data-bs-target="#registerModal" data-bs-toggle="modal" class="btn btn-primary">Create User</button>
        </form>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>


<div class="modal" id="registerModal" tabindex="-1"  aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="loginModalLabel">Create Warehouse User</h5>
        <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        
        <form onsubmit="validateLogin()">
          <div class="form-group">
            <label for="registerUserName" class="col-form-label">Username:</label>
            <input type="text" class="form-control" id="registerUserName">
          
          <div class="userPassword">
            <label for="registerUserPassword" class="col-form-label">Password:</label>
            <input type="password" class="form-control" id="registerUserPassword">
          </div>
          
          <div class="dropdown">
			<button class="btn btn-danger dropdown-toggle" type="button" id="dd_UserRole" data-bs-toggle="dropdown" aria-expanded="false" style="width:100px">
				User Role
			</button>
			<ul class="dropdown-menu" aria-labelledby="dd_UserRole">
			<li  id="ul_UserRoleAdmin" onclick="selectUserRole(1)">Admin</li>
			<li  id="ul_UserRoleStaff" onclick="selectUserRole(2)">Staff</li>
			</ul>
		 </div>
          
          </div>
        </form>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" onclick="createUser()">Save changes</button>
      </div>
    </div>
  </div>
</div>







<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        
        
<script src="../javascript/Login.js"></script>
</body>
</html>