FROM openjdk:17
COPY ./src/deployments/ /tmp/src/deployments/
COPY ./src/conf/TestbedConfig.json /tmp/src/conf/TestbedConfig.json
COPY ./datasets/ /tmp/datasets/
COPY ./output/ /tmp/output/
COPY ./EdgeNode.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar","EdgeNode.jar"]
CMD ["0"]
