kubectl delete svc authentication-service-s order-service-s user-service-s
kubectl delete deployment authentication-service order-service user-service
docker rmi authentication-service user-service order-service
mvn clean install -DskipTests
cd authentication-service  && docker build -t authentication-service . && cd ..
cd order-service  && docker build -t order-service . && cd ..
cd user-service  && docker build -t user-service . && cd ..
kubectl apply -f definition.yml
docker rmi $(docker images | grep "^<none>" | awk "{print $3}")


