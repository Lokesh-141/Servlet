# Servlet

# Servlet


# Feedback Application

A simple Java web application using JSP and Servlets (Jakarta EE) that allows users to submit feedback and demonstrates cookie, session, and context parameter handling.

---

## 🌟 Features

- Feedback form collecting **Email**, **Phone**, and **Message**
- Two servlets demonstrating:
  - Cookie creation & reading
  - HTTP session usage
  - Servlet config/context parameters
- Modular JSP-based UI
- Bootstrap 5 styling

---

## 🛠 Technologies Used

- Java 17+
- Jakarta Servlet API (v6+)
- JSP
- Apache Tomcat (for deployment)
- Maven (build tool)
- Bootstrap 5 (for styling)

---

## 📁 Folder Structure & File Descriptions
<pre> ```text feedback_app/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── feedback_app/ │ │ │ │ └── FirstServlet.java # Handles POST feedback form submission │ │ │ └── feedback_app/session/manage/ │ │ │ ├── Request1Servlet.java # Sets cookies and session data (/servlet1) │ │ │ └── Request2Servlet.java # Reads cookies, session, context params (/servlet2) │ │ └── resources/ │ │ └── application.properties # Spring-compatible placeholder (unused here) │ └── webapp/ │ ├── css/ │ │ └── style.css # Custom styling for pages │ ├── feedback.jsp # Feedback form page │ ├── index.jsp # Landing page with navigation buttons │ ├── header.jsp # Bootstrap navbar reused across pages │ ├── links.jsp # Bootstrap CSS & custom style includes │ ├── script.jsp # Bootstrap JS includes │ └── WEB-INF/ │ └── web.xml # Configures servlets and context parameters ├── pom.xml # Maven config (Servlet + JSP dependencies) └── README.md # Project documentation (this file) ``` </pre>
