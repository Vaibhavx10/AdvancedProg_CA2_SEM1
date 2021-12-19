/**
 * 
 */

/**Global Variables*/
var storageTypes={
	"0": "All",
	"1": "GeneralStorage",
	"2": "Fridge",
	"3": "Shelf"
}

/** Initializer function*/
function init(){

	getStorageType();
	checkUserSession();
	}

/**Function to check user session
* @author Pankesh
*/
function checkUserSession() {
	var userData = JSON.parse(sessionStorage.getItem("userData"));
	if (userData == null) {
		alert("Session is Expired Please login again");
		window.location.href = `/`;
	}
}


/**Function to get storage types and bind it drop down options
* @author Pankesh
*/
function getStorageType(){
	
	var dropdown =  document.getElementById("ul_StorageType");
	
	Object.keys(storageTypes).forEach(function (item) {
	  let data=`<li><a class="dropdown-item" onclick="getStorageDetails(${item})">${storageTypes[item]}</a></li>`;
		dropdown.innerHTML=dropdown.innerHTML	+	data	;
	});
	
	/**Default call for all storage types on first load*/
	getStorageDetails(0);
}


/**Function to get storage Details by Type using Ajax Get call and bind datatable for response
* @author Pankesh
*/
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
			
			/**Adding event listener for row elements click*/
			for (var item of rows) {
			   item.addEventListener("click",rowClick)
			}

		  },
		  error: function(xhr) {
		    console.log(xhr)
		  }
		});
	
}

/**Function to redirect to inventory page on storage row click
* @author Pankesh
*/
function rowClick(){
		var table = $('#storageTable').DataTable();		
        var data = table.row( this ).data();
		window.location.href=`../storageInventory?storageId=${data[0]}`;
}



function openStorage(StorageId){
	alert(StorageId);
}
