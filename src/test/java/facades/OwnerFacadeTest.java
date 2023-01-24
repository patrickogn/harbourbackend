package facades;

import dtos.OwnerDTO;
import entities.Owner;
import entities.RenameMe;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.EMF_Creator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

class OwnerFacadeTest {

    private static EntityManagerFactory emf;
    private static OwnerFacade facade;
    private Owner o1, o2;


    @BeforeAll
    public static void setUpClass()
    {
        emf = EMF_Creator.createEntityManagerFactoryForTest();
        facade = OwnerFacade.getFacadeExample(emf);

    }

    @BeforeEach
    void setUp() {
        EntityManager em = emf.createEntityManager();

            try {
                em.getTransaction().begin();
                em.createNamedQuery("Owner.deleteAllRows").executeUpdate();
                o1 = new Owner("name","adresse1","30444005");
                o2 = new Owner("name1", "adress2","44003344");
                em.persist(o1);
                em.persist(o2);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        }

    @Test
    void getAll()
    {
        List<OwnerDTO> ownerDTOList = facade.getAll();
        int expected = 2;
        int actual = ownerDTOList.size();
        assertEquals(expected, actual);
        assertThat(ownerDTOList, containsInAnyOrder(new OwnerDTO(o1), new OwnerDTO(o2)));
    }
}