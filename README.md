# Ping Pong REST API
Simplest version of a Java EE 7 RESTful web service (JAX-RS).

## Request
Request when deployed into a TomEE+ application server.
``
GET http://localhost:8080/PingPong/api/ping
```

## Response
```
{
    "message": "Welcome to the spectacular ping pong show!",
    "timestamp": 1465590956283
}
```