<%-- 
    Document   : exibePedido
    Created on : 24/05/2018, 01:53:42
    Author     : Marciano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exibe Pedido</title>
    </head>
    <body>
        <h4>Resumo do Pedido: </h4>
        Nome da pizza: ${produto.nome}<br>
        Valor: ${produto.preco}<br>
        Endereço de Entrega: ${cliente.endereco}<br>
        
        
    </body>
</html>
