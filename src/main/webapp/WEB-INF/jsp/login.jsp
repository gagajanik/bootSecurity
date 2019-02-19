<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method="post">
USER: <input type="text" name="username">
password: <input type="text" name="password">
    <input type="submit" value="submit">
</form>
</body>
</html>