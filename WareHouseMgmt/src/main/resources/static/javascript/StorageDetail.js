/**
 * 
 */


var storageTypes={
	"0": "All",
	"1": "GeneralStorage",
	"2": "Fridge",
	"3": "Shelf"
}

function init(){

	getStorageType();
	}


function getStorageType(){
	
	
	

	var dropdown =  document.getElementById("ul_StorageType");
	
	Object.keys(storageTypes).forEach(function (item) {
	  let data=`<li><a class="dropdown-item" onclick="getStorageDetails(${item})">${storageTypes[item]}</a></li>`;
		dropdown.innerHTML=dropdown.innerHTML	+	data	;
	});
	
	getStorageDetails(0);
}


function getStorageDetails (storageTypeId){

	document.getElementById("dd_StorageType").innerHTML = storageTypes[storageTypeId];
	
	if (document.contains(document.getElementById("storageTable"))) {
            document.getElementById("storageTable").remove();
	}
	
	$.ajax({
		  url: "/getStorageDetail",
		  type: "get",
		  data: { 
			  storageTypeID: storageTypeId, 
		  },
		  success: function(response) {
			  console.log(response);
	
			document.getElementById('c_storage').innerHTML = `<table id="storageTable" class="display"></table>`
			
			  
			$('#storageTable').DataTable( {
			        data: response,
			        columns: [
			            { title: "StorageId" },
						{ title: "StorageTypeId" },
			            { title: "StorageTypeName" },
			            { title: "StorageGUID" },
			            { title: "ProductQuantity" },
			            { title: "Capacity" }
			        ]
			    } );

			
			let rows = document.getElementById('storageTable').getElementsByTagName('tbody')[0].getElementsByTagName('tr')
			
			for (var item of rows) {
			   item.addEventListener("click",rowClick)
			}

		  },
		  error: function(xhr) {
		    console.log(xhr)
		  }
		});
	
}


function rowClick(){
		var table = $('#storageTable').DataTable();		
        var data = table.row( this ).data();
		window.location.href=`../storageInventory?storageId=${data[0]}`;
}



function openStorage(StorageId){
	alert(StorageId);
}
