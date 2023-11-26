package repositories;

import  entities.Compte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
//long type de l'entité,rj3na l compte entité