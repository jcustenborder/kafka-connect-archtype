This maven quickstart is used to generate a skeleton plugin for Kafka Connect. 

```
mvn archetype:generate -DarchetypeGroupId=com.github.jcustenborder.kafka.connect -DarchetypeArtifactId=kafka-connect-quickstart -DarchetypeVersion=0.10.2.1-cp2
```

```
mvn archetype:generate -DarchetypeGroupId=com.github.jcustenborder.kafka.connect -DarchetypeArtifactId=kafka-connect-quickstart -DarchetypeVersion=0.10.2.1-cp2 -Dpackage=io.confluent.examples -DgroupId=io.confluent.examples -DartifactId=testconnect -DpackageName=io.confluent.examples -Dversion=1.0-SNAPSHOT
```

See https://search.maven.org/#search%7Cga%7C1%7Ca%3A%22kafka-connect-quickstart%22 for a list of available archetypes
