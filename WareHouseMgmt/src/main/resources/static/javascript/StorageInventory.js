/**
 * 
 */



function init(){

getStorageInventory(1)

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

		  },
		  error: function(xhr) {
		    console.log(xhr)
		  }
		});


}