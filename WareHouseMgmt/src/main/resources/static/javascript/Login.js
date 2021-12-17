/**
 * 
 */

var UserRole;

/**
 * Initializer function
 */
function init() {
	renderLoginModal()

}


function renderLoginModal() {

	var elem = `<button type="button" id="btn_Modal" style="display:none" class="btn btn-primary" data-bs-target="#loginModal" data-bs-toggle="modal"></button>`;

	document.body.innerHTML = document.body.innerHTML + elem;

	document.getElementById('btn_Modal').click();
}




function validateLogin() {

}

function selectUserRole(role) {
	UserRole = role;
	if (role == 1) {
		document.getElementById('dd_UserRole').innerHTML = "Admin";
	}
	else {
		document.getElementById('dd_UserRole').innerHTML = "Staff";
	}


}


function createUser() {

	let userName = document.getElementById('registerUserName').value;
	let userPassword = document.getElementById('registerUserPassword').value;

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

		},
		error: function(xhr) {
			console.log(xhr)
		}
	});


}
