Welcome to your new Kafka Connect connector!

# Running in development

## Configuring Docker

The [docker-compose.yml](docker-compose.yml) that is included in this repository is based on the Confluent Platform Docker
images. Take a look at the [quickstart](http://docs.confluent.io/3.0.1/cp-docker-images/docs/quickstart.html#getting-started-with-docker-client)
for the Docker images. 

The hostname `confluent` must be resolvable by your host. You will need to determine the ip address of your docker-machine using `docker-machine ip confluent` 
and add this to your `/etc/hosts` file. For example if `docker-machine ip confluent` returns `192.168.99.100` add this:

```
192.168.99.100  confluent
```

## Start Docker

```
docker-compose up -d
```

## Starting your connector

Start the connector with debugging enabled.
 
```
./bin/debug.sh
```

Start the connector with debugging enabled. This will wait for a debugger to attach.

```
export SUSPEND='y'
./bin/debug.sh
```