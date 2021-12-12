<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<div>
  <canvas id="myChart"></canvas>
</div>
<script type="text/javascript">



const labels = [
	  'January',
	  'February',
	  'March',
	  'April',
	  'May',
	  'June',
	];
const data = {
		  labels: labels,
		  datasets: [{
		    label: 'My First dataset',
		    backgroundColor: 'rgb(255, 99, 132)',
		    borderColor: 'rgb(255, 99, 132)',
		    data: [0, 10, 5, 2, 20, 30, 45],
		  }]
		};
		
const config = {
  type: 'line',
  data,
  options: {}
};


	



</script>

</body>
</html>