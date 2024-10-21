# Greeting Spring Boot

## GOAL
+ Study Framework for Web Application Development
+ Spring Boot(Java-based) is functions which is similar to FASTAPI(Python-based) -> Getting used to java
  
## Basic Tools
+ Getting Started Using Franchise Framework
  <details>
  https://start.spring.io/
    
  ![image](https://github.com/user-attachments/assets/59fc8b94-4d21-4fd3-9251-26b73c48935d)

</details>

+ Connecting with Jenkins
  <details>
    https://www.jenkins.io/
    
    ![image](https://github.com/user-attachments/assets/ae2d822e-4626-42d1-82f5-cb41d2e6f86c)

    ![image](https://github.com/user-attachments/assets/989496b7-f881-4413-82ca-73f814df8bab)

    ![image](https://github.com/user-attachments/assets/9c7349dc-9c01-48cb-a002-2dae915f79e8)

    ![image](https://github.com/user-attachments/assets/7180f9c9-037c-451f-bb94-28e3670c9986)

    ![image](https://github.com/user-attachments/assets/fa6ff595-2e10-481f-a785-eeb3d703ab13)

  </details>
# Usage
```
$ ./gradlew bootRun
```

or

```
$ ./gradlew build
$ java -jar build/libs/greeting-0.0.1-SNAPSHOT.jar
```

## STEP 1
```
# Remember the value you entered and then print it out
```
![image](https://github.com/user-attachments/assets/f6582fb0-a20f-42f3-9653-ff5222304615)




## STEP 2
```
# Create a FAST API that works as same
```
![image](https://github.com/user-attachments/assets/a12bc727-051b-4f9b-9742-e1801553d532)


  
## STEP 3
```
# Make People.java

# people = num(int), name(String)
# First letter of the name entered in capital letter
```

![image](https://github.com/user-attachments/assets/2fe7f35d-0292-4078-97dd-71e6dcee47f7)

## STEP 4
```
# Connecting AWS server
# Building Docker by Jenkins automatically
```

+ Connecting AWS server
  <details>
  
    ![image](https://github.com/user-attachments/assets/ae2d822e-4626-42d1-82f5-cb41d2e6f86c)

    ![image](https://github.com/user-attachments/assets/ca5afe5a-9327-486a-8d02-d0d5bdc2ed1b)

    ![image](https://github.com/user-attachments/assets/365d2a78-7375-49d4-9713-eda38f10c872)

    ![image](https://github.com/user-attachments/assets/f4114fd7-14e1-4190-8ecb-397e8f5335cd)


  </details>
  
+ Building Docker by Jenkins automatically

도커 다운
```
$ sudo apt-get update
$ sudo apt-get install apt-transport-https ca-certificates curl gnupg-agent software-properties-common
$ curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
$ sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
$ sudo apt-get update
$ sudo apt-get install docker-ce docker-ce-cli containerd.io
```

권한 부여
```
$ sudo usermod -aG docker $(whoami)
$ newgrp docker
```



