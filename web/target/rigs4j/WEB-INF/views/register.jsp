<%@ page session="false" %>

<form action="/adduser" method="post" enctype="application/x-www-form-urlencoded">

    <p>Register New User</p>
    <div class="form-group">
        <label for="username">Name:</label>
        <input type="text" class="form-control" name="username">
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" name="password">
    </div>

    <input type="submit" class="btn btn-default" data-dismiss="modal" value="submit">
</form>