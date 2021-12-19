<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css" href="../css/DashboardStyle.css" rel="stylesheet" />

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<link rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.6.2/chart.min.js"></script>

<title>Dashboard Page</title>
</head>

<script type="text/javascript">
//Getting values from model Attribute of java and rendering on extetrnal JS Page 
var xAxisVal = ${xAxis};
var yAxisVal = ${yAxis};
var shipmentJSONData = ${shipmentData};
</script>


<body onload="initialize(xAxisVal,yAxisVal)">

	<!--navigation bar-->
	<!-- <nav class="navbar navbar-expand-sm navbar-light bg-light">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1">WareHouse Management  System</span>
			we can add logo in img
			<img class="d-inline-block align-top" src="" width="" height="">
			ITS A MENU BUTTON AND WHEN A SCREEN REDUCES TO SMALL OR MOBILE SIZE(BREAK POINT) ALL THE ITEMS ARE AUTOMATICAALY LISTED UNDER THE MENU
			<button type="button" data-bs-toggle="collapse"
				data-bs-target="#navigationbar" class="navbar-toggler">
				MENU</button>
			ITEMS OF NAVIGATION BAR
			<div class="collapse navbar-collapse" id="navigationbar">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item "><a href="" class="nav-link active">Item
							1</a></li>
					<li class="nav-item "><a href="" class="nav-link active">item
							2</a></li>
					<li class="nav-item "><a href="" class="nav-link active">item
							3</a></li>
					<li class="nav-item"><a href="" class="nav-link active">item
							4</a></li>
					<li class="nav-item"><a href="" class="nav-link active">item
							5</a></li>
					<li class="nav-item"><a href="" class="nav-link">Logout</a></li>
				</ul>
			</div>
			</div>
	</nav> -->
	<jsp:include page="Header.jsp" />
	<div class="container" id="">
		<div class="row d-flex justify-content-center"
			style="width: 100%; height: 100%;">
			<div class="col-lg-4">
				<canvas id="myChart">
				</canvas>
			</div>
		</div>
	</div>



	<!-- Datatables functionality started -->
	<div class="container" id="">
		<div class="row" style="width: 100%; height: 100%;">
			<table id="example" class="display" style="width: 100%">
				<thead>
					<tr>
						<th></th>
						<th>SHIPMENT ID</th>
						<th>SHIPMENT DATE</th>
						<th>SHIPMENT STATUS</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th></th>
						<th>SHIPMENT ID</th>
						<th>SHIPMENT DATE</th>
						<th>SHIPMENT STATUS</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	<!-- Datatables END -->


	<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous">
	</script>

	<script src="../javascript/Dashboardlogic.js"></script>
</body>
</html9>