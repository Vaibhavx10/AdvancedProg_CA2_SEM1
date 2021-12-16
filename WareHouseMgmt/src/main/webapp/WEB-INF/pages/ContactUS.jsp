<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>CONTACT FORM</title>
</head>
<body>
    <div class="container mt-5">
        <h1>Contact Us!</h1>
        <form class="row g-3">
            <div class="col-md-6">
            <label for="FIRSTName" class="form-label">First Name</label>
            <input type="text" class="form-control" id="FIRSTName" required>
            </div>
            <div class="col-md-6">
                <label for="LASTName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="LASTName" required>
            </div>
            <div class="col-md-8">
                <label for="EMAIL" class="form-label">E-mail</label>
                <input type="email" class="form-control" id="EMAIL" required>
            </div>
            <div class="col-md-4">
                <label for="phoneNO" class="form-label">Phone Number</label>
                <input type="text" class="form-control" id="phoneNO" placeholder="+353 987654321" required>
            </div>
            <div class="col-md-12">
                <label for="commenting" class="form-label">Comment Here!</label>
                <textarea class="form-control" id="commenting" rows="3" required></textarea>
            </div>
            <div class="col-md-12">
                <button type="submit" class="BUTTON btn-primary">Submit</button>
            </div>
        </form>
    </div>
</body>
</html>