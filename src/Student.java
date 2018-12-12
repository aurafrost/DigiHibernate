import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
	String roll;
	String name;
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
