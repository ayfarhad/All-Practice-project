package in.embryo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "UploadServlet", urlPatterns = { "/UploadServlet" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
		maxFileSize = 1024 * 1024 * 1000, // 1 GB
		maxRequestSize = 1024 * 1024 * 1000) // 1 GB
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	PrintWriter out = null;
	Connection con = null;
	PreparedStatement ps = null;
	HttpSession session = null;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		try {
			out = response.getWriter();
			session = request.getSession(false);
			String folderName = "resources";
			// String uploadPath = request.getServletContext().getRealPath("") +
			// File.separator + folderName;

			String uploadPath = request.getServletContext().getRealPath("") + folderName;
			File dir = new File(uploadPath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			Part filePart = request.getPart("file"); // Textbox value of name file.
			String firstName = request.getParameter("firstname");// Textbox value of name firstname.
			String lastName = request.getParameter("lastname");// Textbox value of name lastname.
			String fileName = filePart.getSubmittedFileName();
			String path = folderName + File.separator + fileName;
			Timestamp added_date = new Timestamp(System.currentTimeMillis());
			System.out.println("fileName: " + fileName);
			System.out.println("Path: " + uploadPath);
			System.out.println("Name: " + firstName);
			InputStream is = filePart.getInputStream();
			Files.copy(is, Paths.get(uploadPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING);

			try {
				con = DB.getConnection();
				System.out.println("connection done");

				Statement statement = con.createStatement();
				ResultSet resultSet = statement.executeQuery("select nvl(max(id)+1,1) eid from employee");
				int id = 0;
				if (resultSet.next()) {
					id = resultSet.getInt("eid");
					System.out.println("eid is : " + id);
				}
				String sql = "insert into employee(id, firstname,lastname,filename,path,added_date) values(?,?,?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setInt(1, id);
				ps.setString(2, firstName);
				ps.setString(3, lastName);
				ps.setString(4, fileName);
				ps.setString(5, path);
				ps.setTimestamp(6, added_date);
				int status = ps.executeUpdate();
				if (status > 0) {
					session.setAttribute("fileName", fileName);
					String msg = "" + fileName + " File uploaded successfully...";
					request.setAttribute("msg", msg);
					RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
					rd.forward(request, response);
					System.out.println("File uploaded successfully...");
					System.out.println("Uploaded Path: " + uploadPath);
				}
			} catch (SQLException e) {
				out.println("Exception: " + e);
				System.out.println("Exception1: " + e);
			} finally {
				try {
					if (ps != null) {
						ps.close();
					}
					if (con != null) {
						con.close();
					}
				} catch (SQLException e) {
					out.println(e);
				}
			}

		} catch (IOException | ServletException e) {
			out.println("Exception: " + e);
			System.out.println("Exception2: " + e);
		}
	}

}
