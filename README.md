ru text
#  **Stream API и Optional**

> Домашнее задание урока 2.8. Stream API и Optional.
Цель сегодняшней домашней работы — научиться менять реализацию через циклы на Steam API.

**Внимание!** В этой домашней работе вам понадобятся данные из курсовой.
> 

Шаг 1. Добавить в поле Employee поля «Зарплата» и «Отдел» из курсовой работы.

Шаг 2. В текущий проект на Spring перенести методы работы с отделами из курсовой работы. 

Шаг 3. Заменить реализацию через циклы на Stream API. Написать новый контроллер и сервис, которые будут:

1. Возвращать сотрудника с максимальной зарплатой на основе номера отдела, который приходит в запрос из браузера.
    
    ```java
    /departments/max-salary?departmentId=5
    ```
    
2.  Возвращать сотрудника с минимальной зарплатой на основе номера отдела.
    
    ```java
     /departments/min-salary?departmentId=5 
    ```
    
3. Возвращать всех сотрудников по отделу. 
    
    ```java
    /departments/all?departmentId=5
    ```
    
4. Возвращать всех сотрудников с разделением по отделам.
    
    ```java
     /departments/all
    ```


eng text

# **Stream API & Optional**

> Lesson Homework 2.8. Stream API and Optional.
The purpose of today's homework is to learn how to change the implementation through loops on the Steam API.

** Attention!** In this homework, you will need data from the coursework.
> 

Step 1. Add the "Salary" and "Department" fields from the course work to the Employee field.

Step 2. To transfer the methods of working with departments from the course work to the current Spring project. 

Step 3. Replace the implementation via loops with the Stream API. Write a new controller and service that will:

1. Return the employee with the maximum salary based on the department number that comes in the request from the browser.
    
    ```java
    /departments/max-salary?departmentId=5
    ```
    
2. Return an employee with a minimum salary based on the department number.
    
    ```java
     /departments/min-salary?departmentId=5 
    ```
    
3. Return all employees in the department. 
    
    ```java
    /departments/all?departmentId=5
    ```
    
4. Return all employees divided by departments.
    
    ```java
     /departments/all
    ```
