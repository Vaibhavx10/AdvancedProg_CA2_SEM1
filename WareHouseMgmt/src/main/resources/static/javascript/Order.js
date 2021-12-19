/**
 * 
 */


var OList = [];
var Products=[];
var selectedProductList=[];

function init() {
	getOrdersList()
	getProducts()
	checkUserSession()
}

function checkUserSession() {
	var userData = JSON.parse(sessionStorage.getItem("userData"));
	if (userData == null) {
		alert("Session is Expired Please login again");
		window.location.href = `/`;
	}
}

function getOrdersList() {

	$.ajax({
		url: "/getAllOrders",
		type: "GET",
		success: function(response) {
			console.log(response)
			OList = response;
			var Orders = []
			response.forEach(item => {
				let Od = {
					0: item.orderId,
					1: item.orderDate,
					2: item.customerDetail.customerName,
					3: item.customerDetail.customerContact,
					4: `<button type="button" class="btn btn-primary btn-sm" onclick="productList(${item.orderId})"	 data-bs-target="#md_ProductList" data-bs-toggle="modal">View Products</button>`,
				}


				Orders.push(Od);
			});

			console.log(Orders);

			document.getElementById('dt_Orders').innerHTML = `<table id="orderTable" class="display"></table>`


			$('#orderTable').DataTable({
				data: Orders,
				columns: [
					{ title: "OrderId" },
					{ title: "Order Date" },
					{ title: "Customer Name" },
					{ title: "Customer Contact" },
					{ title: "Action" },
				],
			});


		},
		error: function(xhr) {
			console.log(xhr)
		}
	});
}



function getProducts() {

	$.ajax({
		url: "/getProducts",
		type: "GET",
		success: function(response) {
			console.log(response)
			Products=response;
			let select =document.getElementById('sl_products')
			
			for(let i=0;i<response.length; i++){
			
			select.innerHTML =select.innerHTML + `<option value="${response[i].productId}">${response[i].productName}</option>`
			
			}


		},
		error: function(xhr) {
			console.log(xhr)
		}
	});
}




function productList(orderId) {

	var plist = OList.filter(x => x.orderId == orderId)[0].productList;

	console.log("P list>>>>" + plist)


	var tb_ProductList = document.getElementById('tb_body')

	tb_ProductList.innerHTML = "";

	for (let i = 0; i < plist.length; i++) {
		var tb = `
		    <tr>
		      <th scope="row">${i + 1}</th>
		      <td>${plist[i].productd.productName}</td>
		      <td>${plist[i].quantity}</td>
		      <td>${plist[i].productd.quantityPerUnit}</td>
			  <td>${plist[i].productd.unitPrice}</td>
		    </tr>`;

		tb_ProductList.innerHTML = tb_ProductList.innerHTML + tb;

	}
}


function generateOrderXML(ProductList) {

	var OrderDetail = ""

	for (let i = 0; i < ProductList.length; i++) {

		let order = `<OrderDetail><ProductId>${ProductList[i].ProductId}</ProductId><Quantity>${ProductList[i].Quantity}</Quantity></OrderDetail>`

		OrderDetail = OrderDetail + order
	}

	var PurchaseDetail = `<PurchaseDetail>${OrderDetail}</PurchaseDetail>`
	
	console.log(PurchaseDetail);
	return PurchaseDetail;
}

function addToBucket(){

  var selectList = document.getElementById("sl_products");
  var index = selectList.selectedIndex;
  var options = selectList.options;
  var selectedOptions = selectList.selectedOptions

	var domList	=	document.getElementById('ul_selectedProducts');
 for(let i=0; i<selectedOptions.length;i++){
	var ProductId=selectedOptions[i].value;
	var selectedProduct = Products.filter(x => x.productId == ProductId)[0];
	
	if(!selectedProductList.includes(selectedProduct)){
	selectedProductList.push(selectedProduct)

	domList.innerHTML = domList.innerHTML + `<li class="list-group-item">
										<div class="row">
											<div class="col-9">${selectedProduct.productName}</div><div class="col-3"><input type="number" id="q_${selectedProduct.productId}"></div>
										 </div>
										</li>`
	}

}

}


function addOrder(){

	let prodQuant=[]
	
	selectedProductList.forEach(x=>{
	let q = document.getElementById("q_"+`${x.productId}`).value;
	let p={
			ProductId: x.productId,
			Quantity : q
			}
		prodQuant.push(p)	
	
	});
	
	let orderxml=generateOrderXML(prodQuant);
	
	

	var Order = {
		customerId: 1,
		purchaseDetails: orderxml
	}

	var json = JSON.stringify(Order);

	$.ajax({
		url: "/addOrder",
		type: "POST",
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		data: json,
		success: function(response) {
			console.log(response)
		},
		error: function(xhr) {
			console.log(xhr)
		}
	});

}


