![TSI Logo](https://tsi.lv/wp-content/uploads/2020/06/Logo_eng.png)

# Application Development with Java

This repository contains my solutions to the practical assignments for the course 'Application development with Java' at
TSI, 2022. 🧐

## Building

The project is intended to be executed through IntelliJ IDEA. To build and run this project manually, you will need:

- Java 18 JDK
- Maven
- Docker (optional)

To package the project, run the following command:

```sh
$ mvn clean package
```

At this point, the generated `.jar` should be located under the `target` directory of every submodule.

## Docker Images

The Spring Boot applications (practices 4 and 5) have already been Dockerized and uploaded to DockerHub.
You may easily run them as Docker containers using the following commands:

- `docker run -dp 8080:8080 daniilb/tsi-java-practice-4-exercise-1`
- `docker run -dp 8080:8080 daniilb/tsi-java-practice-4-exercise-2`
- `docker run -dp 8080:8080 daniilb/tsi-java-practice-4-exercise-3`
- `docker run -dp 8080:8080 daniilb/tsi-java-practice-5`

If you wish to build the Docker images locally, start by building the project with Maven, then navigate to the submodule
directory where the corresponding Dockerfile is located and run the following:

```sh
$ docker build -t <name of the image> .
$ docker run -dp 8080:8080 <name of the image>
```
