package web;

import entities.Compte;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import repositories.CompteRepository;

import java.util.List;

@Component //Crud
@Path("localhost:8082/banque")
public class Rsrtjaxrs {
    @Autowired
    private CompteRepository compteRepository;
    @GET
    @Path("localhost:8082/comptes")
    @Transactional
    @Produces({MediaType.APPLICATION_JSON})

    public List<Compte> compteList() {return compteRepository.findAll();}
}


