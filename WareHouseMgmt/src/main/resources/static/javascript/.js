function initialize(){
	setProductDropdown(lisProductinfo);
}


function setProductDropdown(lisProductinfo){
	var prdDropDown = document.getElementById("dropdownliiteams");
	console.log("lisProductinfo.length "+lisProductinfo.length);
	
	
 	for (var i = 0; i < lisProductinfo.length; i++) {
		console.log(lisProductinfo[i]);
		var drpdown = `
					<li><a class="dropdown-item" href="#">'${lisProductinfo[i]}'</a></li>`
		prdDropDown.innerHTML = prdDropDown.innerHTML + drpdown 		
	}

	console.log("lisProductinfo :: "+lisProductinfo);
}