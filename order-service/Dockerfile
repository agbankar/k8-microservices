FROM openjdk:8u181-jre
LABEL maintainer Ashish Bankar
RUN mkdir -p /opt/apps/
ADD ./target/order-service-0.0.1-SNAPSHOT.jar /opt/apps/
RUN chmod -R 775 /opt/apps/
WORKDIR /opt/apps/
EXPOSE 8080
ENTRYPOINT ["java", "-XX:MaxRAM=800m", "-jar", "/opt/apps/order-service-0.0.1-SNAPSHOT.jar"]
