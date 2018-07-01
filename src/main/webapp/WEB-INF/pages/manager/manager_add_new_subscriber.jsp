<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="../../css/main.css" />
</head>

<body>
    <div class="container">
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ///////////////////////////////////HEADER//////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->

        <div class="header">
            <div class="logo">
                <p>Yadmal</p>
                <p>Systems</p>
            </div>
            <div class="userHeaderInfo">
                <p>ManagerName</p>
                <p>ManagerSurename</p>
                <form action="">
                    <input type="submit" name="submit" value="Exit">
                </form>
            </div>

        </div>
        <div class="menu">
            <ul>
                <li><a href="#">Add New Subscriber</a></li>
                <li><a href="manager_work_with_db.html">Work With Active Subscriber</a></li>
            </ul>

        </div>
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ////////////////////////////////////CONTENT//////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <div class="content">
            <h1>NEW SUBSCRIBER</h1>
            <div class="subscriberForm">
                <form action="">
                    <p>Name:</p>
                    <input type="text" name="name" size="25">
                    <p>Surename:</p>
                    <input type="text" name="name" size="25">
                    <p>Date of Birth:</p>
                    <input type="date" name="DateOfBirth">
                    <p>Passport ID:</p>
                    <input type="number" name="passportId" size="18">
                    <p>Passport Data:</p>
                    <textarea name="text-field" id="PassportData" cols="30" rows="10" maxlength="300"></textarea>
                    <p>Address:</p>
                    <textarea name="text-field" id="Address" cols="30" rows="10" maxlength="300"></textarea>
                    <p>email:</p>
                    <input type="email" name="email">
                    <p>Password:</p>
                    <input type="password" name="password"> <br>


                    <table class="chooseTariff">
                        <tr>
                            <th>Tariff</th>
                            <th>Connect options</th>
                        </tr>
                        <tr>
                            <td>Tariff title
                                <p><input type="radio" name="tariff" value="tarifId"> </p>
                            </td>
                            <td>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 1</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 2</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 3</p>
                            </td>
                        </tr>
                        <tr>
                            <td>Tariff title
                                <p><input type="radio" name="tariff" value="tarifId"> </p>
                            </td>
                            <td>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 1</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 2</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 3</p>
                            </td>
                        </tr>
                        <tr>
                            <td>Tariff title
                                <p><input type="radio" name="tariff" value="tarifId"> </p>
                            </td>
                            <td>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 1</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 2</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 3</p>
                            </td>
                        </tr>
                        <tr>
                            <td>Tariff title
                                <p><input type="radio" name="tariff" value="tarifId"> </p>
                            </td>
                            <td>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 1</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 2</p>
                                <p><input type="checkbox" name="optionId" value="optionId"> Option 3</p>
                            </td>
                        </tr>

                    </table>
                    <input type="submit" name="submit" value="Save">
                </form>
            </div>


        </div>


        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ////////////////////////////////////FOOTER///////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <div class="footer">

        </div>
    </div>

</body>

</html>
