docker stop logging_elasticsearch_1 logging_kibana_1
kubectl delete svc  authentication-service-s order-service-s user-service-s
#sleep 10s
#kubectl delete deployment apigateway-service order-service user-service authentication-service
kubectl delete deployment authentication-service-d order-service-d  user-service-d
docker  container prune -f
docker image prune -f
#docker rmi $(docker images | grep "^<none>" | awk "{print $3}")
