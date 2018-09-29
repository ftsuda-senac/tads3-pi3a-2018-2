<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Cadastro de produto</h1>
        <div>
            <form action="${pageContext.request.contextPath}/produto/inclusao" method="post">
                <div>
                    <label>Nome</label>
                    <div>
                        <input type="text" name="nome" />
                    </div>
                </div>
               <div>
                    <label>Descrição</label>
                    <div>
                        <textarea name="descricao"></textarea>
                    </div>
                </div>
               <div>
                    <label>Preço compra</label>
                    <div>
                        <input type="text" name="prcompra" />
                    </div>
                </div>
               <div>
                    <label>Preço venda</label>
                    <div>
                        <input type="text" name="prvenda" />
                    </div>
                </div>
               <div>
                    <label>Quantidade</label>
                    <div>
                        <input type="text" name="qtd" />
                    </div>
                </div>
                <fieldset>
                    <legend>Disponível</legend>
                    <input type="radio" value="1" name="disp" id="disp1" /><label for="disp1">Sim</label>
                    <input type="radio" value="0" name="disp" id="disp0" /><label for="disp0">Não</label>
                </fieldset>
                
                <fieldset>
                    <legend>Categorias</legend>
                    <input type="checkbox" value="A" name="cat" /><label>Categoria A</label>
                    <input type="checkbox" value="B" name="cat" /><label>Categoria B</label>
                    <input type="checkbox" value="C" name="cat" /><label>Categoria C</label>
                </fieldset>
                <select name="sel">
                    <option>Sim</option>
                    <option>Não</option>
                </select>
                <button type="submit">Enviar</button>
                <button type="reset">Resetar dados</button>
            </form>
        </div>
        
    </body>
</html>
