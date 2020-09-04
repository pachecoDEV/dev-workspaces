<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/bootstrap.css" type="text/css">
<title>INICIO</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-light bg-light">
				<a class="nav-item nav-link" href="index.jsp">In�cio</a><!-- Aqui criamos as QueryStrings -->
				<a class="nav-item nav-link" href="montador?uri-img=um.jpg&url-img=./img/&wid-img=300px">Imagem-1</a>
				<a class="nav-item nav-link" href="montador?uri-img=dois.jpg&url-img=./img/&wid-img=300px">Imagem-2</a>
				<a class="nav-item nav-link" href="montador?uri-img=tres.jpg&url-img=./img/&wid-img=300px">Imagem-3</a>
				<a class="nav-item nav-link" href="montador?uri-img=quatro.jpg&url-img=./img/&wid-img=300px">Imagem-4</a>
				<a class="nav-item nav-link" href="montador?uri-img=cinco.jpg&url-img=./img/&wid-img=300px">Imagem-5</a>
		</nav>
	</header>
	<div></div>
	<section>
		<figure>
								<!-- E aqui adicionamos os atributos enviados pela Servlet, os atributos criados no Request -->
								<!-- Recuperamos com Scriptlets ou Expressions, no caso aqui estamos recuperando com expression -->
								<!-- As expression apenas funcionam com m�todos que retornam informa��es.-->
			<img alt="" width="<%=request.getAttribute("attrWidImg")%>" title="" src="<%=request.getAttribute("attrSrcImg")%>">
			<figcaption></figcaption>
		</figure>
	</section>
	<footer></footer>
		<script type="text/javascript" src="./js/jquery-3.5.1.min.js"></script>
		<script type="text/javascript" src="./js/bootstrap.js"></script>
	
</body>
</html>