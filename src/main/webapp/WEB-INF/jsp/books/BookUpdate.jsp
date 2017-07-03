<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Book</title>
</head>
<body>

<form action="Book/addbook" method=POST></form>
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
									<h4>Latest Updates</h4>
								</div>
							</div>
							<div class="portlet-body">
								<form id="addBookFrm" class="form-horizontal" role="form"
									method="POST" action="addbook">
									<div class="form-group">
										<label for="id">ID:</label><input type="id"
											class="form-control" name="id" required="required"
											id="id" />
									</div>
									<div class="form-group">
										<label for="title">TITLE:</label><input type="text"
											class="form-control" name="title" required="required"
											id="title" />
									</div>
									
									<div class="form-group">
										<label for="author">AUTHOR:</label><input type="text"
											class="form-control" name="author" required="required"
											id="author" />
									</div>
									
									<div class="form-group">
										<label for="publishdate">PUBLISHDATE:</label><input type="date"
											class="form-control" name="publishdate" required="required"
											id="publishdate" />
									</div>
									
									<div class="form-group">
										<label for="content">CONTENT:</label><input type="text"
											class="form-control" name="content" required="required"
											id="content" />
									</div>
									

									<div class="form-group">
										<label for="price">PRICE:</label><input type="price"
											class="form-control" name="price" required="required"
											id="price" />
									</div>

									<div class="form-group">
										<label for="status">STATUS:</label><input type="text"
											class="form-control" name="status" required="required"
											id="status" />
									</div>
									
									<div class="form-group">
										<button type="submit" class="btn btn-success" id="addBookBtn">ADD
											BOOK</button>
									</div>
									<hr />
									
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