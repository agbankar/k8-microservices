kubectl delete svc  apigateway-service-s authentication-service-s order-service-s user-service-s
#sleep 10s
kubectl delete deployment apigateway-service order-service user-service authentication-service
docker  container prune -f &&  docker image prune -f
#docker rmi $(docker images | grep "^<none>" | awk "{print $3}")
