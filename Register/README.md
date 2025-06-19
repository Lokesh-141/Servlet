# 📘 Register – Servlet-based File Upload Web App

A basic Java Servlet web application that allows users to register by submitting their name, email, password, and an image. User details are stored in a MySQL database, and uploaded images are saved to the local server.

---

## 📁 Folder Structure

```
Register/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── user/
│       │           └── Register.java         # Servlet handling registration logic and file upload
│       └── webapp/
│           ├── index.html                    # Empty placeholder
│           ├── register.jsp                  # Empty placeholder
│           ├── WEB-INF/
│           │   ├── web.xml                   # Servlet & welcome configuration
│           │   └── lib/
│           │       └── mysql-connector-java-<version>.jar
│           └── img/
│               └── free-nature-images.jpg    # Background image used in UI
└── README.md
```

📝 **Notes:**

* `index.html` and `register.jsp` are **not** used in the application logic.
* All functionality is built into the `Register` servlet and used via a single dynamic form.

---

## 🌟 Features

* Uploads name, password, email, and image using AJAX
* Handles file upload via `@MultipartConfig`
* Stores uploaded image to server's `img/` folder
* Inserts user data into MySQL database (`youtube.user` table)
* Displays loader + success/error message using Materialize CSS and jQuery

---

## ⚙️ web.xml Setup (Declarative Servlet Config)

`web.xml`:

```xml
 <display-name>Register</display-name>

  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
  </welcome-file-list>

  <servlet>
    <servlet-name>Register</servlet-name>
    <servlet-class>com.user.Register</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>Register</servlet-name>
    <url-pattern>/Register</url-pattern>
  </servlet-mapping>
```

---

## 🛠️ Setup Instructions

1. **Download MySQL Connector JAR**

   * Place inside: `src/main/webapp/WEB-INF/lib/`
   * [Download link](https://dev.mysql.com/downloads/connector/j/)

2. **Create Database and Table**

```sql
CREATE DATABASE youtube;
USE youtube;

CREATE TABLE user (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  password VARCHAR(50),
  email VARCHAR(100),
  imageName VARCHAR(100)
);
```

3. **Update DB connection in Register.java**

```java
Connection con = DriverManager.getConnection(
  "jdbc:mysql://localhost:3306/youtube", "root", "root");
```

4. **Run the Project**

   * Import into Eclipse as a Dynamic Web Project
   * Deploy to Apache Tomcat
   * Open: `http://localhost:8080/Register/signup.jsp`

---

## ⚖️ License

Licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0)

---
