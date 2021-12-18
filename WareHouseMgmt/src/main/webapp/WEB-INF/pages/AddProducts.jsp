<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/AddProductStyle.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
    <title>All Product</title>

</head>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
<script type="text/javascript">
	var lisProductinfo = ${allPrduct};
</script>


<body onload="initialize()">
    <!--Nav Bar Code-->
    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
        <a class="navbar-brand" href="#">
            <img src="../img/HomeIcon.svg" alt="LOGO" width="40" height="40" style="margin-left: 30%;"
                class="d-inline-block align-top">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mobilemenu"
            aria-controls="mobilemenu" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mobilemenu">
            <ul class="navbar-nav ms-auto text-center">
                <li>
                    <a class="nav-link" href="./ContactForm.html">Contact Us</a>
                </li>
                <li>
                    <a class="nav-link" href="./AllProductStyle.html">Product Form</a>
                </li>
                <li>
                    <a class="nav-link" href="#">Item 3</a>
                </li>
                <li>
                    <a class="nav-link" href="#">Item 4</a>
                </li>
                <li>
                    <a class="nav-link" href="#">Item 5</a>
                </li>
                <li>
                    <a class="nav-link" href="#">Item 6</a>
                </li>
            </ul>
        </div>
    </nav>
    <!--Navbar Code Ends-->

    <!--Product Form-->
    <div class="container mt-5">
        <h1>Add Product</h1>
        <div class="row">
        <div class="dropdown col-md-6">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton1" data-bs-toggle="dropdown"
					aria-expanded="false">Product Category Name</button>
				<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1" id="dd_li_prd_categoryname">
				</ul>
			</div>
            
            <div class="dropdown col-md-6">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton2" data-bs-toggle="dropdown"
					aria-expanded="false">Storage Type</button>
				<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton2" id="dd_li_storagetype">
					<li><a class="dropdown-item" href="#" onclick="setStorageType('1')">1</a></li>
					<li><a class="dropdown-item" href="#" onclick="setStorageType('2')">2</a></li>
					<li><a class="dropdown-item" href="#" onclick="setStorageType('3')">3</a></li>
				</ul>
			</div>
			
			
            <div class="col-md-6">
                <label for="productname" class="form-label">Product Name</label>
                <input type="text" class="form-control" id="productname" required>
                <h5 class="errorChecker" id="val_productname" >
                        Product Name is absent
                    </h5>
            </div>
            <div class="col-md-6">
                <label for="quantity" class="form-label">Quantity Per Unit</label>
                <input type="text" class="form-control" id="quantity" required>
                <h5 class="errorChecker" id="val_quantity" >
                        Quantity should be added
                    </h5>
            </div>
            <div class="col-md-6">
                <label for="unitprice" class="form-label">Unit Price</label>
                <input type="text" class="form-control" id="unitprice" required>
                <h5 class="errorChecker" id="val_unitprice" >
                        Unit Price should be added
                    </h5>
            </div>
            <div class="col-md-6">
                <label for="productcatname" class="form-label">Product Category Name</label>
                <input type="text" class="form-control" id="productcatname" required>
                <h5 class="errorChecker" id="val_productcatname" >
                        Product Category should be added
                    </h5>
            </div >
            <div class="col-md-12">
                <label for="Description" class="form-label">Product Description</label>
                <textarea class="form-control" id="Description" rows="3">Type Here!</textarea>
            </div>
            <div class="col-md-12" id="contactsubmitbtn">
                <button type="submit" class="BUTTON btn-outline-dark" onclick="addProductInDB()">Submit</button>
            </div>
        </div>
    </div>
    <!--Product Form Ends-->

    <!--Footer Code Starts-->
    <footer class="bg-dark text-white pt-5 pb-4 fixed-bottom">
        <div class="col-md-12 col-lg-12">
            <div class="text-center text-md-right">
                <ul class="list-unstyled list-inline">
                    <li class="list-inline-item">
                        <a href="#" class="btn-floating btn-sm text-white" style="font-size: 23px;">
                            <i class="fab fa-facebook"></i>
                        </a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn-floating btn-sm text-white" style="font-size: 23px;">
                            <i class="fab fa-twitter"></i>
                        </a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn-floating btn-sm text-white" style="font-size: 23px;">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn-floating btn-sm text-white" style="font-size: 23px;">
                            <i class="fab fa-google-plus"></i>
                        </a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn-floating btn-sm text-white" style="font-size: 23px;">
                            <i class="fab fa-youtube"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        </div>
    </footer>
    
    <!--Footer Code Ends-->

<script src="../javascript/AddProductLogic.js"></script>
<!--Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
    crossorigin="anonymous"></script>
</body>
</html>