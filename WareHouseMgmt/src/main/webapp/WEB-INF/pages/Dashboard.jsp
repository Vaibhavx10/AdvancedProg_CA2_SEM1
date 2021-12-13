<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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













    


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>