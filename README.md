# rest-api
This repository contains the source code for a maven springboot application to GET, PUT, DELETE, POST.


Add java jdk folder of version greater than 1.8 and apache maven 3.6.3 in your working directory for running the project.


First create a database in mongodb named Megaman and add three records to the collection created, then https://start.spring.io/ create a spring boot application give the package name application name and dependencies required, here we need mongodb and web spring boot, now generate the application and a zip file of the application will be downloaded.

 These are the database records
{“
  name”: “Man”,
  “weapon”: “Rolling Cutter”,
  “weakness”: “Super Arm”
 }
 {“
  name”: “Guts Man”,
  “weapon”: “Super Arm”,
  “weakness”: “Hyper Bomb”
 }
 {“
  name”: “Fire Man”,
  “weapon”: “Fire Wave”,
  “weakness”: “Ice Slasher”
 }


Extract the zip file and open in any ide example - eclipse, visual studio code etc

I used vs code for this project 


Download apache-maven 3.6.3 and jdk-1.8 or greater than that in your working directory to run the application without bugs


In this source code Mongodb connection details and GET, PUT, DELETE, POST methods are all added

To run this application open mvwn.cmd file present in your application with terminal and type cmd in the terminal

Check whether the working directory and and the cmd path are the same, 
set PATH="c:\users\kumar\megaman\megaman\apache-maven-3.6.3\bin";%PATH% for configuring maven setup
set JAVA_HOME=c:\users\kumar\megaman\megaman\Java\jdk1.8.0_111 for java jdk working
set the path as given and enter the command 
mvn spring-boot:run
your application will start in your specified port of visual studio code eg. 8080
Enter commands like
POST ‘http://localhost:8080/bosses’
PUT ‘http://localhost:8080/bosses/5aecef5b6d55754834124df3'
GET ‘http://localhost:8080/bosses/5aecef5b6d55754834124df3’
DELETE ‘http://localhost:8080/bosses/5aecef5b6d55754834124df3’
GET ‘http://localhost:8080/bosses’

