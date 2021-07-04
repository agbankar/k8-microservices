kubectl delete svc apigateway-service-s
kubectl delete deployment apigateway-service
cd api-gateway  && docker build -t apigateway . && cd ..
kubectl apply -f gateway.yml