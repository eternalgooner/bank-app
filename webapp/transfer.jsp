<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="fonts/iconic/css/material-design-iconic-font.min.css">
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="css/sb-admin.css" rel="stylesheet">
</head>
<body>


	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top"
		id="mainNav">
		<a class="navbar-brand txt2" href="home.jsp">Abank</a>

		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Dashboard"><a class="nav-link txt2" href="home.jsp">
						<i class="fa fa-fw fa-dashboard"></i> <span class="nav-link-text">Dashboard</span>
				</a></li>


				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Components"><a
					class="nav-link nav-link-collapse collapsed txt2"
					data-toggle="collapse" href="#collapseComponents"
					data-parent="#exampleAccordion"> <i class="fa fa-fw fa-wrench"></i>
						<span class="nav-link-text">Transactions</span>
				</a>
					<ul class="sidenav-second-level collapse" id="collapseComponents">
						<li><a class="txt2" href="logment.jsp">logment</a></li>
						<li><a class="txt2" href="transfer.jsp">transfer</a></li>
						<li><a class="txt2" href="withdraw.jsp">withdraw</a></li>
					</ul></li>

				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Tables"><a class="nav-link txt2" href="history.jsp">
						<i class="fa fa-fw fa-table"></i> <span class="nav-link-text">History</span>
				</a></li>

				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Charts"><a class="nav-link txt2" href="balance.jsp">
						<i class="fa fa-fw fa-area-chart"></i> <span class="nav-link-text">balance</span>
				</a></li>


				<li class="nav-item"><a class="nav-link txt2"
					data-toggle="modal" data-target="#exampleModal"> <i
						class="fa fa-fw fa-sign-out"></i>Logout
				</a></li>


			</ul>
			<ul class="navbar-nav sidenav-toggler">
				<li class="nav-item"><a class="nav-link text-center"
					id="sidenavToggler"> <i class="fa fa-fw fa-angle-left"></i>
				</a></li>
			</ul>

		</div>
	</nav>

	<div class="content-wrapper">
		<div class="container-fluid">
			<!-- Breadcrumbs-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
				<li class="breadcrumb-item active">My Dashboard</li>
			</ol>



			<div class="row">
				<div class="col-12">
					<form>

						<div class="form-group">
							<label for="exampleFormControlSelect1">Select Account</label> <select
								class="form-control" id="exampleFormControlSelect1">
								<option>Current</option>
								<option>Savings</option>
							</select> <br />
							<div class="wrap-input100 rs1-wrap-input100 validate-input"
								data-validate="Name is required">
								<span class="label-input100">Ammount</span> <input
									class="input100" type="text" name="name"
									placeholder="Enter Ammount">
							</div>
						</div>
						
						
							<h4>To Account</h4>


								<div class="wrap-input100 rs1-wrap-input100 validate-input"
									data-validate="Name is required">
									<span class="label-input100">Account</span> <input
										class="input100" type="text" name="name"
										placeholder="Enter Ammount">
								</div>
								
						<a class="btn btn-primary" href="#">Submit</a>
					</form>
				</div>
			</div>
		</div>




		<!-- Logout Modal-->
		<div class="modal fade container-login100" id="exampleModal"
			tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
			aria-hidden="true">
			<div class="modal-dialog wrap-login100" role="document">
				<!-- <div class="modal-content wrap-login100"> -->
				<!--   <div class="modal-header wrap-login100"> -->
				<span class="login100-form-title p-b-26"> Thank you for using
					Abank </span> <span class="login100-form-title p-b-48"> <i
					class="zmdi zmdi-font"></i>
				</span>

				<div class="modal-body">Select "Logout" below to terminate
					session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>

					<a class="btn btn-primary" href="logout.html">Logout</a>
				</div>
			</div>
		</div>

	</div>
	</div>





	<script src="js/sb-admin.min.js"></script>
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<script src="js/main.js"></script>

</body>
</html>