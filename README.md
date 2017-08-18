# Ping Pong REST API
Simplest version of a Java EE 7 RESTful web service (JAX-RS).

## Build and run
Build artifact with Maven, build Docker image and run Docker container. 
```
mvn clean install && jjs build.js && jjs run.js
```

## Interface
### Request
Request when deployed into a TomEE+ application server.
```
GET http://localhost:8080/PingPong/api/ping
```

### Response
```
{
    "message": "Welcome to the spectacular ping pong show!",
    "timestamp": 1465590956283
}
```