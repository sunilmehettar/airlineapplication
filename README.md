# qantas
airlineapplication

# Requirements
For building and running the application you need:

1. cspringframework.boot 2.7.0
2. Java SE-17
3. Gradle 7.4.1
4. Junit4

# Running the application locally
#Steps

1. checkout repository https://github.com/sunilmehettar/airlineapplication.git
2. import project in IDE - (preferred sts-4.13.0.RELEASE )
3. build project - gradle builld 
4. Add Junit 4 library to the build path
5. application default port set to 8081 (we can change it to other port if required)
6. contextPath path is set to /api
7. run spring boot app
8. application will create h2 database 'airlinedb' with required tables (airline, location & flight_schedule) (specified in /resources/schema.sql)
9. sample data will be inserted in tables (specified in /resources/data.sql) 
10. we can access he db on browser when URL http://localhost:8081/api/h2-console with username : sa password :sa
11. access api in api testing tools like postman http://localhost:8081/api/v1/flights will return all flight records which are arriving today
12. we can apply filter by airline code like  http://localhost:8081/api/v1/flights?search=AA will return all flight records which are arriving today and airline code is AA.

# authentication
 authentication is not implemented but we can use token based authentication(JWT token), basic auth, API key or Spring Security framework etc.   