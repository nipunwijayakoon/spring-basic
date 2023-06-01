<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>new Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <style>
        .main {
            width: 100vw;
            height: 100vh;
            background-color: #ff1e8b;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .inner {

            width: 400px;
            height: auto;
            background-color: white;
            box-shadow: 5px 5px 5px black;
            border-radius: 3px;
            padding: 10px;

        }
    </style>
</head>
<body>
<form action="/submit" method="get">
    <div class="main">
        <div class="inner">
            <div class="form-group">
                <label for="customerEmail">Email</label>
                <input type="text" name="customerEmail"
                       placeholder="nimal@gmail.com" class="form-control" id="customerEmail">
            </div>
            <br>
            <button type="submit" class="btn btn-primary"> Register</button>
        </div>
    </div>
</form>
</body>
</html>