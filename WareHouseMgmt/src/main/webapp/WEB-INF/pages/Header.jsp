<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>

</style>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1">WareHouse Management  System</span>
			<!--we can add logo in img-->
			<img class="d-inline-block align-top" src="" width="" height="">
			<!--ITS A MENU BUTTON AND WHEN A SCREEN REDUCES TO SMALL OR MOBILE SIZE(BREAK POINT) ALL THE ITEMS ARE AUTOMATICAALY LISTED UNDER THE MENU-->
			<button type="button" data-bs-toggle="collapse"
				data-bs-target="#navigationbar" class="navbar-toggler">
				MENU</button>
			<!--ITEMS OF NAVIGATION BAR-->
			<div class="collapse navbar-collapse" id="navigationbar">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item "><a href="addProduct" class="nav-link active">Add Product</a></li>
					<li class="nav-item "><a href="Orders" class="nav-link active">Orders</a></li>
					<li class="nav-item "><a href="storage" class="nav-link active">Storage</a></li>
					<li class="nav-item"><a href="dashboard" class="nav-link active">Dashboard</a></li>
					<li class="nav-item"><a href="contactUS" class="nav-link active">Contact US</a></li>
					<li class="nav-item nav-link active" onclick="logout()">Logout</li>
				</ul>
			</div>
			</div>
	</nav>
<script type="text/javascript">

function logout(){
	sessionStorage.removeItem('userData');
	window.location.href = `/`;
}

</script>
</body>
</html>