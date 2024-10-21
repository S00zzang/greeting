#!/bin/bash

SERVER_NAME=greeting
SERVER_VER=0.1.0
DOCKER_ID=s00zzang

# 도커 컨테이너가 실행중인지 확인
if [ $(docker ps -q -f name=$SERVER_NAME) ]; then

  # 실행 중인 컨테이너가 있을 경우, 컨테이너 종료
  # 도커 컨테이너 삭제
  echo "기존 도커 컨테이너의 실행을 종료합니다."
  echo "기존 도커 컨테이너를 삭제합니다."
  docker stop $SERVER_NAME; docker rm $SERVER_NAME

  # 도커 이미지 삭제
  echo "기존 도커 이미지를 삭제합니다."
  docker rmi $DOCKER_ID/$SERVER_NAME:$SERVER_VER
fi

# 도커 이미지 빌드
echo "새로운 도커 이미지를 빌드 합니다."
docker build -t $DOCKER_ID/$SERVER_NAME:$SERVER_VER .

# 도커 컨테이너 실행
echo "새로운 도커 컨테이너를 실행합니다."
docker run -d -p 7070:8080 --name $SERVER_NAME $DOCKER_ID/$SERVER_NAME:$SERVER_VER

# 정상적으로 컨테이너가 동작을 하는지 검사
echo "도커 컨테이너의 상태를 검사합니다."
if [ $(docker inspect -f '{{.State.Running}}' $SERVER_NAME) = "true" ]; then
  echo "컨테이너가 성공적으로 실행 중입니다."
else
  echo "컨테이너 실행에 실패했습니다."
fi
