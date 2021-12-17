function countries_code() {
    var val= document.getElementById("countries").value;
    if (val==="select country") {
        document.getElementById("phone-no").value= "";
    }
    else if (val==="US") {
        document.getElementById("phone-no").value= "+1";
    }
    else if (val==="JP") {
        document.getElementById("phone-no").value= "+81";
    }
    else if (val==="IN") {
        document.getElementById("phone-no").value= "+91";
    }
    else if (val==="BR") {
        document.getElementById("phone-no").value= "+55";
    }
    else if (val==="IE") {
        document.getElementById("phone-no").value= "+353";
    }
    else if (val==="CN") {
        document.getElementById("phone-no").value= "+86";
    }
    else if (val==="IT") {
        document.getElementById("phone-no").value= "+39";
    }
    else if (val==="FR") {
        document.getElementById("phone-no").value= "+33";
    }
}

