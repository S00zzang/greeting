#!/bin/bash

JAR_FILE_NAME=greeting-0.0.1-SNAPSHOT.jar

# Get the PID from the file
PID=$(pgrep -f $JAR_FILE_NAME)

if [ -z "$PID" ]; then
	echo "> 현재 구동 중인 애플리케이션이 없으므로 종료하지 않습니다."
else
	echo ">kill -9 $PID"
	kill -9 $PID
	echo "> 실행 중인 애플리케이션을 종료하고 있습니다.."
	sleep 10
fi
