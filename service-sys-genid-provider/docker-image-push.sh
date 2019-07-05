#!/bin/bash

#构建docker 镜像并上传到私服
mvn clean install dockerfile:build
sleep 3
mvn clean install dockerfile:push
