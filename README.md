# Service Ports:

- User-service: 31001
- Order-service: 31002
- Authentication-service: 31003
- Elastic-search: 31004
- Kibana: 31005


# Services

- ### Authentication service:

*curl --location --request GET 'http://localhost:31001/users/getUser/1'

- ### User service:

*curl --location --request GET 'http://localhost:31002/users/getUser/1'

- ### Order service:

* curl --location --request GET 'http://localhost:31003/orders/getOrder/1'
