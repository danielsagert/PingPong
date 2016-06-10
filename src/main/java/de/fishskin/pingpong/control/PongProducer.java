package de.fishskin.pingpong.control;

import de.fishskin.pingpong.entity.Pong;

public class PongProducer {

    public Pong getPong() {
        return new Pong("Welcome to the spectacular ping pong show!");
    }
}
