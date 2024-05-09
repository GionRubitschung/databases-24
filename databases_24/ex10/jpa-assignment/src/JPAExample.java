import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPAExample {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("university");
        EntityManager em = factory.createEntityManager();

        TypedQuery<Instructor> q1 =
                em.createQuery("SELECT e FROM Instructor e", Instructor.class);
        List<Instructor> instructorList = q1.getResultList();

        for (Instructor instructor : instructorList) {
            System.out.println(instructor);
        }

        em.close();
        factory.close();
    }

}