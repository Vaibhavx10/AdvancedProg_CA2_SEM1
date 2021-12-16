<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css" href="../css/DashboardStyle.css" rel="stylesheet" />

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<title>Dashboard Page</title>
</head>
<body onload="initialize()">
<div class="container" id="justLetsCCCSS" >
	<h1>Test CSS Here !!</h1>
</div>


	<!--navigation bar-->
	<nav class="navbar navbar-expand-sm navbar-light bg-light">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1">Title of website</span>
			<!--we can add logo in img-->
			<img class="d-inline-block align-top" src="" width="" height="">
			<!--ITS A MENU BUTTON AND WHEN A SCREEN REDUCES TO SMALL OR MOBILE SIZE(BREAK POINT) ALL THE ITEMS ARE AUTOMATICAALY LISTED UNDER THE MENU-->
			<button type="button" data-bs-toggle="collapse"
				data-bs-target="#navigationbar" class="navbar-toggler">
				MENU</button>
			<!--ITEMS OF NAVIGATION BAR-->
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
	</nav>




	<!--three containers using grid-->
	<%-- <div class="container-lg my-5" id="three container">
		<div class="row">
			<div class="col-sm-4" id="container one">
				<div class="p-5 bg-primary text-light">"${appName}"</div>
			</div>
			<div class="col-sm-4" id="container two">
				<div class="p-5 bg-primary text-light">COL 2</div>
			</div>
			<div class="col-sm-4" id="container three">
				<div class="p-5 bg-primary text-light">COL 3</div>
			</div>
		</div>
	</div> --%>
	<!--SINGLE CONTAINER-->



	<div class="container" id="">
		<div class="row" style="width: 100%; height: 100%;">
			<div class="col-lg-4">
				<canvas id="myChart">
				</canvas>
			</div>
		</div>
	</div>







	<script type="text/javascript">
		var ctx = document.getElementById('myChart');
		var myChart = new Chart(ctx,
				{
					type : 'line',
					data : {
						labels : ${xAxis} ,
						datasets : [ {
							label : 'Product Added in WareHouse As Per Date',
							data : ${yAxis} ,
							backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
									'rgba(54, 162, 235, 0.2)',
									'rgba(255, 206, 86, 0.2)',
									'rgba(75, 192, 192, 0.2)',
									'rgba(153, 102, 255, 0.2)',
									'rgba(255, 159, 64, 0.2)' ],
							borderColor : [ 'rgba(255, 99, 132, 1)',
									'rgba(54, 162, 235, 1)',
									'rgba(255, 206, 86, 1)',
									'rgba(75, 192, 192, 1)',
									'rgba(153, 102, 255, 1)',
									'rgba(255, 159, 64, 1)' ],
							borderWidth : 1
						} ]
					},
					options : {
						scales : {
							y : {
								beginAtZero : true
							}
						}
					}
				});
	</script>

 
<script type="text/javascript">
	var ctx = document.getElementById("productChart").getContext("2d");

var myChart = new Chart(ctx, {
  type: 'line',
  data: {
    labels: ["2015-03-15T13:03:00Z", "2015-03-25T13:02:00Z", "2015-04-25T14:12:00Z"],
    datasets: [{
      label: 'Demo',
      data: [{
          t: "2015-03-15T13:03:00Z",
          y: 12
        },
        {
          t: "2015-03-25T13:02:00Z",
          y: 21
        },
        {
          t: "2015-04-25T14:12:00Z",
          y: 32
        }
      ],
      backgroundColor: [
        'rgba(255, 99, 132, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(255, 206, 86, 0.2)',
        'rgba(75, 192, 192, 0.2)',
        'rgba(153, 102, 255, 0.2)',
        'rgba(255, 159, 64, 0.2)'
      ],
      borderColor: [
        'rgba(255,99,132,1)',
        'rgba(54, 162, 235, 1)',
        'rgba(255, 206, 86, 1)',
        'rgba(75, 192, 192, 1)',
        'rgba(153, 102, 255, 1)',
        'rgba(255, 159, 64, 1)'
      ],
      borderWidth: 1
    }]
  },
  options: {
    scales: {
      xAxes: [{
        type: 'time',
        distribution: 'linear'
      }]
    }
  }
});
</script>
 
 


<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>









	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous">
	</script>
	
	<script src="../javascript/Dashboardlogic.js"></script>
</body>
</html9>