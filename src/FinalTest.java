

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to hibernate");
		
		//to be sent to oracle using hibernate
		Student s=new Student();
		s.setName("Joe");
		s.setRoll("008");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(s); //orm - object relation mapping
		session.getTransaction().commit();
		
		session.close();
	}

}
