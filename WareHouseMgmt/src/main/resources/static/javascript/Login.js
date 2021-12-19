/**
 * 
 */


/**Global Variables*/
var UserRole;



/**
 * Initializer function
 */
function init() {

	checkUserSession()

}

/**
*Function to check user session
* @author Pankesh
*/
function checkUserSession() {
	var userData = JSON.parse(sessionStorage.getItem("userData"));
	if (userData == null) {
		renderLoginModal()
	}
	else {
		window.location.href = `../dashboard`;
	}
}

/**Function to render login modal pop up
* @author Pankesh
*/
function renderLoginModal() {

	var elem = `<button type="button" id="btn_Modal" style="display:none" class="btn btn-primary" data-bs-target="#loginModal" data-bs-toggle="modal"></button>`;

	document.body.innerHTML = document.body.innerHTML + elem;

	document.getElementById('btn_Modal').click();
}



/**Function to login user using ajax call
* @author Pankesh
*/
function validateLogin() {

	let userName = document.getElementById('userName').value;
	let userPassword = document.getElementById('userPassword').value;
	
	var Regex = /^(?=[a-zA-Z0-9._]{4,20}$)(?!.*[_.]{2})[^_.].*[^_.]$/
	
	/**Validation for username*/
	if(userName=="" || userName==null || !Regex.test(userName)){
	alert("Please fill valid UserName!")
	return
	}

	/**validation for password*/
	if(userPassword=="" || userPassword==null || !Regex.test(userPassword)){
	alert("Please fill valid Password!")
	return
	}
	



	var WarehouseUser = {
		userName: userName,
		password: userPassword
	}

	$.ajax({
		url: "/loginUser",
		type: "GET",

		data: WarehouseUser,
		success: function(response) {
		
			if(response!="" && response!=null){
			console.log(response)
			const userDetails = { "WarehouseUserId": response['id'], "UserName": response['userName'], "UserRole": response['userRole'] };
			sessionStorage.setItem("userData", JSON.stringify(userDetails));
			checkUserSession()
			}
			else{
			alert("Invlaid Login!")
			}
		},
		error: function(xhr) {
			console.log(xhr)
		}
	});

}



/**Function to assign user role on drop down change
* @author Pankesh
*/
function selectUserRole(role) {
	UserRole = role;
	if (role == 1) {
		document.getElementById('dd_UserRole').innerHTML = "Admin";
	}
	else {
		document.getElementById('dd_UserRole').innerHTML = "Staff";
	}


}

/**Function to create new user
* @author Pankesh
*/
function createUser() {

	let userName = document.getElementById('registerUserName').value;
	let userPassword = document.getElementById('registerUserPassword').value;
	
	
	var Regex = /^(?=[a-zA-Z0-9._]{4,20}$)(?!.*[_.]{2})[^_.].*[^_.]$/
	
	/**validation for user name*/
	if(userName=="" || userName==null || !Regex.test(userName)){
	alert("Please fill valid User Name!")
	return
	}

	/**validation for password*/
	if(userPassword=="" || userPassword==null || !Regex.test(userPassword)){
	alert("Please fill valid Password!")
	return
	}
	
	/**validation for userrole*/
	if(!(UserRole==1 || UserRole==2 ||UserRole=="1" || UserRole=="2")){
	alert("Please select User Role!")
	return
	}
	


	var WarehouseUser = {
		userName: userName,
		password: userPassword,
		userRole: UserRole
	}

	var json = JSON.stringify(WarehouseUser);

	$.ajax({
		url: "/addUser",
		type: "POST",
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		data: json,
		success: function(response) {
			console.log(response)
			if(response===false){
				alert('User Sucessfully created!')
				window.location.reload();
			}
			else if(response===true){
				alert('User already exists!')
			}
			else{
			alert('Opps! something went wrong.')
			}

		},
		error: function(xhr) {
			console.log(xhr)
		}
	});


}
