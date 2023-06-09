<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Login</h1>

		<%
		if (request.getParameter("error") != null && request.getParameter("error").equals("true")) {
		%>
		<div class="alert alert-danger" role="alert">Nome de usuário ou
			senha inválidos.</div>
		<%
		}
		%>

		<form action="login" method="post">
			<div class="form-group">
				<label for="username">Nome de usuário:</label> <input type="text"
					class="form-control" id="username" name="username" required>
			</div>
			<div class="form-group">
				<label for="password">Senha:</label> <input type="password"
					class="form-control" id="password" name="password" required>
			</div>
			<button type="submit" class="btn btn-primary">Entrar</button>
		</form>
	</div>

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
