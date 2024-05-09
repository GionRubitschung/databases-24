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

        TypedQuery<Instructor> q1 = em.createQuery("SELECT e FROM Department e", Department.class);
        List<Department> departments = q1.getResultList();

        for (Department department : departments) {
            System.out.println(department);
            List<Instructor> instructors = department.getInstructors();
            for (Instructor instructor : instructors) {
                System.out.println(instructor);
            }
        }

        em.close();
        factory.close();
    }
}