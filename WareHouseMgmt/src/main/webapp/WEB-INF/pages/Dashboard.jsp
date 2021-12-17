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
</script>


<body onload="initialize(xAxisVal,yAxisVal)">

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
						<th>First name</th>
						<th>Last name</th>
						<th>Position</th>
						<th>Office</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th></th>
						<th>First name</th>
						<th>Last name</th>
						<th>Position</th>
						<th>Office</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>

	<script type="text/javascript">

var ajaxdata = [
    {
      "DT_RowId": "row_5",
      "first_name": "Airi",
      "last_name": "Satou",
      "position": "Accountant",
      "office": "Tokyo",
      "start_date": "28th Nov 08",
      "salary": "$162,700"
    },
    {
      "DT_RowId": "row_25",
      "first_name": "Angelica",
      "last_name": "Ramos",
      "position": "Chief Executive Officer (CEO)",
      "office": "London",
      "start_date": "9th Oct 09",
      "salary": "$1,200,000"
    },
    {
      "DT_RowId": "row_3",
      "first_name": "Ashton",
      "last_name": "Cox",
      "position": "Junior Technical Author",
      "office": "San Francisco",
      "start_date": "12th Jan 09",
      "salary": "$86,000"
    },
    {
      "DT_RowId": "row_19",
      "first_name": "Bradley",
      "last_name": "Greer",
      "position": "Software Engineer",
      "office": "London",
      "start_date": "13th Oct 12",
      "salary": "$132,000"
    },
    {
      "DT_RowId": "row_28",
      "first_name": "Brenden",
      "last_name": "Wagner",
      "position": "Software Engineer",
      "office": "San Francisco",
      "start_date": "7th Jun 11",
      "salary": "$206,850"
    },
    {
      "DT_RowId": "row_6",
      "first_name": "Brielle",
      "last_name": "Williamson",
      "position": "Integration Specialist",
      "office": "New York",
      "start_date": "2nd Dec 12",
      "salary": "$372,000"
    },
    {
      "DT_RowId": "row_43",
      "first_name": "Bruno",
      "last_name": "Nash",
      "position": "Software Engineer",
      "office": "London",
      "start_date": "3rd May 11",
      "salary": "$163,500"
    },
    {
      "DT_RowId": "row_23",
      "first_name": "Caesar",
      "last_name": "Vance",
      "position": "Pre-Sales Support",
      "office": "New York",
      "start_date": "12th Dec 11",
      "salary": "$106,450"
    },
    {
      "DT_RowId": "row_51",
      "first_name": "Cara",
      "last_name": "Stevens",
      "position": "Sales Assistant",
      "office": "New York",
      "start_date": "6th Dec 11",
      "salary": "$145,600"
    },
    {
      "DT_RowId": "row_4",
      "first_name": "Cedric",
      "last_name": "Kelly",
      "position": "Senior Javascript Developer",
      "office": "Edinburgh",
      "start_date": "29th Mar 12",
      "salary": "$433,060"
    }
  ];



    function format ( d ) {
        return 'Full name: '+d.first_name+' '+d.last_name+'<br>'+
            'Salary: '+d.salary+'<br>'+
            'The child row can contain any data you wish, including links, images, inner tables etc.';
    }
    
    $(document).ready(function() {
        var dt = $('#example').DataTable( {
            "data": ajaxdata,
            "columns": [
                {
                    "class":          "details-control",
                    "orderable":      false,
                    "data":           null,
                    "defaultContent": ""
                },
                { "data": "first_name" },
                { "data": "last_name" },
                { "data": "position" },
                { "data": "office" }
            ],
            "order": [[1, 'asc']]
        } );
    
        // Array to track the ids of the details displayed rows
        var detailRows = [];
    
        $('#example tbody').on( 'click', 'tr td.details-control', function () {
            var tr = $(this).closest('tr');
            var row = dt.row( tr );
            var idx = $.inArray( tr.attr('id'), detailRows );
    
            if ( row.child.isShown() ) {
                tr.removeClass( 'details' );
                row.child.hide();
    
                // Remove from the 'open' array
                detailRows.splice( idx, 1 );
            }
            else {
                tr.addClass( 'details' );
                row.child( format( row.data() ) ).show();
    
                // Add to the 'open' array
                if ( idx === -1 ) {
                    detailRows.push( tr.attr('id') );
                }
            }
        } );
    
        // On each draw, loop over the `detailRows` array and show any child rows
        dt.on( 'draw', function () {
            $.each( detailRows, function ( i, id ) {
                $('#'+id+' td.details-control').trigger( 'click' );
            } );
        } );
    } );
</script>



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