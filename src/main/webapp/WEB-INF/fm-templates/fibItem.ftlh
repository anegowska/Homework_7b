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
<div class="container">
    <div class="login-form">
        <div class="main-div">
            <div class="panel">
                <h2>Fibonacci sequence generator</h2>
                <p>Enter the sequence element, that you want to calculate</p>
            </div>
            <form action="/fibonacci" method="post">

                <div class="form-group">

                    <label for="fibonacciItem"></label>
                    <input type="number" class="form-control" name="item" id="fibonacciItem" min="0" required>

                </div>

                <button type="submit" class="btn btn-primary">Calculate</button>

            </form>

</body>
</html>