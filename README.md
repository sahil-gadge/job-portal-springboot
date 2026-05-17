\# Job Portal Application (Spring Boot)



\## 📌 Description

This is a Spring Boot RESTful Job Portal application that allows users to manage job postings with secure access and performance monitoring.



\---



\## 🚀 Features

\- Add, Update, Delete Job Posts

\- Search Jobs by Keyword

\- REST APIs

\- Spring Security (Basic Authentication)

\- AOP Logging \& Performance Monitoring

\- Input Validation using AOP

\- JPA with Database Integration



\---



\## 🏗️ Architecture

\- REST Controller Layer

\- Service Layer

\- Repository Layer

\- AOP Layer (Logging, Performance, Validation)

\- Security Layer (Authentication)



\---



\## 🛠️ Tech Stack

\- Java

\- Spring Boot

\- Spring Data JPA

\- Spring Security

\- AOP (Aspect-Oriented Programming)

\- Hibernate

\- PostgreSQL / H2

\- Maven



\---



\## 🔐 Security

\- Basic Authentication

\- Password encryption using BCrypt



\---



\## 📊 AOP Features

\- LoggingAspect → logs method calls

\- PerformanceMonitorAspect → tracks execution time

\- ValidationAspect → validates inputs dynamically



\---



\## 📡 API Endpoints



\- `GET /jobPosts`

\- `GET /jobPost/{id}`

\- `POST /jobPost`

\- `PUT /jobPost`

\- `DELETE /jobPost/{id}`

\- `GET /jobPosts/keyword/{keyword}`



\---



\## ▶️ How to Run



1\. Configure database in `application.properties`

2\. Run Spring Boot application

3\. Use Postman for API testing

4\. Provide Basic Auth credentials



\---



