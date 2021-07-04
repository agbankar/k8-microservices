#k8-Architecure with springboot and local kubernetes cluster:
We are going to create two services i.e. user-service and order-service with springboot and deploy it on local kubernetes cluster.
1. user-service will be type of nodeport  i.e. this service will be accessible form th outer world.
, user-service make rest call to order-service.  
2. order-service is another springboot application which is deployed as ClusterIP in the local kubernetes cluster
3. kubernetes service discovery will take care of discovering order-service by name when user-service makes call to it
4. logs of the user-service will be sent to centralized logging system which is set up with elastic search and Kibana
5. Fluentd is responsible to send the logs , it is set up as Damemonset object in the k8, it collects logs
from all the running pods and push it to elastic search .


# Service Ports:

- User-service: 31001
- Authentication-service: 31003
- Elastic-search: 9200
- Kibana: 5601


# Services

- ### User service:

*curl --location --request GET 'http://localhost:31001/users/getUser/1'

# Local set up
1. create local kubernetes cluster by opening docker desktop and navigate to settings --> Kubernetes --> Enable kubernetes --> Apply and restart
2. Once the cluster is ready run ./initcluster.sh
3. To clear the cluster resources run ./cleanupcluster.sh
