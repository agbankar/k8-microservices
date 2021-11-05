kubectl delete svc  authentication-service-s order-service-s user-service-s
#sleep 10s
kubectl delete deployment order-service user-service authentication-service
docker rmi  user-service:latest order-service:latest authentication-service
#docker rmi $(docker images | grep "^<none>" | awk "{print $3}")
