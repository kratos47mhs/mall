# Docker Getting Started Manual

## Common commands for Docker images
### Search images
- docker search java
### Download images
- docker pull java:8
- docker pull macro/eureka-server:0.0.1
### List images
docker images
### Delete images
- docker rmi java
- docker rmi -f java 
- docker rmi -f $(docker images)

## Common commands for Docker containers
### Create and start a container
docker run -d -p 91:80 nginx
### List containers
docker ps
### Stop the container
docker stop $ContainerId
### Force stop container
docker kill $ContainerId
### Start a stopped container
docker start $ContainerId
### 进入容器
- docker inspect --format "{{.State.Pid}}" $ContainerId
- nsenter --target "$pid" --mount --uts --ipc --net --pid
### Delete container
- docker rm $ContainerId
- docker rm -f $(docker ps -a -q)
### View startup error log
docker logs $ContainerIdName(或者$ContainerId)
### View the IP address of the container（172.17.0.*）
docker inspect --format '{{ .NetworkSettings.IPAddress }}' $ContainerId
### Synchronize host time to container
docker cp /etc/localtime $ContainerName:/etc/
### View docker usage cpu, memory, network, io on the host machine
- View the specified container：docker stats $ContainerName
- View all containers：docker stats -a
### Enter bash inside docker
docker exec -it $ContainerName /bin/bash

## Docker Registry
### Docker Registry 2.0 build
docker run -d -p 5000:5000 --restart=always --name registry2 registry:2
### Push to private Registry
docker push localhost:5000/macro/eureka-server:0.0.1
### Modify image label
docker tag macro/eureka-server:0.0.1 localhost:5000/macro/eureka-server:0.0.1

## Use maven to build Docker images
### Build image
- command：mvn clean package docker:build
- tip：
    Linux server needs to open remote api :vi /usr/lib/systemd/system/docker.service
    Modify to：ExecStart=/usr/bin/dockerd -H tcp://0.0.0.0:2375 -H unix://var/run/docker.sock   
### Push the image to a private Registry
- command：mvn clean package docker:build -DpushImage
- tip：
    pom.xml Modify <imageName>192.168.1.71:5000/macro/${project.artifactId}:${project.version}</imageName>
- tip：
    docker to support http:echo '{ "insecure-registries":["39.98.190.128:5000"] }' > /etc/docker/daemon.json 
### Modify the storage location of the Docker image
1. View the storage location of Docker：docker info | grep "Docker Root Dir"（The default is /var/lib/docker）
2. Shut down the Docker service：systemctl stop docker
3. Move directory to target path：mv /var/lib/docker /root/data/docker
4. Make a symbolic link：ln -s /root/data/docker /var/lib/docker

## Docker compose
### installation
1. download link：https://github.com/docker/compose/releases
2. Installation address：/usr/local/bin/docker-compose
3. Set as executable：sudo chmod +x /usr/local/bin/docker-compose
4. Test whether the installation is successful：docker-compose --version

### Install command completion tool
sudo curl -L https://raw.githubusercontent.com/docker/compose/1.22.0/contrib/completion/bash/docker-compose -o /etc/bash_completion.d/docker-compose

### Common commands
- Build, create, and start related containers：docker-compose up
- List all containers：docker-compose ps
- Delete the specified service container：docker-compose rm eureka
- Dynamically expand containers：docker-compose scale eureka=3
- Stop related container：docker-compose stop eureka
- Start the relevant container：docker-compose start eureka

### Orchestrate Spring Cloud microservices
#### The project used
- eureka-server
- hello-service
- feign-consumer
- api-gateway
#### Orchestration mode
1. Orchestrate Spring Cloud microservices：See eureka-server/docker-res/docker-compose.yml
2. Simplify orchestration of Spring Cloud microservices：See eureka-server/docker-res/docker-compose-simple.yml
3. Orchestrate a highly available registry：See eureka-server/docker-res/docker-compose-eureka.yml