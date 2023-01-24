package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.BoatDTO;
import facades.AdminFacade;
import utils.EMF_Creator;

import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("admin")
public class AdminResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final AdminFacade FACADE =  AdminFacade.getFacadeExample(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();


    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @POST
    @Path("createboat")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes ({MediaType.APPLICATION_JSON})
    //@RolesAllowed("user")
    public String createBoat(String input) {
        BoatDTO boatDTO = GSON.fromJson(input, BoatDTO.class);
        BoatDTO newBoat = FACADE.create(boatDTO);
        return GSON.toJson(newBoat);
    }
}