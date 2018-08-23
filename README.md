![Maven Central](https://img.shields.io/maven-central/v/com.github.jcustenborder.kafka.connect/kafka-connect-quickstart.svg)

This maven quickstart is used to generate a skeleton plugin for Kafka Connect. Look 
[here](https://search.maven.org/search?q=g:com.github.jcustenborder.kafka.connect%20AND%20a:kafka-connect-quickstart&core=gav) 
for a list of available versions.


```
mvn archetype:generate \
    -DarchetypeGroupId=com.github.jcustenborder.kafka.connect \
    -DarchetypeArtifactId=kafka-connect-quickstart \
    -DarchetypeVersion=2.0.0-cp1
```

```
mvn archetype:generate \
    -DarchetypeGroupId=com.github.jcustenborder.kafka.connect \
    -DarchetypeArtifactId=kafka-connect-quickstart \
    -DarchetypeVersion=2.0.0-cp1 \
    -Dpackage=com.github.jcustenborder.kafka.connect.test \
    -DgroupId=com.github.jcustenborder.kafka.connect \
    -DartifactId=testconnect \
    -DpackageName=com.github.jcustenborder.kafka.connect.test \
    -Dversion=1.0-SNAPSHOT
```

