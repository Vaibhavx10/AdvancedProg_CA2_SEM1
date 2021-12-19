<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %> -->
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
    <title>Contact Form</title>
</head>
<body>  
    <!--Nav Bar Code-->
    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
        <a class="navbar-brand" href="#">
            <img src="../img/HomeIcon.svg" alt="LOGO" width="40" height="40" style="margin-left: 30%;" class="d-inline-block align-top">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mobilemenu" aria-controls="mobilemenu" aria-expanded="false" aria-label="Toggle navigation">
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

<!--Contact Form-->

    <div class="container contactus">
        <h1>Contact Us!</h1>
            <div class="col-md-6" id="contactlabel-1">
                <label class="form-label">First Name</label>
                <input type="text" class="form-control" id="first-name" pattern="[a-zA-Z]+" required>
                <h5 class="errorChecker" id="val_first-name" >
                        First Name should be added
                    </h5>
            </div>
            <div class="col-md-6" id="contactlabel-2">
                <label class="form-label">Last Name</label>
                <input type="text" class="form-control" id="last-name" pattern="[a-zA-Z]+" required>
                <h5 class="errorChecker" id="val_last-name" >
                        Last Name should be added
                    </h5>
            </div>
            <div class="col-md-6" id="contactlabel-3">
                <label class="form-label">E-mail</label>
                <input type="email" class="form-control" id="e-mail" pattern=".+@company\.com" required>
                <h5 class="errorChecker" id="val_e-mail" >
                        Email should be added
                    </h5>
            </div>
            <div class="col-md-2" id="contactlabel-3">
                <label class="form-label">Country code</label>
                <select class="form-select" id="countries" class="form-control" onchange="countries_code()" required>
                <option value="select country">Select</option>
                <option value="US"> USA</option>
                <option value="JP"> Japan</option>
                <option value="IN"> India</option>
                <option value="BR"> Brazil</option>
                <option value="IE"> Ireland</option>
                <option value="CN"> China</option>
                <option value="IT"> Italy</option>
                <option value="FR"> France</option>
                </select>
                <h5 class="errorChecker" id="val_countries" >
                        Please select Country
                    </h5>
            </div>
            <div class="col-md-4" id="contactlabel-4">
                <label class="form-label">Phone Number</label>
                <input type="text" class="form-control" id="telephone-number" pattern="\d{9}" required>
                <h5 class="errorChecker" id="val_telephone-number" >
                        Telephone Number is Missing !!
                    </h5>
            </div>
            <div class="col-md-12" id="contactlabel-5">
                <label class="form-label">Comment Here!</label>
                <textarea class="form-control" id="commenting" rows="3"></textarea>
            </div>
            <div class="col-md-12" id="contactsubmitbtn">
                <button type="submit" 
                id="contactbtn" class="BUTTON btn-outline-dark" onclick="addContactUSInfoInDB()">Submit</button>
            </div>
    </div>
    <!--Contact Form Code Ends-->

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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<script src="../javascript/ContactFormLogic.js"></script>
</body>
</html> 