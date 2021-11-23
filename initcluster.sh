docker  container prune -f
docker image prune -f
mvn clean install -DskipTests
cd api-gateway  && docker build -t apigateway . && cd ..
cd order-service  && docker build -t order-service . && cd ..
cd user-service  && docker build -t user-service . && cd ..
cd authentication-service  && docker build -t authentication-service . && cd ..
docker-compose -f deployment/logging/elk.yml up -d
sleep 40
kubectl apply -f deployment/logging/fluend.yml
sleep 20
kubectl apply -f deployment/deployments
kubectl apply -f deployment/services


