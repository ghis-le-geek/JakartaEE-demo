<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Veuillez vous authentifier</h1>

    <form method="post" action="hello-servlet">
        <table>
            <tr>
                <td><label for="login">Login: </label></td>
                <td><input type="text" name="login" id="login" value="${login}" autofocus /></td>
            </tr>
            <tr>
                <td><label for="pass">Mot de passe: </label></td>
                <td><input type="password" name="pass" id="pass" value="${pass}" /></td>
            </tr>
        </table>
        <button type="submit">Envoyer</button>
    </form>
</body>
</html>
