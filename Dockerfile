FROM eclipse-temurin:17
COPY target/devjen.jar devjen.jar
CMD [ "java","-jar","devjen.jar" ]