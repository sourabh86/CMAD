FROM maven as build 
WORKDIR /code
COPY . . 
RUN mvn package 


FROM java:8-jre-alpine
WORKDIR /
COPY --from=build /code/target/cmad-*.jar app
EXPOSE 8080 
CMD java -jar app 

