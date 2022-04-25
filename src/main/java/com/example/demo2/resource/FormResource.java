package com.example.demo2.resource;

import com.example.demo2.service.Db;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

@Path("/")
public class FormResource {
    @Path("/")
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }


    @Path("/form")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
 //   @Consumes("application/x-www-form-urlencoded")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String readForm(MultivaluedMap<String, String> datas   ) {
        return datas.toString();
    }

    @Path("/db")
    @GET
    @Produces("text/plain")
    public String db() {
        Db db1 = new Db();


        return db1.getValueFromDb(2);
    }



}