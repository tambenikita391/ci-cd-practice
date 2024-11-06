FROM openjdk:21-jdk

WORKDIR /myapp

COPY . .

RUN javac AddTwoNumbers.java

CMD ["java","AddTwoNumbers"]