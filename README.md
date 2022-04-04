# Technology used:

**Project:** Maven project

**SpringBoot Version:** 2.6.5

**Java:** 8

**Editor or IDE**: Eclipse

# How to create Maven Project in Eclipse?

First, create a project with a spring boot initializer and unzip in a specific path of file explorer then follow the below steps in eclipse:

1) Go to File Menu.
2) Click on **import**.
3) Click on **Existing Maven Projects**.
4) Browse the path of your project which is created by the spring-boot initializer.
5) Click on **Finish**.

# How to run the application in Eclipse?

First, build and then run an application using the following steps: 

 Build application:
1) Right Click on your project in Project Explorer.
2) Click on **Run As**.
3) Click on **Run Configurations...**
4) Click on **Maven Build** (In the left panel of opened dialog)
5) Provide a **Name** of the configuration.
6) Click on **Workspace** and select your project.
7) Write **"clean -X install"** in Goals.
8) Click on **Apply**.
9) Click on **Run**.

Run application:
1) Right-click on **src/main/java** package of your project in Project Explorer.
2) Click on **Run As**.
3) Click on **Java Application**.
4) Write **localhost:8080** in the browser. (We can change the port by using application.properties file, the Default port is 8080)
# Dependencies:

```
          <dependency>
		  <groupId>org.springframework.boot</groupId>
		  <artifactId>spring-boot-starter-web</artifactId>
	  </dependency>
  ```
  
  
