<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.0/font/bootstrap-icons.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">

</head>
<body onload="init()">



	<!-- 	<section>
		<container> navigation bar
		<nav class="navbar navbar-expand-sm navbar-light bg-light">
			<div class="container-fluid">
				<span class="navbar-brand mb-0 h1">Title of website</span>
				we can add logo in img
				<img class="d-inline-block align-top" src="" width="" height="">
				ITS A MENU BUTTON AND WHEN A SCREEN REDUCES TO SMALL OR MOBILE SIZE(BREAK POINT) ALL THE ITEMS ARE AUTOMATICAALY LISTED UNDER THE MENU
				<button type="button" data-bs-toggle="collapse"
					data-bs-target="#navigationbar" class="navbar-toggler">
					MENU</button>
				ITEMS OF NAVIGATION BAR
				<div class="collapse navbar-collapse" id="navigationbar">
					<ul class="navbar-nav ms-auto">
						<li class="nav-item "><a href="" class="nav-link active">Item
								1</a></li>
						<li class="nav-item "><a href="" class="nav-link active">item
								2</a></li>
						<li class="nav-item "><a href="" class="nav-link active">item
								3</a></li>
						<li class="nav-item"><a href="" class="nav-link active">item
								4</a></li>
						<li class="nav-item"><a href="" class="nav-link active">item
								5</a></li>
						<li class="nav-item"><a href="" class="nav-link">Logout</a></li>
					</ul>
				</div>
		</nav>

		</container>
	</section> -->

	<jsp:include page="Header.jsp" />



	<section>

		<!--three containers using grid-->
		<div class="container-fluid" id="three container">

			<!-- 					<div class="col-lg-2" id="container one">
												<div class="p-5 bzg-primary text-light">COL 1</div>
					</div> -->



			<div class="text-center">
				<div class="p-3">

					<p>
						<button class="btn btn-primary" type="button"
							data-bs-toggle="collapse" data-bs-target="#bucket"
							aria-expanded="false" aria-controls="bucket">+ Add Order
						</button>
					</p>
					<div class="collapse" id="bucket">
						<div class="card card-body">
							<div class="row m-3">
								<div class="col-lg-5">
									<select class="form-select" size="5" multiple
										style="width: 100%; height: 100%;" Place an
										order" id="sl_products">

									</select>
								</div>
								<div class="col-lg-2"
									style="display: table-cell; vertical-align: middle; text-align: center;">
									<button class="btn btn-secondary btn-sm"
										onclick="addToBucket()" style="display: inline-block;">==>></button>
								</div>
								<div class="col-lg-auto"
									style="width: 40%; height: 40%; overflow: scroll; min-height: 150px; max-height: 300px">
									<div class="row" style="text-align: justify">
										<div class="col-8">Product Name</div>
										<div class="col-4">Quantity</div>
									</div>
									<ul class="list-group list-group-flush"
										id="ul_selectedProducts" style="text-align: center">

									</ul>

								</div>
							</div>
							<div class="row">
							<div class="col-3"></div>
								<div class="col">
									<div class="dropdown">
										<button class="btn btn-primary dropdown-toggle"
											type="button" id="dd_customer" data-bs-toggle="dropdown"
											aria-expanded="false">Choose Customer</button>
										<ul class="dropdown-menu" aria-labelledby="dd_StorageType"
											id="ul_customer">

										</ul>
									</div>
								</div>
								<div class="col">
									<button class="btn btn-primary" onclick="addOrder()">+
										Confirm Order</button>
								</div>
								<div class="col-3"></div>
							</div>
						</div>
					</div>






				</div>
			</div>
			<!-- 					<div class="col-lg-2" id="container three">
												<div class="p-5 bg-primary text-light">COL 3</div>
					</div> -->

		</div>

	</section>



	<section>
		<div class="container-fluid p-5">

			<div class="row"></div>
			<div class="row">
				<div class="col" id="dt_Orders"></div>

			</div>

		</div>
	</section>

	<section>

		<div class="modal" tabindex="-1" id="md_ProductList">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Ordered Product List</h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<div id="tb_ProductList">
							<table class="table">
								<thead>
									<tr>
										<th scope="col">Sr. No.</th>
										<th scope="col">Product Name</th>
										<th scope="col">No. of Units</th>
										<th scope="col">Quantity Per Unit</th>
										<th scope="col">Price (&euro;)</th>
									</tr>
								</thead>
								<tbody id="tb_body">

								</tbody>
							</table>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>

	</section>



	<script src="https://code.jquery.com/jquery-3.6.0.js"
		integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>

	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.6.2/chart.min.js"></script>

	<script src="../javascript/Order.js"></script>

</body>
</html>