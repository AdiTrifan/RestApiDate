package com.company;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Date;

public class RestService {

    @Path("rest")
    public class RestServiceApp {

        @GET
        public Response rest(){
            return Response.ok("<h1>" + new Date() + "</h1>").build();

        }
//this is a comment

    }
}
