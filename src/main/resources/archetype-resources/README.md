# Introduction

Welcome to your new Kafka Connect plugin!

# Running in development

## Configuring Docker

The [docker-compose.yml](docker-compose.yml) that is included in this repository is based on the Confluent Platform Docker
images. Take a look at the [quickstart](http://docs.confluent.io/current/cp-docker-images/docs/quickstart.html#getting-started-with-docker-client)
for the Docker images. 

Your development workstation needs to be able to resolve the hostnames that are listed in the `docker-compose.yml` 
file in the root of this repository. If you are using [Docker for Mac](https://docs.docker.com/v17.12/docker-for-mac/install/)
your containers will be available at the ip address `127.0.0.1`. If you are running docker-machine
you will need to determine the ip address of the virtual machine with `docker-machine ip confluent`
to determine the ip address.

```
127.0.0.1 zookeeper
127.0.0.1 kafka
127.0.0.1 schema-registry
```

## Start Docker

```
docker-compose up -d
```

## Starting your connector

The debug script assumes that `connect-standalone` is in the path on your local workstation. Download 
the latest version of the [Kafka](https://www.confluent.io/download/) to get started.


Start the connector with debugging enabled.
 
```
./bin/debug.sh
```

Start the connector with debugging enabled. This will wait for a debugger to attach.

```
export SUSPEND='y'
./bin/debug.sh
```