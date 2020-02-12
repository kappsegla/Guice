import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRepository {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
    EntityManager entityManager = factory.createEntityManager();


    public boolean add(Student s){

        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();

        return true;
    }

    public void remove(Student s){
        entityManager.remove(s);
    }


}
