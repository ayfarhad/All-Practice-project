
<%@page import="in.embryo.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show All</title>
        <style>
            tr,td,th{
                padding: 10px;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <br><br><br>
   <div align="center">
        <%!
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
        %>
        <table border="1">
            <tr>
                <th>ID</th><th>Full Name</th><th>File Name</th><th>File Path</th><th>Added Date</th><th>Download</th>
            </tr>
            <%
            con = DB.getConnection();
            String sql = "select * from employee";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            %>
            <tr>
                <td ><%=rs.getInt(1)%></td>
                <td ><%=rs.getString(2) +" " + rs.getString(3)%></td>
                <td ><%=rs.getString(4).subSequence(0, 10)%></td>
                <td ><%=rs.getString(5).subSequence(0, 10)%></td>
                <td><%=rs.getTimestamp(6)%></td>
                <td><a href="DownloadServlet?fileName=<%=rs.getString(4)%>">Download</a></td>
            </tr>
            <%
                }
            %>
            
        </table><br>
        <a href="index.jsp">Home</a>
   </div>
    </body>
</html>
