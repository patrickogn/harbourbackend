package facades;

import dtos.BoatDTO;
import dtos.UserDTO;
import entities.Boat;
import entities.Role;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AdminFacade {

    private static AdminFacade instance;
    private static EntityManagerFactory emf;

    public AdminFacade() {
    }

    public static AdminFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AdminFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }


    public BoatDTO create(BoatDTO bdto) {
        EntityManager em = emf.createEntityManager();
        Boat boat = new Boat(bdto.getId(), bdto.getBrand(), bdto.getImage(), bdto.getMake(), bdto.getName());
        try
        {
            em.getTransaction().begin();
            em.persist(boat);
            em.getTransaction().commit();
        }
        finally
        {
            em.close();
        }
        return new BoatDTO(boat);
    }
}
