

/**Function for countries codes
* @author Chirag
*/
function countries_code() {
	var val = document.getElementById("countries").value;
	if (val === "select country") {
		document.getElementById("telephone-number").value = "";
	}
	else if (val === "US") {
		document.getElementById("telephone-number").value = "+1";
	}
	else if (val === "JP") {
		document.getElementById("telephone-number").value = "+81";
	}
	else if (val === "IN") {
		document.getElementById("telephone-number").value = "+91";
	}
	else if (val === "BR") {
		document.getElementById("telephone-number").value = "+55";
	}
	else if (val === "IE") {
		document.getElementById("telephone-number").value = "+353";
	}
	else if (val === "CN") {
		document.getElementById("telephone-number").value = "+86";
	}
	else if (val === "IT") {
		document.getElementById("telephone-number").value = "+39";
	}
	else if (val === "FR") {
		document.getElementById("telephone-number").value = "+33";
	}
}



/**Function to add ContactUS
* @author Chirag
*/
function addContactUSInfoInDB() {

	genricHideAll('first-name');
	genricHideAll('last-name');
	genricHideAll('e-mail');
	genricHideAll('countries');
	genricHideAll('telephone-number');
	

	var fname = genricValidation('first-name');
	var lname = genricValidation('last-name');
	var email = genricValidation('e-mail');
	var country = genricValidation('countries');
	var phone = genricValidation('telephone-number');
	var message = document.getElementById('commenting').value;



	if (fname != null && lname != null && email != null && country != null && phone != null) {
		$.ajax({
			url: "/addContactInfoInDB",
			type: "post",
			data: {
				FirstName: fname,
				LastName: lname,
				Email: email,
				Country: country,
				Phone: phone,
				Message: message
			},
			success: function(response) {
				console.log(response)
			},
			error: function(xhr) {
				console.log(xhr)
			}
		});

	} else {

	}




}



/**Function to hide all
* @author Chirag
*/
function genricHideAll(idString) {
	var strName = "val_" + idString;
	document.getElementById(strName).style.visibility = "hidden";
}


/**Function for validation
* @author Chirag
*/
function genricValidation(idString) {

	if (document.getElementById(idString).value != null && document.getElementById(idString).value.length > 0) {
		return document.getElementById(idString).value;
	} else {
		var strName = "val_" + idString;
		document.getElementById(strName).style.visibility = "visible";
		return null;
	}
}