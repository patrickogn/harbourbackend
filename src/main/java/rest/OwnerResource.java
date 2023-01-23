package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.OwnerDTO;
import facades.OwnerFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/owner")
public class OwnerResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    private static final OwnerFacade FACADE =  OwnerFacade.getFacadeExample(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("all")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAll() {
        List<OwnerDTO> rns = FACADE.getAll();
        return Response.ok().entity(GSON.toJson(rns)).build();
    }

}