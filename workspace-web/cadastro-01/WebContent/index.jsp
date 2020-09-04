<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/bootstrap.css">

<title>CADASTRO</title>

</head>
<body>

	<header>
		<nav></nav>
	</header>

	<div></div>

	<section>
		<form>
			<fieldset>
				<legend>Cadastro de Clientes</legend>
				
				<div class="form-group">
					<label class="control-label col-sm-4" for="idNm">Nome</label>
					<div class="col-sm-8">
						<input type="text" name="txtNm" id="idNm" class="form-control"
							placeholder="Digite seu nome." required="required">
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-4" for="idSnm">Sobrenome</label>
					<div class="col-sm-8">
						<input type="text" name="txtSnm" id="idSnm" class="form-control"
							placeholder="Digite seu sobrenome." required="required">
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-4" for="idDtNasc">Data Nascimento</label>
					<div class="col-sm-8">
						<input type="date" name="txtDtNasc" id="idDtNasc" class="form-control" required="required">
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-4" for="idGen">G�nero</label>
					<div class="col-sm-8">
						<select name="txtGen" id="idGen" class="form-control" required="required">
							<option value="0" selected="selected">Selecione sua op��o</option>
							<option value="m">Masculino</option>
							<option value="f">Feminino</option>
							<option value="o">Outros</option>
						</select>
					</div>
				</div>
				
			</fieldset>
		</form>
	</section>

	<footer></footer>

	<script type="text/javascript" src=".js/jquery-3.5.1.js"></script>
	<script type="text/javascript" src=".js/bootstrap.js"></script>
</body>
</html>