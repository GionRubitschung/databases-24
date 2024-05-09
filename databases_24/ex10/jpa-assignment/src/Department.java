import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Department {
    @Id
    private String dept_name;

    private String building;

    private float budget;

    private List<Instructor> instructors;

    public Department() {
        super();
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    @Override
    public String toString() {
        return "Department [dept_name=" + dept_name +
                ", building=" + building +
                ", budget=" + budget + "]";
    }
}
