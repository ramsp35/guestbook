FROM openjdk:17
RUN mkdir /app
ADD target/guestBook.jar /app/guestBook.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/guestBook.jar" ]