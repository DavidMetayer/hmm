/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msgpackage;

import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.DELETE;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author c0640891
 */
@ApplicationScoped
@Path("messages")
public class MessageService {
    Message unique = new Message();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MessageService
     */
    public MessageService() {
    }

    /**
     * Retrieves representation of an instance of msgpackage.MessageService
     * @return an instance of java.lang.String
     */
    MessageController newMsgCtrl = new MessageController();
    
    @GET
    @Produces("application/json")
    @Path("messages")
    public JsonArray getAll() {
        JsonArrayBuilder json = Json.createArrayBuilder();        
        for(Message unique : newMsgCtrl.getAll()){
            json.add(Json.createObjectBuilder()
                    .add("id", unique.getId())
                    .add("contents",unique.getContents())
                    .add("title", unique.getTitle())
                    .add("author", unique.getAuthor())
                    .add("senttime",unique.getTimeString()));
        }
        return null;
    }
    @GET
    @Produces("application/json")
    @Path("{id}")
    public Message getById(@PathParam("id")int id){
        return newMsgCtrl.getById(id);
    }
    
    @GET
    @Produces("applicaton/json")
    @Path("{startDate}/{endDate}")
    public Message getDateByRange(@PathParam("startDate")Date start,@PathParam("endDate") Date end){
        return newMsgCtrl.getByDate(start,end);
    }
    
    
    @POST
    @Produces("application/json")
    @Path("{/}")
    public JsonArray insert(JsonArray json){
        
        return json;
    }
    
    
    
    @PUT
    @Consumes("application/json")
    @Path("{id}")
    public String putJson(String content) {
        return "";
    }
    
    
    @DELETE
    @Consumes("application/json")
    @Path("{id}")
    public String removeMessage(@PathParam("id") int id){
        
        return "200 OK";
    }
}
