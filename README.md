# Application Development with Java

This repository contains my solutions to the practical assignments for the course 'Application development with Java' at
TSI. The projects are intended to be executed through IntelliJ IDEA using a Java 18 JDK. However, the Spring Boot
applications may alternatively be run as Docker containers instead:

- `docker run -dp 8080:8080 daniilb/tsi-java-practice-4-exercise-1`
    - `GET /greeting?name`
- `docker run -dp 8080:8080 daniilb/tsi-java-practice-4-exercise-2`
    - `GET /books`
    - `GET /books/{id}`
- `docker run -dp 8080:8080 daniilb/tsi-java-practice-4-exercise-3`
    - `GET /meals`
    - `GET /meals/{id}`
- `docker run -dp 8080:8080 daniilb/tsi-java-practice-5`
    - `GET /products`
    - `GET /products/{id}`
