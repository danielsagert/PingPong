/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fishskin.pingpong.boundary;

import de.fishskin.pingpong.control.PongProducer;
import de.fishskin.pingpong.entity.Pong;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ping")
@Produces("application/json")
public class PingResource {

    @Inject
    PongProducer pongProducer;

    @GET
    public Pong ping() {
        return pongProducer.getPong();
    }
}
