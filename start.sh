#!/bin/bash

# Start the application
nohup java \
	-jar build/libs/greeting-0.1.0-SNAPSHOT.jar &

echo "> Application started with PID $!"
