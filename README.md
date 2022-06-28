# Kafka Producer Demo

This trivial project demonstrates how to implement a producer, powered by Spring Boot, for a Kafka cluster.

The project can be tested by starting a local Kafka cluster (see my [kafka-101-playground](https://github.com/BudWhiteStudying/kafka-101-playground) project for a one-command utility).

Once the cluster is up and running, and a topic has been defined on it, invoke this application at `http://localhost:8081/message` with a `POST` request, attaching a JSON body with the following shape
```
{
    "topicName" : "mytopic",
    "body" : "hello there"
}
```
if the topic exists, the application will produce a message for it, using the string enclosed in the `body` property of the request object.

The `application.properties` file allows to change minor configuration details such as the `bootstrap.address` property, or the port at which this application is exposed.