<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Anuncio</title>
    </head>
    <body>
        <h1>Novo Anuncio</h1>
        <form method="post">
            <div>
                <label>Nome:
                <input type="text" name="nome" />
                </label>
            </div>
            <div>
                <label>Descrição:
                    <input type="text" name="descricao" />
                </label>
            </div>
            <div>
                <label>Preço:
                    <input type="text" name="preco" />
                </label>
            </div>
            <div>
                <input type="submit" />
            </div>
        </form>
        <a href="./listar-anuncios.html">Lista de Anuncios</a> 
    </body>
</html>
