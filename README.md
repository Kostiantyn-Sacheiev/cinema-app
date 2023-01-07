 # ![image_processing20201215-3477-1ey2kds](https://user-images.githubusercontent.com/110487085/211168230-d56e37fd-e53c-4874-a4f5-528c633061ca.png) ﻿cinema-app
 
This application is logic for create WEB server for sale tickets in cinema hall.
 
 # Functional:

- Register new user
- Authentication and login (using email and password)
- Authorisation in role (there are two roles: admin and user)
- Handles exception. Supply exception (like a incorrect password or login) in easy message
- User can perform all CRUD operations on all application objects.

# Endpoints: 
- [GET]

   /cinema-halls - returns all cinema halls

   /movies - returns list of movies

   /movie-sessions/available - returns all movies who's going in certain day

   /orders - returns user's order history

   /shopping-carts/by-user - return shopping cart of user

   /users/by-email - return user by email

- [POST] 

   /register - register new use

   /cinema-halls - create new cinema hall

   /movies - create new movie

   /movie-sessions - create new movie session

   /orders/complete - complete order

- [PUT]

   /movie-sessions/{id} - update movie session

   /shopping-carts/movie-sessions - add movie session to shopping cart

- [DELETE]

   /movie-sessions/{id} - delete movie session
   
# Structure

The project uses following N-tier architecture:

-Data Access Layer (DAO tier)
-Application layer (service tier)
-Security level (security tier)

And next packing structure:

- config. Store Spring configuration and AppConfig for Hibernate
- controller. There are all endpoints there
- dao. Layer to work with DB
- dto. There are wrappers for models to make request and response in controller
- lib. Custom annotations with realization for walidate access data(email and password)
- model. Enteties for database
- service. Contains services for realize logic and application and authentication

# Technologies:

- Java 17
- Apache Maven
- Apache Tomcat 9.5.0
- Spring WEB MVC
- Spring Security
- Hibernate 
- MySQL

# How to using 
