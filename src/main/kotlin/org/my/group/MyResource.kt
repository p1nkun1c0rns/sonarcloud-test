package org.my.group

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class MyResource {

    // TODO: foobar
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
}
