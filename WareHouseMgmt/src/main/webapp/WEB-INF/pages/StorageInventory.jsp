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
<body onload="init()">


    
 
    
   <jsp:include page="Header.jsp" />
    
    
    <div class="row">
        <!--three containers using grid-->
    <div class="container-lg my-5" id="three container">
        <div class="row">
            <div class="col-lg-2" id="container one">
      
            </div>
            <div class="col-lg-8 text-center" id="container two">
                <div class="p-5">
                <h5>Storage Details :</h5>
                <table class="table">
	                <tbody style="align:left;" class="m-2">
		                <tr>
			                <td id="lb_StorageId">StorageId</td><td>:</td><td id="val_StorageId"></td> 
		                </tr>
		                <tr>
		                	<td id="lb_StorageGUID">Storage GUID</td><td>:</td><td id="val_StorageGUID"></td>
		                </tr>
		               	<tr>
			                <td id="lb_StorageTypeId">Storage TypeId</td><td>:</td><td id="val_StorageTypeId"></td>
			           </tr>
		                 <tr>
			                <td id="lb_StorageTypeName">Storage Type Name</td><td>:</td><td id="val_StorageTypeName"></td>
		                </tr>
		                 <tr>
			                <td id="lb_ProductQuantity">Product Quantity</td><td>:</td><td id="val_ProductQuantity"></td>
			               </tr>
		                 <tr>			                
			                <td id="lb_Capacity">Capacity</td><td>:</td><td id="val_Capacity"></td>
		                </tr>
	                </tbody>
                </table>



				</div>
            </div>
            <div class="col-lg-2" id="container three">

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