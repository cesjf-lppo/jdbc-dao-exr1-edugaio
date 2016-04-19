
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Anuncios</title>
    </head>
    <body>
        <h1>Listar Anuncios</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Preço</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${anuncios}" var="anuncio">
                    <tr>
                        <td>${anuncio.id}</td>
                        <td>${anuncio.nome}</td>
                        <td>${anuncio.descricao}</td>
                        <td>${anuncio.preco}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="./novo-anuncio.html">Novo Anuncio</a> 
    </body>
</html>
