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
feedback_app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── feedback_app/
│   │   │   │   └── FirstServlet.java               # Handles POST feedback form submission
│   │   │   └── feedback_app/session/manage/
│   │   │       ├── Request1Servlet.java            # Sets cookies and session data (/servlet1)
│   │   │       └── Request2Servlet.java            # Reads cookies, session, context params (/servlet2)
│   │   └── resources/
│   │       └── application.properties              # Placeholder
│   └── webapp/
│       ├── css/
│       │   └── style.css                           # Custom styling
│       ├── feedback.jsp                            # Feedback form UI
│       ├── index.jsp                               # Landing page
│       ├── header.jsp                              # Navbar
│       ├── links.jsp                               # Bootstrap CSS includes
│       ├── script.jsp                              # Bootstrap JS includes
│       └── WEB-INF/
│           └── web.xml                             # Servlet and context config
├── pom.xml                                          # Maven config
└── README.md                                        # Project documentation
