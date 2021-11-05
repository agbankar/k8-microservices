mvn clean install -DskipTests
cd order-service  && docker build -t order-service . && cd ..
cd user-service  && docker build -t user-service . && cd ..
cd authentication-service  && docker build -t authentication-service . && cd ..
kubectl apply -f definition.yml
docker rmi $(docker images | grep "^<none>" | awk "{print $3}")


