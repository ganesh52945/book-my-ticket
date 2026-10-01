# 🎬 Book My Ticket – Online Movie Ticket Booking System

A web-based movie ticket booking application developed using Java and Spring Boot. 
The system allows users to browse movies, select seats, make online payments, and receive booking confirmation.

## 🚀 Features

### 👤 User Module
- User registration and login
- OTP-based email verification
- Browse available movies
- View movie details
- Select seats in real time
- Book movie tickets
- Online payment
- Booking confirmation
- QR code generation for tickets

### 🔐 Admin Module
- Admin login
- Add and manage movies
- Upload movie images
- Manage movie details
- Manage bookings

## 🛠️ Technologies Used

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Frontend
- HTML
- CSS
- Bootstrap
- Thymeleaf

### Database
- MySQL

### Other Technologies
- JavaMailSender – OTP/Email verification
- Cloudinary – Movie image upload
- Razorpay – Online payment
- QR Code – Ticket generation
- Maven – Project management

## 🏗️ Project Architecture

```text
User
  ↓
Thymeleaf / HTML / CSS / Bootstrap
  ↓
Spring MVC Controller
  ↓
Service Layer
  ↓
Spring Data JPA
  ↓
Hibernate
  ↓
MySQL Database
