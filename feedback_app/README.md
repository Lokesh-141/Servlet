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
```
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
│   │       └── application.properties              # Spring-compatible placeholder (unused here)
│   └── webapp/
│       ├── css/
│       │   └── style.css                           # Custom styling for pages
│       ├── feedback.jsp                            # Feedback form page
│       ├── index.jsp                               # Landing page with navigation buttons
│       ├── header.jsp                              # Bootstrap navbar reused across pages
│       ├── links.jsp                               # Bootstrap CSS & custom style includes
│       ├── script.jsp                              # Bootstrap JS includes
│       └── WEB-INF/
│           └── web.xml                             # Configures servlets and context parameters
├── pom.xml                                          # Maven config (Servlet + JSP dependencies)
└── README.md                                        # Project documentation (this file)
```


---

## 📑 Servlet Endpoints

### `/feedback` — `FirstServlet.java`
- Accepts form submission via POST
- Extracts `email`, `phone`, `feedback_message`
- Responds with HTML showing submitted data

---

### `/servlet1` — `Request1Servlet.java`
- Sets cookies: `username`, `userid`
- Creates session attribute `userSecret`
- Reads:
  - `ServletConfig` param: `userName`
  - `ServletContext` param: `app_name`
- Displays values in HTML response

---

### `/servlet2` — `Request2Servlet.java`
- Reads cookies set by `/servlet1`
- Fetches session attribute `userSecret`
- Displays cookie/session/context values
- Gracefully handles missing cookies or sessions

---

## ⚙️ `web.xml` Setup (Declarative Servlet Config)

Located in `src/main/webapp/WEB-INF/web.xml`:

```xml
<context-param>
  <param-name>app_name</param-name>
  <param-value>FeedbackApp</param-value>
</context-param>

<servlet>
  <servlet-name>servlet1</servlet-name>
  <servlet-class>feedback_app.session.manage.Request1Servlet</servlet-class>
  <init-param>
    <param-name>userName</param-name>
    <param-value>Durgesh</param-value>
  </init-param>
</servlet>
<servlet-mapping>
  <servlet-name>servlet1</servlet-name>
  <url-pattern>/servlet1</url-pattern>
</servlet-mapping>

<servlet>
  <servlet-name>servlet2</servlet-name>
  <servlet-class>feedback_app.session.manage.Request2Servlet</servlet-class>
  <init-param>
    <param-name>userEmail</param-name>
    <param-value>durgesh@gmail.com</param-value>
  </init-param>
</servlet>
<servlet-mapping>
  <servlet-name>servlet2</servlet-name>
  <url-pattern>/servlet2</url-pattern>
</servlet-mapping>

---

## ⚖️ License

Licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0)

---


---

## ⚖️ License

Licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0)

---
