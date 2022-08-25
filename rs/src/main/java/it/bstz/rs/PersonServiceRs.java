package it.bstz.rs;


import it.bstz.repository.model.Person;
import it.bstz.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/person")
public class PersonServiceRs {

    @Inject
    PersonService personService;

    @GET
    public Response listAll(){
        List<Person> personList = personService.listAll();
        return Response.ok().entity(personList).build();
    }

    @POST
    public Response persist(Person p){
        personService.persist(p);
        return Response.ok().entity(p).build();
    }
}
