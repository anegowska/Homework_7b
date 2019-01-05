<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset=utf-8">

    <title>Fibonacci</title>

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link href="bootstrap.css" rel="stylesheet">

</head>
<body id="LoginForm">

    <h1>Fibonacci sequence</h1><br/>
    <h2>The element that you have chosen = <strong>${itemParam}</strong></h2>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Fibonacci</th>

        </tr>
        </thead>
        <tbody>
        <#list fibList as number>
            <tr>
                <td>${number}</td>

            </tr>
        </#list>
        </tbody>
    </table>

</body>
</html>
