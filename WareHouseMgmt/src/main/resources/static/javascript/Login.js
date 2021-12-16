/**
 * 
 */

var UserRole;

/**
 * Initializer function
 */
function init(){
renderLoginModal()

}


function renderLoginModal(){

var elem =`<button type="button" id="btn_Modal" style="display:none" class="btn btn-primary" data-bs-target="#loginModal" data-bs-toggle="modal"></button>`;

document.body.innerHTML=document.body.innerHTML + elem;

document.getElementById('btn_Modal').click();
}




function validateLogin(){

}

function selectUserRole(role){
UserRole=role;
if(role==1){
document.getElementById('dd_UserRole').innerHTML = "Admin";
}
else{
document.getElementById('dd_UserRole').innerHTML = "Staff";
}


}


function createUser(){

alert(UserRole)


}
