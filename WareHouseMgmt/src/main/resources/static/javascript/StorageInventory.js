/**
 * 
 */

var storageId;

function init(){
    const urlSearchParams = new URLSearchParams(window.location.search);
    const params = Object.fromEntries(urlSearchParams.entries());
   	storageId=params['storageId']

	getStorageInventory(storageId)
	getStorageInfo(storageId)
}


function getStorageInventory(storageId){

	$.ajax({
		  url: "/getStorageInventory",
		  type: "get",
		  data: { 
			  storageId: storageId, 
		  },
		  success: function(response) {
			console.log(response)

			document.getElementById('c_sInventory').innerHTML = `<table id="inventoryTable" class="display"></table>`
			
			
			$('#inventoryTable').DataTable( {
			        data: response,
			        columns: [
			            { title: "ProductId" },
						{ title: "Product Name" },
			            { title: "Product CategoryId" },
			            { title: "Product Category Name" },
			            { title: "Category Description" },
			            { title: "Quanitiy" }
			        ]
			    } );
			
		  },
		  error: function(xhr) {
		    console.log(xhr)
		  }
		});


}




function getStorageInfo(storageId){

	$.ajax({
		  url: "/getStorageInfo",
		  type: "get",
		  data: { 
			  storageId: storageId, 
		  },
		  success: function(response) {
			console.log(response)
			document.getElementById('val_StorageId').innerHTML = response[0][0]
			document.getElementById('val_StorageTypeId').innerHTML = response[0][1]
			document.getElementById('val_StorageTypeName').innerHTML = response[0][2]
			document.getElementById('val_StorageGUID').innerHTML = response[0][3]
			document.getElementById('val_ProductQuantity').innerHTML = response[0][4]
			document.getElementById('val_Capacity').innerHTML = response[0][5]
			
		  },
		  error: function(xhr) {
		    console.log(xhr)
		  }
		});


}