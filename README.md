# Service Ports:

- Authentication-service: 31001
- User-service: 31002
- Order-service: 31002

# Services

- ### Authentication service:

*curl --location --request GET 'http://localhost:31001/users/getUser/1'

- ### User service:

*curl --location --request GET 'http://localhost:31002/users/getUser/1'

- ### Order service:

* curl --location --request GET 'http://localhost:31003/orders/getOrder/1'
