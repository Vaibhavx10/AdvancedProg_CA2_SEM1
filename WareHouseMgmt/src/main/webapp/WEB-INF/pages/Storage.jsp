<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Warehouse Management System</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.0/font/bootstrap-icons.css">
        
</head>
<body onload="init()">

    
    <!--navigation bar-->
    <nav class="navbar navbar-expand-sm navbar-light bg-light">
        <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">Title of website</span>
    <!--we can add logo in img-->
    <img 
    class="d-inline-block align-top"
    src="" width="" height="">
    <!--ITS A MENU BUTTON AND WHEN A SCREEN REDUCES TO SMALL OR MOBILE SIZE(BREAK POINT) ALL THE ITEMS ARE AUTOMATICAALY LISTED UNDER THE MENU-->
    <button
    type="button"
    data-bs-toggle="collapse"
    data-bs-target="#navigationbar"
    class="navbar-toggler"
    >
    MENU
    </button>
    <!--ITEMS OF NAVIGATION BAR-->
    <div
    class="collapse navbar-collapse" id="navigationbar">
    <ul class="navbar-nav ms-auto">
        <li class="nav-item ">
            <a href="" class="nav-link active">Item 1</a>
        </li>
        <li class="nav-item ">
            <a href="" class="nav-link active">item 2</a>
        </li>
        <li class="nav-item ">
            <a href="" class="nav-link active">item 3</a>
        </li>
        <li class="nav-item">
            <a href="" class="nav-link active">item 4</a>
        </li>
        <li class="nav-item">
            <a href="" class="nav-link active">item 5</a>
        </li>
        <li class="nav-item">
            <a href="" class="nav-link">Logout</a>
        </li>
    </ul>
    </div>
    </nav>
    <!--three containers using grid-->
    <div class="container-lg my-5" id="three container">
        <div class="row">
            <div class="col-sm-4" id="container one">
                <div class="p-5 bg-primary text-light">COL 1</div>
            </div>
            <div class="col-sm-4" id="container two">
                <div class="p-5 bg-primary text-light">COL 2</div>
            </div>
            <div class="col-sm-4" id="container three">
                <div class="p-5 bg-primary text-light">COL 3</div>
            </div>
        </div>
    </div>
    <!--SINGLE CONTAINER-->
    <div class="container bg-primary p-5 text-light" id=""> Container </div>






<script>
function init(){
	$.ajax({
		  url: "/getStorageDetail",
		  type: "get", //send it through get method
		  data: { 
			  storageTypeID: 1, 
		  },
		  success: function(response) {
			  console.log(response)
		    //Do Something
		    alert('success!')
		  },
		  error: function(xhr) {
		    //Do Something to handle error
		    alert('error!')
		  }
		});
	
	}



</script>


<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.11.3/datatables.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.6.2/chart.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>