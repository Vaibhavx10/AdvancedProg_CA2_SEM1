<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./ContactFormStyling.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
    <title>All Product</title>

</head>
<body>
    <!--Nav Bar Code-->
    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
        <a class="navbar-brand" href="#">
            <img src="./HomeIcon.svg" alt="LOGO" width="40" height="40" style="margin-left: 30%;"
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
        <form class="row g-3">
            <div class="col-md-6">
                <label for="productcat" class="form-label">Product Category ID</label>
                <input type="text" class="form-control" id="productcat" required>
            </div>
            <div class="col-md-6">
                <label for="storagetype" class="form-label">Storage Type ID</label>
                <input type="text" class="form-control" id="storagetype" required>
            </div>
            <div class="col-md-6">
                <label for="productname" class="form-label">Product Name</label>
                <input type="text" class="form-control" id="productname" required>
            </div>
            <div class="col-md-6">
                <label for="quantity" class="form-label">Quantity Per</label>
                <input type="text" class="form-control" id="quantity" required>
            </div>
            <div class="col-md-6">
                <label for="unitprice" class="form-label">Unit Price</label>
                <input type="text" class="form-control" id="unitprice" required>
            </div>
            <div class="col-md-6">
                <label for="productcatname" class="form-label">Product Category Name</label>
                <input type="text" class="form-control" id="productcatname" required>
            </div >
            <div class="col-md-12">
                <label for="Description" class="form-label">Product Description</label>
                <textarea class="form-control" id="Description" rows="3">Type Here!</textarea>
            </div>
            <div class="col-md-12" id="contactsubmitbtn">
                <button type="submit" class="BUTTON btn-outline-dark">Submit</button>
            </div>
        </form>
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


<!--Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
    crossorigin="anonymous"></script>
<script src="./AllProductStyleLogic.js"></script>
</body>
</html>