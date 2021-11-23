#mvn clean install -DskipTests
cd api-gateway  && docker build -t apigateway . && cd ..
cd order-service  && docker build -t order-service . && cd ..
cd user-service  && docker build -t user-service . && cd ..
cd authentication-service  && docker build -t authentication-service . && cd ..
kubectl apply -f  deployments.yml
kubectl apply -f services.yml


