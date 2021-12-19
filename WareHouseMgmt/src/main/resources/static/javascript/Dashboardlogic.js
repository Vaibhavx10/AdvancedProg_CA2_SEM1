//Dashboard logicall Page

function initialize(xAxis, yAxis) {
	checkUserSession();
	loadProductAddedPerDay(xAxis, yAxis);
	loadShipmentInfo(shipmentJSONData);
}

function checkUserSession() {
	var userData = JSON.parse(sessionStorage.getItem("userData"));
	if (userData == null) {
		alert("Session is Expired Please login again");
		window.location.href = `/`;
	}
}


function loadProductAddedPerDay(xAxis, yAxis) {
	var ctx = document.getElementById('myChart');
	var myChart = new Chart(ctx,
		{
			type: 'line',
			data: {
				labels: xAxis,
				datasets: [{
					label: 'Product Added in WareHouse As Per Date',
					data: yAxis,
					backgroundColor: ['rgba(255, 99, 132, 0.2)',
						'rgba(54, 162, 235, 0.2)',
						'rgba(255, 206, 86, 0.2)',
						'rgba(75, 192, 192, 0.2)',
						'rgba(153, 102, 255, 0.2)',
						'rgba(255, 159, 64, 0.2)'],
					borderColor: ['rgba(255, 99, 132, 1)',
						'rgba(54, 162, 235, 1)',
						'rgba(255, 206, 86, 1)',
						'rgba(75, 192, 192, 1)',
						'rgba(153, 102, 255, 1)',
						'rgba(255, 159, 64, 1)'],
					borderWidth: 1
				}]
			},
			options: {
				scales: {
					y: {
						beginAtZero: true
					}
				}
			}
		});


}


//This method is used to set data when the more info iteam is clicked on table 
function assignElementsInsideExpand(d) {
	var shipmentAddressXML = d.shipmentAddress;

	var domParser = new DOMParser();
	var doc = domParser.parseFromString(shipmentAddressXML, "text/xml")

	return '<br> Shipment Address is as follows :: <br>' +
		'AddressLine: ' + doc.getElementsByTagName("AddressLine")[0].childNodes[0].nodeValue + '<br>' +
		'City: ' + doc.getElementsByTagName("City")[0].childNodes[0].nodeValue + '<br>' +
		'State: ' + doc.getElementsByTagName("State")[0].childNodes[0].nodeValue + '<br>' +
		'Country: ' + doc.getElementsByTagName("Country")[0].childNodes[0].nodeValue + '<br>' +
		'Shipment Status: ' + '<h4 style="color: red;">' + d.shipmentStatus.shipmentStatusDescription + '</h4>';

}

function loadShipmentInfo(shipmentJSONData) {

	var dt = $('#example').DataTable({
		"data": shipmentJSONData,
		"columns": [
			{
				"class": "details-control",
				"orderable": false,
				"data": null,
				"defaultContent": ""
			},
			{ "data": "shipmentId" },
			{ "data": "shipmentDate" },
			{ "data": "shipmentStatus.shipmentStatusDescription" }
		],
		"order": [[1, 'asc']]
	});

	// Array to track the ids of the details displayed rows
	var detailRows = [];

	$('#example tbody').on('click', 'tr td.details-control', function() {
		var tr = $(this).closest('tr');
		var row = dt.row(tr);
		var idx = $.inArray(tr.attr('id'), detailRows);

		if (row.child.isShown()) {
			tr.removeClass('details');
			row.child.hide();

			// Remove from the 'open' array
			detailRows.splice(idx, 1);
		}
		else {
			tr.addClass('details');
			row.child(assignElementsInsideExpand(row.data())).show();

			// Add to the 'open' array
			if (idx === -1) {
				detailRows.push(tr.attr('id'));
			}
		}
	});

	// On each draw, loop over the `detailRows` array and show any child rows
	dt.on('draw', function() {
		$.each(detailRows, function(i, id) {
			$('#' + id + ' td.details-control').trigger('click');
		});
	});
}

