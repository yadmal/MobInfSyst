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
                <li><a href="manager_add_new_subscriber.html">Add New Subscriber</a></li>
                <li><a href="#">Work With Active Subscriber</a></li>
            </ul>

        </div>
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ////////////////////////////////////CONTENT//////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <div class="content">
            <h1>USERS ARCHIVE</h1>
            <div class="fromDb">
                <form class="findUser" action="">
                    Search: <input type="text" name="theme" size="50" placeholder="Enter phone number">
                    <input type="submit" name="submit" value="Search">
                </form>
                <form class="loadAll" action="">
                    <input type="submit" name="submit" value="Load all">
                </form>
            </div>

            <table class="contractInfo">
                <tr>
                    <th>Contract</th>
                    <th>Tariff</th>
                    <th>Connected options</th>
                    <th>Change tariff</th>
                    <th>Add options</th>
                    <th>Status</th>
                    <th>Block/Unblock</th>
                </tr>
                <tr>
                    <td>123456789</td>
                    <td>Tariff</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Unde totam saepe, ducimus doloribus, minima quam facilis dicta recusandae tenetur labore corporis tempore cumque magni eum voluptatum perferendis deleniti dolorem incidunt!</td>
                    <th><a href="manager_change_tariff.html">Change tariff</a></th>
                    <th><a href="manager_change_options.html">Add options</a></th>
                    <th>Active</th>
                    <th><a href="#">Block/Unblock</a></th>
                </tr>
                <tr>
                    <td>123456789</td>
                    <td>Tariff</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste aspernatur eum eius iure nulla. Recusandae temporibus, saepe, aspernatur ratione voluptatem unde laborum amet quo dolor autem vitae eveniet optio eligendi.</td>
                    <th><a href="manager_change_tariff.html">Change tariff</a></th>
                    <th><a href="manager_change_options.html">Add options</a></th>
                    <th>Blocked</th>
                    <th><a href="">Block/Unblock</a></th>
                </tr>
            </table>
        </div>
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ////////////////////////////////////FOOTER///////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <div class="footer">
        </div>
    </div>
</body>

</html>
