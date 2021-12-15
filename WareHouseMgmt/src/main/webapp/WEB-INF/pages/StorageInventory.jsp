<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.0/font/bootstrap-icons.css">
         <link rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
         
</head>
<body>


    
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
    <div class="row">
        <!--three containers using grid-->
    <div class="container-lg my-5" id="three container">
        <div class="row">
            <div class="col-lg-2" id="container one">
                <div class="p-5 bg-primary text-light">COL 1</div>
            </div>
            <div class="col-lg-8 text-center" id="container two">
                <div class="p-5">
                



				</div>
            </div>
            <div class="col-lg-2" id="container three">
                <div class="p-5 bg-primary text-light">COL 3</div>
            </div>
        </div>
    </div>
    </div>
    
    
    
     <div class="row">
    
    <!--SINGLE CONTAINER-->
    <div class="container p-5" id="c_sInventory">  
    
    
    
    </div>



    
    </div>









<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.6.2/chart.min.js"></script>

<script src="../javascript/StorageInventory.js"></script>
</body>
</html>