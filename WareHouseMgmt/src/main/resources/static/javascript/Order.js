/**
 * 
 */


var OList = [];

function init() {
	getOrdersList()
	getProducts()
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


function generateOrderXML() {
	var ProductList = [{
		ProductId: 40,
		Quantity: 5
	}, {
		ProductId: 43,
		Quantity: 8
	}]

	var OrderDetail = ""

	for (let i = 0; i < ProductList.length; i++) {

		let order = `<OrderDetail>
		<ProductId>${ProductList[i].ProductId}</ProductId>
		<Quantity>${ProductList[i].Quantity}</Quantity>
		</OrderDetail>`

		OrderDetail = OrderDetail + order
	}

	var PurchaseDetail = `<PurchaseDetail>${OrderDetail}</PurchaseDetail>`
	
	console.log(PurchaseDetail);
}

function addToBucket(){


}
