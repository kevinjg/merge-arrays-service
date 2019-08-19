# merge-arrays-service

This simple web service merges two sorted arrays of integers via a REST endpoint.
The project was generated as a Spring Boot application.

## How to run
Ensure you have the following installed:
* [maven](https://maven.apache.org/)
* docker
* JDK 11

1) Clone this project and change to the directory.
2) Build the app jar. 
    ```
    mvn clean install
    ```
3) Build the docker image.
    ```
    docker build -t merge-arrays-service .
    ```
4) Run the docker container.
    ```
    docker run -p 8080:8080 merge-arrays-service
    ```
5) The service exposes a `/merge` endpoint. Hit [this URL](http://localhost:8080/merge?a1=1,4,5,5,6,9&a2=2,5,6,10,10,10,12) in your browser or run the following curl.
    ``` 
    curl -i http://localhost:8080/merge\?a1\=1,4,5,5,6,9\&a2\=2,5,6,10,10,10,12
    ```
   `a1` and `a2` are the two sorted arrays - change as necessary.