package org.tw.spike.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
public class BulletinService {

    private static List<Post> posts = new ArrayList<Post>();

    static {
        posts.add(new Post("Politics", "Politics lorem ipsum"));
        posts.add(new Post("Sports", "Sports lorem ipsum"));
        posts.add(new Post("Tech", "Tech lorem ipsum"));
    }

    @GET
    @Path("/post")
    @Produces(APPLICATION_JSON)
    public List<Post> post() {
        return posts;
    }

    @POST
    @Path("/post")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Post post(Post post) {
        posts.add(post);
        return post;

    }
}
