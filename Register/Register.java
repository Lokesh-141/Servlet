package com.user;
import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.*;
@MultipartConfig
public class Register extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			String name = request.getParameter("user_name");
			String email = request.getParameter("user_email");
			String password = request.getParameter("user_password");
			Part part = request.getPart("image");
			String filename = part.getSubmittedFileName();
			//out.println(filename);
			try {
				Thread.sleep(3000);
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
				String q = "insert into user(name,password,email,imageName) values (?,?,?,?)";
				
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				pstmt.setString(3, email);
				pstmt.setString(4, filename);
				pstmt.executeUpdate();
				
				InputStream is = part.getInputStream();
				byte[] data = new byte[is.available()];
				is.read(data);
				String path = getServletContext().getRealPath("/") + "img" + File.separator + filename;
				//out.println(path);
				FileOutputStream fos = new FileOutputStream(path); 
				fos.write(data);
				fos.close();
				out.println("done");
			} catch (Exception e) {
				e.printStackTrace();
				out.println("error");
			}
		}
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


}
