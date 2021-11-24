# Spring_with_Kafka
It is to create Producer and Consumer in Spring boot intergrated with Kafka

STEPS TO FOLLOW:
1. Generate your project using Spring intializr
2. Open Project in intellij
3. Configure Kafka through application.yml configuration file
4. Create a producer
5. Create a consumer
6. Create a REST controller

Then Run KAFKA using commands:
1.bin/zookeeper-server-start.sh config/zookeeper.properties
2.bin/kafka-server-start.sh config/server.properties
now create Kafka Topic using,
3.bin/kafka-topics.sh --create --topic Test-topic --bootstrap-server localhost:9092

Now,Send a POST request along with a message in POSTMAN using url:
http://localhost:8080/publish?message=Hi Vaishali

Output will be the message sent i.e. Hi Vaishaliin our case.
