import com.google.common.base.FinalizableSoftReference;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;
import java.util.List;

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

        Student student1 = new Student();
        student1.setEmail("martin@gmail.com");
        student1.setFullname("M Test");
        student1.setPassword("test");
        entityManager.persist(student1);

        Student student2 = new Student();
        student2.setEmail("kalle@gmail.com");
        student2.setFullname("Kalle Anka");
        student2.setPassword("test");
        entityManager.persist(student2);
        entityManager.getTransaction().commit();

        //Print ID for inserted students
        System.out.println(student.getId());
        System.out.println(student1.getId());
        System.out.println(student2.getId());

        //Find student by key
        Integer primaryKey = 1;
        Student user = entityManager.find(Student.class, primaryKey);
        System.out.println(user.getEmail());
        System.out.println(user.getFullname());
        System.out.println(user.getPassword());

        //Get all students
        var query = entityManager.createQuery("SELECT s from Student s where s.id = 1");

        List<Student> list = query.getResultList();
        list.forEach(System.out::println);


//      entityManager.remove(user);
        entityManager.close();
        factory.close();
    }
}
