
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet File Upload/Download</title>
    </head>
    <body>
        <br><br><br><br>
  <div align="center">
        
        <form action="UploadServlet" method="post" enctype="multipart/form-data">
            <table  border="1">
                <tr>
                    <td align="center" colspan="2">Form Details</td>
                </tr>
                <tr>
                    <td>First Name </td>
                    <td>
                        <input type="text" required="required" name="firstname">
                    </td>
                </tr>
                <tr>
                    <td>Last Name </td>
                    <td>
                        <input type="text" required="required" name="lastname">
                    </td>
                </tr>
                <tr>
                    <td>Select File </td>
                    <td>
                        <input type="file" required="required" name="file">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>

        </form>
        <br><a href = "file-list.jsp">View List</a>
    </div>
</body>
</html>

