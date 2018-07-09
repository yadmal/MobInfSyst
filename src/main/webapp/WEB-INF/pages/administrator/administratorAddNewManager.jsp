<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Starter Template for Bootstrap 4.1.1</title>
  <link rel="shortcut icon" href="">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap-theme.min.css">
  <style>
    body {
      padding-top: 50px;
    }

    .starter-template {
      padding: 40px 15px;
      text-align: center;
    }
  </style>
  <!--[if IE]>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="bg-dark border-secondary">
  <div class="">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-3 text-center text-uppercase align-self-center">
          <h1 class="text-light bg-secondary">YADMAL
            <br>SYSTEMS</h1>
        </div>
        <div class="col-md-3"></div>
        <div class="col-md-3"></div>
        <div class="col-md-3 border-secondary text-center">
          <form class="text-center text-light border" action="">
            <div class="form-group row">
              <label for="staticName" class="col-form-label col-sm-6 col-4 text-center">Name:</label>
              <div class="col-sm-6 col-4">
                <input type="text" readonly="" class="form-control-plaintext text-light text-center" id="staticName" value="Ivan"> </div>
            </div>
            <div class="form-group row">
              <label for="staticSurename" class="col-form-label col-sm-6 col-4 text-center">SureName:</label>
              <div class="col-sm-6 col-4">
                <input type="text" readonly="" class="form-control-plaintext text-light text-center" id="staticSurename" value="Ivanov"> </div>
            </div>
            <button type="submit" class="btn btn-sm btn-block btn-warning">Exit</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  <div class="">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-12 py-2">
          <ul class="nav nav-pills justify-content-around bg-dark text-light py-3">
            <li class="nav-item text-uppercase text-light">
              <a class="nav-link text-light" href="administratorAddNewOption.html">add option
                <br> </a>
            </li>
            <li class="nav-item text-uppercase text-light">
              <a class="nav-link text-light" href="administratorAddNewTariff.html">add tariff
                <br> </a>
            </li>
            <li class="nav-item text-uppercase text-light">
              <a class="nav-link text-light active" href="administratorAddNewManager.html">add new manager
                <br> </a>
            </li>
            <li class="nav-item text-uppercase text-light">
              <a class="nav-link text-light" href="administratorEditOption.html">option list
                <br> </a>
            </li>
            <li class="nav-item text-uppercase text-light">
              <a class="nav-link text-light" href="administratorEditTariff.html">tariff list
                <br> </a>
            </li>
          </ul>
        </div>
      </div>
      <div class="row bg-secondary m-1"> </div>
    </div>
  </div>
  <div class="p-0 bg-secondary">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <h1 class="text-dark text-center text-uppercase">add new mamager</h1>
        </div>
      </div>
    </div>
    <div class="container-fluid">
      <div class="row justify-content-center">
        <div class="col-md-6 py-1">
          <form>
            <div class="form-row">
              <div class="form-group col-md-6">
                <label for="inputName">Name</label>
                <input type="text" class="form-control" id="inputName" placeholder="Name"> </div>
              <div class="form-group col-md-6">
                <label for="inputSurname">Surname</label>
                <input type="text" class="form-control" id="inputSurname" placeholder="Surname"> </div>
            </div>
            <div class="form-row">
              <div class="form-group col-md-6">
                <label for="inputPassportNumber">Passport's number</label>
                <input type="number" class="form-control" id="inputPassportNumber" placeholder="Passport's number"> </div>
              <div class="form-group col-md-6">
                <label for="inputPassportData">Passport's data</label>
                <input type="text" class="form-control" id="inputPassportData" placeholder="Passport's data"> </div>
            </div>
            <div class="form-group">
              <label for="inputAddress">Address</label>
              <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St"> </div>
            <div class="form-row">
              <div class="form-group col-md-6">
                <label for="inputEmail4">Email</label>
                <input type="email" class="form-control" id="inputEmail4" placeholder="Email"> </div>
              <div class="form-group col-md-6">
                <label for="inputPassword4">Password</label>
                <input type="password" class="form-control" id="inputPassword4" placeholder="Password"> </div>
            </div>
            <div class="form-group">
              <label for="example-date-input" class="col-xs-2 col-form-label">Date of birth</label>
              <div class="col-xs-10">
                <input class="form-control" type="date" value="2011-08-19" id="example-date-input"> </div>
            </div>
            <button type="submit" class="btn text-center text-uppercase btn-block btn-success">save</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  <div class="bg-dark text-white py-2">
    <div class="container">
      <div class="row">
        <div class="col-md-6 text-center align-self-center">
          <p class="mb-5">
            <strong>Pingendo Inc.</strong>
            <br>795 Folsom Ave, Suite 600
            <br>San Francisco, CA 94107
            <br>
            <abbr title="Phone">P:</abbr> (123) 456-7890 </p>
          <div class="my-3 row">
            <div class="col-4">
              <a href="https://www.facebook.com" target="_blank">
                <i class="fa fa-3x fa-facebook"></i>
              </a>
            </div>
            <div class="col-4">
              <a href="https://twitter.com" target="_blank">
                <i class="fa fa-3x fa-twitter"></i>
              </a>
            </div>
            <div class="col-4">
              <a href="https://www.instagram.com" target="_blank">
                <i class="fa fa-3x fa-instagram"></i>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-6 p-0"></div>
      </div>
    </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:250px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;
    <img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16">
  </pingendo>
</body>

</html>