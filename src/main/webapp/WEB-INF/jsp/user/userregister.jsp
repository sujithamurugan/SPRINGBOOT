<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="User/loginuser" method=POST></form>
<div class="wrapper">
		<div><%@ include file="../layout/sidebar.jsp"%></div>
		<div class="main-panel">

			<div><%@ include file="../layout/header.jsp"%></div>
			<div align="center"></div>
			<div class="content">
				<div class="container-fluid">

					<div class="row">
						<div class="col-md-3">

							<div class="portlet-title">
								<div class="page-header">
									<h4>Create a New Account</h4>
								</div>
							</div>
							<div class="portlet-body">
								<form id="addUserFrm" class="form-horizontal" role="form"
									method="POST" action="loginuser">
									<div class="form-group">
										<label for="id">ID:</label><input type="id"
											class="form-control" name="id" required="required"
											id="id" />
									</div>
									<div class="form-group">
										<label for="name">NAME:</label><input type="text"
											class="form-control" name="name" required="required"
											id="name" />
									</div>
									
									<div class="form-group">
										<label for="username">USERNAME:</label><input type="text"
											class="form-control" name="username" required="required"
											id="username" />
									</div>
									
									<div class="form-group">
										<label for="password">PASSWORD:</label><input type="password"
											class="form-control" name="password" required="required"
											id="password" />
									</div>
									
									<div class="form-group">
										<label for="mobileno">MOBILENO:</label><input type="mobileno"
											class="form-control" name="mobileno" required="required"
											id="mobileno" />
									</div>
									

									<div class="form-group">
										<label for="emailid">EMAILID:</label><input type="email"
											class="form-control" name="emailid" required="required"
											id="emailid" />
									</div>

									<div class="form-group">
										<label for="active">ACTIVE:</label><input type="text"
											class="form-control" name="active" required="required"
											id="active" />
									</div>
									<div class="form-group">
										<label for="role">ROLE:</label><input type="text"
											class="form-control" name="role" required="required"
											id="role" />
									
									<div class="form-group">
										<button type="submit" class="btn btn-success" id="addUserBtn">Create
											Account</button>
									
									<hr />
									<div>
									<div class="form-group">
										Already have an account? &nbsp;&nbsp; <a href="loginpage"
											class='btn btn-primary'> SIGN IN</a>
									</div>
									</div>
								</form>

							</div>


						</div>

					</div>
				</div>

			</div>

		</div>
	</div>

</body>
</html>