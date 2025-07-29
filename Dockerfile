FROM openjdk:21
EXPOSE 8080
ADD target/springboot-githubaction-cicd.jar springboot-githubaction-cicd.jar
ENTRYPOINT ["java", "-jar", "springboot-githubaction-cicd.jar"]