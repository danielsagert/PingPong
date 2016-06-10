package de.fishskin.pingpong.entity;

public class Pong {

    private String message;
    private long timestamp = System.currentTimeMillis();

    public Pong() {
    }

    public Pong(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

}
