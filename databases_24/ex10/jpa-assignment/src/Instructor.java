import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Instructor {
    @Id
    private Integer id;
    private String name;
	private String dept_name;
	private float salary;

    public Instructor() {
        super();
    }

    @Override
    public String toString() {
        return "Instructor [id=" + id +
				", name=" + name +
				", dept_name=" + dept_name +
				", salary=" + salary + "]";
    }

}
