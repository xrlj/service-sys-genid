#!/bin/bash
APP_NAME_ROOT=service-sys-genid
APP_NAME_PROVIDER=${APP_NAME_ROOT}-provider
cd ..
mvn clean install -U
cd ${APP_NAME_PROVIDER}
#构建docker 镜像并上传到私服
mvn clean install dockerfile:build && mvn clean install dockerfile:push
