# Prograstination

URL with website:
194.5.159.164

Heroku:
https://grecha-back.herokuapp.com/swagger-ui.html

После первого запроса Heroku просыпается, так что надо немного подождать.
Поисковик работает с более 7000 продуктов. 
Для этого надо в верхнеп поле ввести слово или можно только пару букв "Ба" для нахождения багетов, к примеру.
Если ничего не находит, то предлагает стандартную страницу с гречкой.
При пролистывании вниз и нажатии на стрелки, подгружается больше продуктов.


To build the project following requirements should be met:
* Installed Oracle JDK 8

Internally I use:
* Postgres

To assemble JAR, in the project root directory run:
```bash
mvn clean package
```

Build generate following artifacts:
- executable jar file prograstination-1.0-SNAPSHOT.jar


To run execute 
```bash
java -jar target/prograstination-1.0-SNAPSHOT.jar
```