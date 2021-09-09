<%@page import="ctr.ProdutoProcess"%>
<%@page import="vo.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="crud.css">
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>CRUD</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		String cod = request.getParameter("cod");
		String nome = request.getParameter("nome");
		String preco = request.getParameter("preco");
		String qtde = request.getParameter("qtde");
		String ctr = request.getParameter("ctr");
		Produto prod;
	%>
	
	<form method="post">
		<input type="text" placeholder="cod" name="cod" id="cod" required>
		<input type="text" placeholder="nome" name="nome" id="nome" required>
		<input type="text" placeholder="preco" name="preco" id="preco" required>
		<input type="number" placeholder="qtde" name="qtde" id="qtde" required>
		<input type="hidden" value=0 name="ctr" id="ctr">
		<button type="submit" id="btn-submit">Salvar</button>
	</form>
	
	<table >
		<thead>
			<tr>
				<th>Codigo</th>
				<th>Nome</th>
				<th>Preço</th>
				<th>Quantidade</th>
				
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<%
				ProdutoProcess.abrir();
				for(Produto p: ProdutoProcess.produtos){
					out.print(p.toHtml());
				}
			%>
		</tbody>
	</table>
	
	<%
		if(cod != null && nome != null && preco != null && qtde != null){
			prod = new Produto(cod, nome, preco,qtde);
			switch(ctr){
			case "0":
				ProdutoProcess.cadastrar(prod);
				response.sendRedirect("crud.jsp");
				break;
			case "1":
				ProdutoProcess.remover(prod);
				response.sendRedirect("crud.jsp");
				break;
			case "2":
				ProdutoProcess.editar(prod);
				response.sendRedirect("crud.jsp");
				break;
			}
		}
	%>
</body>
<script src="crud.js"></script>
</html>