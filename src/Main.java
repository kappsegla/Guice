import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
      //  Injector injector = Guice.createInjector(new BillingModule());
      //  BillingService billingService = injector.getInstance(BillingService.class);


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        Student student = new Student();
        student.setEmail("test@gmail.com");
        student.setFullname("Test Test");
        student.setPassword("test");
        entityManager.persist(student);
        entityManager.getTransaction().commit();




        Integer primaryKey = 1;
        Student user = entityManager.find(Student.class, primaryKey);

        System.out.println(user.getEmail());
        System.out.println(user.getFullname());
        System.out.println(user.getPassword());

        entityManager.remove(user);

        entityManager.close();
        factory.close();
    }
}
