#!/usr/bin/env bash
mvn -B clean install

ARTIFACT_ID=testconnect
ARCHETYPE_VERSION='2.4.0'
ARCHETYPE_TEMP=`mktemp -d 2>/dev/null || mktemp -d -t 'mytmpdir'`
PROJECT_DIR="${ARCHETYPE_TEMP}/${ARTIFACT_ID}"

echo $ARCHETYPE_TEMP
cd "${ARCHETYPE_TEMP}"
mvn -B archetype:generate -DarchetypeGroupId=com.github.jcustenborder.kafka.connect -DarchetypeArtifactId=kafka-connect-quickstart -DarchetypeVersion=$ARCHETYPE_VERSION -Dpackage=io.confluent.examples -DgroupId=io.confluent.examples -DartifactId=$ARTIFACT_ID -DpackageName=io.confluent.examples -Dversion=1.0-SNAPSHOT
cd "${PROJECT_DIR}" 
mvn clean package
#rm -rf "${ARCHETYPE_TEMP}"
echo "${ARCHETYPE_TEMP}"