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
    <title>Document</title>
</head>
<body>
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
            <div class="col-md-12">
                <button type="submit" class="BUTTON btn-primary">Submit</button>
            </div>
        </form>
    </div>
    
</body>
</html>