
/**
 * Initializer function
 */
function initialize() {
	checkUserSession();
	setProductDropdown(lisProductinfo);
}


/**
*Function to check user session
* @author Vaibhav
*/
function checkUserSession() {
	var userData = JSON.parse(sessionStorage.getItem("userData"));
	if (userData == null) {
		alert("Session is Expired Please login again");
		window.location.href = `/`;
	}
}


/**Function to set product drop down
* @author Vaibhav
*/
function setProductDropdown(lisProductinfo){
	
	var prdDropDown = document.getElementById("dd_li_prd_categoryname");
	
 	for (var i = 0; i < lisProductinfo.length; i++) {
		var drpdown = `
					<li><a class="dropdown-item" href="#" value='${lisProductinfo[i].productCategoryName}' id="finaldropdownselection" 
					onclick="getProductDetails('${lisProductinfo[i].productCategoryId}','${lisProductinfo[i].productCategoryName}')">
					'${lisProductinfo[i].productCategoryName}'</a></li>`
		prdDropDown.innerHTML = prdDropDown.innerHTML + drpdown 		
	}
}



/**
* @author Vaibhav
*/
function dropdownValue(){
	alert($('#finaldropdownselection').value());
}



/**Function to get product details
* @author Vaibhav
*/
function getProductDetails(productID,productName){
	var selectedIteam = document.getElementById("dropdownMenuButton1");
	var setDDID = document.getElementById("setDropDownIdhere");
	
	selectedIteam.innerHTML = productName;
	setDDID.innerHTML = productID;
}


/**Function to set storage type
* @author Vaibhav
*/
function setStorageType(id){
	var selectedIteam = document.getElementById("dropdownMenuButton2");
	selectedIteam.innerHTML = id;
}


/**Function to add product
* @author Vaibhav
*/
function addProductInDB(){
	console.log("addProductInDB Called !!");

var productname = genricValidation("productname");
var quantity = genricValidation("quantity");
var unitprice = genricValidation("unitprice");
var productcatname = genricValidation("productcatname");
var ddproductcatname = dropDownGenricValidation("dropdownMenuButton1");
var productCategoryId = document.getElementById("setDropDownIdhere").innerHTML;
var storageTypeId = document.getElementById('dropdownMenuButton2').innerText;


//var dropdownMenuButton2	= dropDownGenricValidation("dropdownMenuButton2");


var description = document.getElementById("Description").value;


if(productname!=null && quantity!=null && unitprice !=null && productcatname!=null){
	$.ajax({
			  url: "/addDataToProductTable",
			  type: "post",
			  data: { 
				  productname: productname,
					quantity:quantity,
					unitprice :unitprice ,
					productcatname:productcatname,
					description:description,
					ddproductcatname : ddproductcatname,
					productCategoryId :productCategoryId,
					storageTypeId : storageTypeId
			  },
			  success: function(response) {
				console.log(response)			
			  },
			  error: function(xhr) {
			    console.log(xhr)
			  }
			});

}	
}



/**Function for validation
* @author Vaibhav
*/
function genricValidation(idString){

	if(document.getElementById(idString).value!=null && document.getElementById(idString).value.length > 0 ){
		return document.getElementById(idString).value;
	}else{
		var strName = "val_"+idString;
		document.getElementById(strName).style.visibility = "visible";
		return null;
	}
}



/**Function for drop down validation
* @author Vaibhav
*/
function dropDownGenricValidation(idString) {

	var val = document.getElementById('dropdownMenuButton1').innerText;
	if (val == 'Product Category Name' != true) {
		return document.getElementById(idString).innerText;
	} else {
		var strName = "val_" + idString;
		document.getElementById(strName).style.visibility = "visible";
		return null;
	}
}














