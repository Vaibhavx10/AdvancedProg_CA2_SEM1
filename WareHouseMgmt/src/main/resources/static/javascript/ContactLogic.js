function countries_code() {
    var val= document.getElementById("countries").value;
    if (val==="select country") {
        document.getElementById("telephone-number").value= "";
    }
    else if (val==="US") {
        document.getElementById("telephone-number").value= "+1";
    }
    else if (val==="JP") {
        document.getElementById("telephone-number").value= "+81";
    }
    else if (val==="IN") {
        document.getElementById("telephone-number").value= "+91";
    }
    else if (val==="BR") {
        document.getElementById("telephone-number").value= "+55";
    }
    else if (val==="IE") {
        document.getElementById("telephone-number").value= "+353";
    }
    else if (val==="CN") {
        document.getElementById("telephone-number").value= "+86";
    }
    else if (val==="IT") {
        document.getElementById("telephone-number").value= "+39";
    }
    else if (val==="FR") {
        document.getElementById("telephone-number").value= "+33";
    }
}