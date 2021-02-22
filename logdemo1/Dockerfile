FROM openjdk:8-jdk-alpine
EXPOSE 8081
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /logdemo1/lib
COPY ${DEPENDENCY}/META-INF /logdemo1/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /logdemo1
ENTRYPOINT ["java","-cp","logdemo1:logdemo1/lib/*","com.example.demo1.Logdemo1Application"]